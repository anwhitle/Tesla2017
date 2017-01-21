
package org.usfirst.frc.team4998.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CameraServer;

import org.usfirst.frc.team4998.robot.commands.ExampleCommand;
import org.usfirst.frc.team4998.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4998.robot.subsystems.Chassis;
import org.usfirst.frc.team4998.robot.commands.Teleop;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {

	
    public static Chassis chassis; //This is purely used to initialize subsystems and OI 
    public static OI oi;
   


    Command teleopCommand;
    Command autonomousCommand;
    Command autonomousCommand2;
    SendableChooser autoChooser;
    CameraServer server;
    boolean buttonValue;
    String dashData, dashData1, dashData2, dashData3, dashData4;

    
    
    public void robotInit() {
    	CameraServer.getInstance().startAutomaticCapture("cam1", 1);
    	CameraServer.getInstance().startAutomaticCapture("cam0", 0);
        //Starts the camera feed in the smart dashboard
		oi = new OI();
		chassis = new Chassis();
		teleopCommand =  new Teleop();
    }
    public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
       // if (autonomousCommand != null) autonomousCommand.start();
    	//autonomousCommand = (Command) autoChooser.getSelected();
    	
    	
    	
    	//Uses button to change between autons
    	/* buttonValue = SmartDashboard.getBoolean("DB/Button 0"); //Chooses which auton to run
    	 if (buttonValue) {
    		 SmartDashboard.putString("Auton", "SimpleAuton");
    		 autonomousCommand.start();
    	 } else {
    		 autonomousCommand2.start();
    		 SmartDashboard.putString("Auton", "SimpleAuton2");
    	 }*/
    	
    }

    
    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        teleopCommand.start();
        
        
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}