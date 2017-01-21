package org.usfirst.frc.team4998.robot.commands;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team4998.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;


public class Teleop extends Command {
	public Teleop(){
	requires(Robot.chassis);
	}
    protected void execute() {
    	Robot.chassis.drive (Robot.oi.getZ0(), Robot.oi.getY0());
    	}
	
	
	void smartDashboard() {
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
