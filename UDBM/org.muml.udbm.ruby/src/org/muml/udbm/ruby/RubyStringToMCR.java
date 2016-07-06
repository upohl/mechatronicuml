/*
 * generated by Fujaba - CodeGen2
 */
package org.muml.udbm.ruby;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

import org.muml.udbm.ClockConstraint;
import org.muml.udbm.ClockZone;
import org.muml.udbm.DifferenceClockConstraint;
import org.muml.udbm.SimpleClockConstraint;
import org.muml.udbm.UDBMClock;
import org.muml.udbm.clockconstraint.FalseClockConstraint;
import org.muml.udbm.clockconstraint.RelationalOperator;


public class RubyStringToMCR extends RubyStringToFed{

	/** Field i contains the upper bound for clock i. The indices are according to the HashMap 
	 * {@link clockPosition}.
	 */
	private int[] uBounds;

	/** Field i contains the lower bound for clock i. The indices are according to the HashMap 
	 * {@link clockPosition}.
	 */
	private int[] lBounds;
	
	/** Field i encodes whether the upper bound for clock i is strict (<) or not (<=). The indices are according to the HashMap 
	 * {@link clockPosition}.
	 */
	private boolean[] uBoundStrict;
	
	/** Field i encodes whether the lower bound for clock i is strict (<) or not (<=). The indices are according to the HashMap 
	 * {@link clockPosition}.
	 */
	private boolean[] lBoundStrict;
	
	/** Bit array in which entry [i][j] indicates, that clock i is 
	 * equal to clock j. The indices are according to the HashMap 
	 * {@link clockPosition}. */
	private boolean[][] equalities;
	
	/** Stores the index of a clock c in the ordered list of clocks. */
	private HashMap<UDBMClock, Integer> clockPosition;
	
	/**
	 * Create new arrays and fill the clockPosition hashmap.
	 * @param fed
	 */
	private void initializeArrays(RubyFederation fed){
		int size = fed.sizeOfClock();
		
		uBounds = new int[size];
		lBounds = new int[size];
		uBoundStrict = new boolean[size];
		lBoundStrict = new boolean[size];
		equalities = new boolean[size][size];
		clockPosition = new HashMap<UDBMClock, Integer>();
		
		//fill clockPosition map
		int index = 0;
		for(UDBMClock c : fed.orderedClocks){
			clockPosition.put(c, index);
			index++;
		}
		
		//set ubounds to -1, indicating that the bound does not exist
		for(int i = 0; i < uBounds.length; i++){
			uBounds[i] = -1;
		}
	}


