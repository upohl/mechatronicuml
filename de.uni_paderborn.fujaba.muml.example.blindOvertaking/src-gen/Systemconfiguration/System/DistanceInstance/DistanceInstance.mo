	within Systemconfiguration.System.DistanceInstance;
model DistanceInstance
	//ComponentKind::CONTINUOUS_COMPONENT 
	//Start of user code CONTINUOUS_Declarations
 //END Protected AreaEnd of user code
		// port declarations
		Modelica.Blocks.Interfaces.RealOutput yPort(start=0)
			annotation(Placement(transformation(extent={{0, 0},{35, 20}})));;
		// end port declarations
	//Start of user code CONTINUOUS_Behavior

  Modelica.Blocks.Math.Feedback feedback
    annotation (Placement(transformation(extent={{-8,0},{12,20}})));
  Modelica.Blocks.Math.Abs abs1
    annotation (Placement(transformation(extent={{40,-2},{60,18}})));
  Modelica.Mechanics.MultiBody.Sensors.AbsoluteSensor SensorF1(
    get_r=true,
    get_w=false,
    get_angles=true,
    animation=false,
    resolveInFrame=Modelica.Mechanics.MultiBody.Types.ResolveInFrameA.world)
                     annotation (Placement(transformation(
        extent={{10,10},{-10,-10}},
        rotation=180,
        origin={-52,-46})));
  Modelica.Mechanics.MultiBody.Sensors.AbsoluteSensor SensorF2(
    get_r=true,
    get_w=false,
    get_angles=true,
    animation=false,
    resolveInFrame=Modelica.Mechanics.MultiBody.Types.ResolveInFrameA.world)
                     annotation (Placement(transformation(
        extent={{10,10},{-10,-10}},
        rotation=180,
        origin={-56,56})));
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a xpos1
    annotation (Placement(transformation(extent={{-116,42},{-84,74}})));
  Modelica.Mechanics.MultiBody.Interfaces.Frame_a xpos2
    annotation (Placement(transformation(extent={{-116,-56},{-84,-24}})));
equation
  connect(feedback.y, abs1.u) annotation (Line(
      points={{11,10},{24,10},{24,8},{38,8}},
      color={0,0,127},
      smooth=Smooth.Bezier));
  connect(abs1.y, yPort) annotation (Line(
      points={{61,8},{80,8},{80,-4},{106,-4}},
      color={0,0,127},
      smooth=Smooth.Bezier));
  connect(SensorF2.frame_a, xpos1) annotation (Line(
      points={{-66,56},{-68,56},{-68,58},{-100,58}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.Bezier));
  connect(SensorF2.r[1], feedback.u1) annotation (Line(
      points={{-66,44.3333},{-58,44.3333},{-58,10},{-6,10}},
      color={0,0,127},
      smooth=Smooth.Bezier));
  connect(xpos2, SensorF1.frame_a) annotation (Line(
      points={{-100,-40},{-82,-40},{-82,-46},{-62,-46}},
      color={95,95,95},
      thickness=0.5,
      smooth=Smooth.Bezier));
  connect(SensorF1.r[1], feedback.u2) annotation (Line(
      points={{-62,-57.6667},{-46,-57.6667},{-46,-58},{-28,-58},{-28,2},{2,2}},
      color={0,0,127},
      smooth=Smooth.Bezier));
 //END Protected AreaEnd of user code
	/* TODO Uncomment if initialization is required
	equation
		// initial continuous output port equations
		yPort = 0;
	*/	
	// end initial continuous output port equations
end DistanceInstance;
