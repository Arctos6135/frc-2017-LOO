// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6135.robot.subsystems;

import org.usfirst.frc.team6135.robot.RobotMap;
import org.usfirst.frc.team6135.robot.commands.*;
import com.ctre.CANTalon;
import com.ctre.CANTalon.FeedbackDevice;


/**
 *
 */
public class FuelIntake extends baseSubsystem {


    private final CANTalon intakeTalon = RobotMap.fuelIntakeTalon;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public FuelIntake()
    {
    	super("FuelIntake");
    	intakeTalon.setFeedbackDevice(FeedbackDevice.QuadEncoder);
    }
    public void initDefaultCommand() {
        setDefaultCommand(new stopIntake());
        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

	@Override
	public void set(double s) {
		intakeTalon.getEncVelocity();
		
	}

	@Override
	public double getRPM() {
		return intakeTalon.getEncVelocity();
	}
}