	/**
	 * Parses a minimum constraint representation string returned by the
	 * server back to a ruby federation. Inside one encoded zone, all 
	 * constraints are separated by '&', the zones are separated by '|'.
	 * 
	 * Each clock variable is prefixed by the name of the context variable in the form
	 * C0.c1 for a context C0 and a clock c1.
	 * 
	 * There are different kinds of constraints:
	 *   1. Upper bound constraints, e.g. c1<=10.
	 *   2. Lower bound constraints, e.g. 5<=c1.
	 *   3. Distinct clock values, e.g. c2==0.
	 *   4. Difference clock constraints, e.g. c1-c2<=10.
	 *   5. Clock equality constraints, e.g. c1==c2.
	 * 
	 * Type 1 and 2 can occur in combination which 5 as well as 3 can occur
	 * with 5. If the zone contains only constraints of type 5, all clocks 
	 * are equal and unbounded.
	 * 
	 * Clock equality constraints will be mapped to clock difference
	 * constraints: c1==c2 <=> c1-c2==0.
	 */
	public void updateFromRubyFederationString (RubyFederation fed , String updatedRubyFederation )
	{
		initializeArrays(fed);
		
		//split zones
		String[] zonesArr = updatedRubyFederation.split("\\|");
		fed.removeAllFromClockZone();
		
		if (updatedRubyFederation.equals("false")) {
			HashSet<ClockConstraint> singleFalseConstraint = new HashSet<ClockConstraint>(1);
			singleFalseConstraint.add(new FalseClockConstraint());
			fed.addToClockZone(new ClockZone(singleFalseConstraint));
		} else {
			for (int i = 0; i < zonesArr.length; i++) {
				
				//split constraints of the current zone
				String[] constArr = zonesArr[i].substring(1,
						zonesArr[i].length() - 1).split("&");
				
				//parse constraints
				HashSet<ClockConstraint> constraints = new HashSet<ClockConstraint>();
				for (int j = 0; j < constArr.length; j++){
					String curCon = constArr[j].trim();
					
					//remove all opening and closing brackets
					curCon = removeBrackets(curCon);
					
					// simple constraints have the form 'clock op clock' or 'clock op int'
					String leftSide = null;
					RelationalOperator op = null;
					String rightSide = null; // either a clock name or an int value
					int clockValue = -1;
					
					//locate operator
					if (curCon.contains(RelationalOperator.EqualOperator.toString())){
						op = RelationalOperator.EqualOperator;
					} else if (curCon.contains(RelationalOperator.LessOrEqualOperator.toString())){
						op = RelationalOperator.LessOrEqualOperator;
					} else if (curCon.contains(RelationalOperator.LessOperator.toString())){
						op = RelationalOperator.LessOperator;
					} else if (curCon.contains(RelationalOperator.GreaterOrEqualOperator.toString())){
						op = RelationalOperator.GreaterOrEqualOperator;
					} else if (curCon.contains(RelationalOperator.GreaterOperator.toString())){
						op = RelationalOperator.GreaterOperator;
					} else {
						throw new UnsupportedOperationException("Unknown comparison operator in clock constraint: " + curCon);
					}
					
					leftSide = curCon.substring(0, curCon.indexOf(op.toString())).trim();
					rightSide = curCon.substring(curCon.indexOf(op.toString()) + op.toString().length());
					
					//if the right side end with an ")", this bracket has to be removed
					if (rightSide.endsWith(")")){
						rightSide = rightSide.substring(0, rightSide.length()-1);
					}
					
					//determine whether left or right side contain a ".", will only be the case for clocks
					int leftIndex = leftSide.indexOf(".");
					int rightIndex = rightSide.indexOf(".");
					
					//Case 1: leftIndex > -1 and rightIndex > -1 (Clock equality constraint)
					if (leftIndex > -1 && rightIndex > -1){
						//cut off context prefix => variables contain clock names, now
						leftSide = leftSide.substring(leftIndex + 1);
						rightSide = rightSide.substring(rightIndex + 1);
						
						equalities[clockPosition.get(fed.getFromClock(leftSide))][clockPosition.get(fed.getFromClock(rightSide))] = true;
						equalities[clockPosition.get(fed.getFromClock(rightSide))][clockPosition.get(fed.getFromClock(leftSide))] = true;
					} 
					//Case 2: leftIndex > -1 && rightIndex == -1 (Left side is clock or clock difference, right side is value, probably upper bound)
					else if (leftIndex > -1 && rightIndex == -1){
						
						clockValue = new Integer(rightSide);
						
						int minusIndex = leftSide.indexOf("-");
						
						//Case 2a: left side contains a minus, this is a clock difference
						if(minusIndex > -1){
							//cut out the clock names, cut off the context variable as well
							String minuend = leftSide.substring(leftIndex + 1, minusIndex);
							String subtrahend = leftSide.substring(minusIndex + leftIndex + 2);
							
							//create new difference constraint and add it to the constraint set
							constraints.add(new DifferenceClockConstraint(fed.getFromClock(minuend), fed.getFromClock(subtrahend), op, clockValue));
							
						} else {
						//Case 2b: no minus, just a constraint
						//cut off context prefix => variable contains clock name, now
							leftSide = leftSide.substring(leftIndex + 1);
							
							int arrayIndex = clockPosition.get(fed.getFromClock(leftSide));
							
							//determine based on operator whether it's an upper or lower bound, or both
							if(op == RelationalOperator.EqualOperator){
								uBounds[arrayIndex] = clockValue;
								lBounds[arrayIndex] = clockValue;
							}
							else if (op == RelationalOperator.LessOrEqualOperator){
								//upper bound
								uBounds[arrayIndex] = clockValue;
							} else if (op == RelationalOperator.LessOperator){
								//upper bound
								uBounds[arrayIndex] = clockValue;
								uBoundStrict[arrayIndex] = true;
							} else if (op == RelationalOperator.GreaterOrEqualOperator){
								//lower bound
								lBounds[arrayIndex] = clockValue;
							} else {
								//lower bound
								lBounds[arrayIndex] = clockValue;
								lBoundStrict[arrayIndex] = true;
							}
						}
					}
					//Case 3: leftIndex == -1 && rightIndex > -1 (Left side is value, right side is clock, probably lower bound)
					else if (leftIndex == -1 && rightIndex > -1){
						//cut off context prefix
						rightSide = rightSide.substring(rightIndex + 1);
						
						//transform leftSide into concrete value
						if (leftSide.startsWith("(")){
							leftSide = leftSide.substring(1);
						}
						clockValue = new Integer(leftSide);
						
						int arrayIndex = clockPosition.get(fed.getFromClock(rightSide));
						
						//if clock is on the right side, it will be an lower bound
						if(op == RelationalOperator.LessOrEqualOperator){
							lBounds[arrayIndex] = clockValue;
						}
						else if (op == RelationalOperator.LessOperator){
							//upper bound
							lBounds[arrayIndex] = clockValue;
							lBoundStrict[arrayIndex] = true;
						} else {
							throw new UnsupportedOperationException("Insufficient case diffentiation in UDBM client " + curCon); 
						}
						
					} else {
						throw new UnsupportedOperationException("Unknown type of constraint returned by UDBM server: " + curCon);
					}
					
				}//all constraints of the zone have been parsed
				
				//correct equalities
				constraints.addAll(createEqualityConstraints(fed));
				
				//create the zone
				fed.addToClockZone(new ClockZone(constraints));
			}//end of zone
		} //end of federation
	}

