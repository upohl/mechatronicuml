/*
 * The FUJABA ToolSuite project:
 *
 *   FUJABA is the acronym for 'From Uml to Java And Back Again'
 *   and originally aims to provide an environment for round-trip
 *   engineering using UML as visual programming language. During
 *   the last years, the environment has become a base for several
 *   research activities, e.g. distributed software, database
 *   systems, modelling mechanical and electrical systems and
 *   their simulation. Thus, the environment has become a project,
 *   where this source code is part of. Further details are avail-
 *   able via http://www.fujaba.de
 *
 *      Copyright (C) 1997-2004 Fujaba Development Group
 *
 *   This library is free software; you can redistribute it and/or
 *   modify it under the terms of the GNU Lesser General Public
 *   License as published by the Free Software Foundation; either
 *   version 2.1 of the License, or (at your option) any later version.
 *
 *   You should have received a copy of the GNU Lesser General Public
 *   License along with this library; if not, write to the Free
 *   Software Foundation, Inc., 59 Temple Place, Suite 330, Boston,
 *   MA 02111-1307, USA or download the license under
 *   http://www.gnu.org/copyleft/lesser.html
 *
 * WARRANTY:
 *
 *   This library is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 * Contact adress:
 *
 *   Fujaba Management Board
 *   Software Engineering Group
 *   University of Paderborn
 *   Warburgerstr. 100
 *   D-33098 Paderborn
 *   Germany
 *
 *   URL  : http://www.fujaba.de
 *   email: info@fujaba.de
 *
 */
package de.uni_paderborn.fujaba.umlrt.model.realtimestatechart;

import de.uni_paderborn.fujaba.umlrt.model.instance.PortInstance;


/**
 * No comment provided by developer, please add a comment to improve documentation.
 *
 * @author    $Author: chrisheinzemann $
 * @version   $Revision: 3284 $ $Date: 2008-12-10 13:40:36 +0100 (Mi, 10 Dez 2008) $
 * 
 * @model
 */
public interface UMLRealtimeFadingFunction // extends ASGElement
{
	/**
	 * @model
	 */
   public String getFunction();

	/**
	 * @model
	 */
   public java.util.List<UMLRealtimeTransition> getUMLRealtimeTransitions();

	/**
	 * @model
	 */
   public float getMinDuration();

	/**
	 * @model
	 */
   public float getMaxDuration();

	/**
	 * @model
	 */
   public java.util.List<PortInstance> getPortInstances();

	/**
	 * @model
	 */
   public String getSpline1();

	/**
	 * @model
	 */
   public String getSpline2();

	/**
	 * @model
	 */
   public boolean getBreakpoint();

	/**
	 * @model
	 */
   public int getPolynomDegree();

}

/*
 * $Log$
 * Revision 1.4  2008/12/10 12:40:35  chrisheinzemann
 * made use of generics to remove many warnings
 *
 * Revision 1.3  2008/05/12 23:09:18  upohl
 * add flatness
 *
 * Revision 1.2  2007/04/16 07:53:59  sluzar
 * Alle ASGElements umgestellt
 *
 * Revision 1.1  2006/11/09 13:44:07  shenkler
 * hybrid modeling plugins
 *
 * Revision 1.4  2005/06/15 14:59:30  kudak
 * Updatemechanismus f�r Interface Statecharts
 *
 */
