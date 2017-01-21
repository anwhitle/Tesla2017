package org.usfirst.frc.team4998.robot;

/**
 * The RobotMap is a mapping from the ports sensor and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static int joystickOnePort1 = 0;
	public static int joystickTwoPort2 = 1;
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
	public static int button0 = 0;
	public static int button1 = 1;
	
	public static int chassisLeftFront = 0;
	public static int chassisLeftBack = 1;
	public static int chassisRightFront = 2;
	public static int chassisRightBack = 3;

	
	public static double deadZone = 0.15; 
	
	
	public static double encoderMaxPeriod = 0.1;
	public static int encoderMinRate = 1;
	public static double encoderDistancePerPulse = 1;
	public static boolean encoderReverseDirection = true; 
	public static int encoderSamplesToAverage = 1;
	
}