	/**
	 * Creates all constraints for clock being equal to other clocks as well as all constraints
	 * representing upper or lower bounds for clocks.
	 * @param fed
	 * @return
	 */
	private HashSet<ClockConstraint> createEqualityConstraints(RubyFederation fed){
		
		HashSet<ClockConstraint> result = new HashSet<ClockConstraint>();
		
		//iterate clocks in proper order
		Iterator<UDBMClock> it = fed.orderedClocks.iterator();
		int index = -1;
		while(it.hasNext()){
			UDBMClock curClock = it.next();
			index++;
			
			//check if lower bound for this clock exists
			if (uBounds[index] > -1){
				result.add(createUpperBoundConstraint(index, curClock));
			}
			
			//check if upper bound for this clock exists
			if (lBounds[index] > 0){
				//equality can't happen at this point, would have been recognized when checking for lower bounds
				//check if strict bound
				result.add(createLowerBoundConstraint(index, curClock));
			}
			
			ArrayList<Integer> equalClocks = getEqualClockIndices(index);
			for (Integer equalIndex : equalClocks){
				result.add(new DifferenceClockConstraint(curClock, fed.orderedClocks.get(equalIndex), RelationalOperator.EqualOperator, 0));
				
				//if there exist upper and/or lower bounds for the equal clock, assign
				//them to the curClock
				if (uBounds[equalIndex] > -1){
					result.add(createUpperBoundConstraint(equalIndex, curClock));
				}
				
				//check if upper bound for this clock exists
				if (lBounds[equalIndex] > 0){
					//equality can't happen at this point, would have been recognized when checking for lower bounds
					//check if strict bound
					result.add(createLowerBoundConstraint(equalIndex, curClock));
				}
			}//end for
		}//end while
		
		return result;
	}
	
	private ArrayList<Integer> getEqualClockIndices(Integer startIndex){
		Deque<Integer> toCheck = new ArrayDeque<Integer>(uBounds.length);
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		toCheck.add(startIndex);
		
		while(!toCheck.isEmpty()){
			Integer current = toCheck.removeFirst();
			
			//traverse the equalities matrix from the startIndex to the end
			for(int j = startIndex; j < equalities[current].length; j ++){
				if (equalities[current][j] == true && j != startIndex){
					if (!result.contains(j)){
						result.add(j);
						toCheck.add(j);
					}
					equalities[current][j] = false;
					equalities[j][current] = false;
				}
			}
		}
		
		return result;	
	}
	
	/**
	 * Returns an upper bound constraint assigned to the clock assignedClock with the values resulting
	 * from the given index. Will return an equality constraint if the upper bound is equal to the lower bound.
	 * Must be called before {@link createLowerBoundConstraint} is called for the same parameters.
	 * 
	 * @param index
	 * @param assignedClock
	 * @return
	 */
	private ClockConstraint createUpperBoundConstraint(int index, UDBMClock assignedClock){
		ClockConstraint result = null;
		
		//check if lower bound for this clock exists
		if (uBounds[index] > -1){
			
			//check for equality
			if (uBounds[index] == lBounds[index]){
				result = new SimpleClockConstraint(assignedClock, RelationalOperator.EqualOperator, uBounds[index]);
				lBounds[index] = 0;
				uBounds[index] = -1;
			} else {
				//check if strict bound
				if (uBoundStrict[index] == true){
					result = new SimpleClockConstraint(assignedClock, RelationalOperator.LessOperator, uBounds[index]);
					uBounds[index] = 0;
					uBoundStrict[index] = false;
				}else{
					result = new SimpleClockConstraint(assignedClock, RelationalOperator.LessOrEqualOperator, uBounds[index]);
					uBounds[index] = 0;
				}
			}
		}
		
		return result;
	}
	
	/**
	 * Returns a lower bound constraint assigned to the clock assignedClock with the values resulting
	 * from the given index. Must be called after {@link createUpperBoundConstraint} is called for the same parameters
	 * as this function will not check for equality constraints.
	 * 
	 * @param index
	 * @param assignedClock
	 * @return
	 */
	private ClockConstraint createLowerBoundConstraint(int index, UDBMClock assignedClock){
		ClockConstraint result = null;
		
		//equality can't happen at this point, would have been recognized when checking for lower bounds
		//check if strict bound
		if (lBoundStrict[index] == true){
			result = new SimpleClockConstraint(assignedClock, RelationalOperator.GreaterOperator, lBounds[index]);
			lBounds[index] = -1;
			lBoundStrict[index] = false;
		}else{
			result = new SimpleClockConstraint(assignedClock, RelationalOperator.GreaterOrEqualOperator, lBounds[index]);
			lBounds[index] = -1;
		}
		
		return result;
	}
	
	private String removeBrackets(String s) {
		  StringBuffer r = new StringBuffer( s.length() );
		  r.setLength( s.length() );
		  int current = 0;
		  for (int i = 0; i < s.length(); i ++) {
		     char cur = s.charAt(i);
		     if (cur != '(' && cur != ')') r.setCharAt( current++, cur );
		  }
		  
		  return r.substring(0, current);
		}

}
