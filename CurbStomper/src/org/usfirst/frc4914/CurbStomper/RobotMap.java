// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4914.CurbStomper;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

// 3rd Party Libraries
import com.ctre.CANTalon;
import com.ctre.CANTalon.TalonControlMode;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//hella prank penguin
	public static CANTalon driveTrainCIMRearLeft;
	public static CANTalon driveTrainCIMFrontLeft;
	public static CANTalon driveTrainCIMRearRight;
	public static CANTalon driveTrainCIMFrontRight;
	public static RobotDrive driveTrainRobotDrive41;
	public static CANTalon climberClimber;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static PowerDistributionPanel pDPPowerDistributionPanel1;
    public static SpeedController intakeIntake;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
    	// more pranks
    	driveTrainCIMRearLeft = new CANTalon(2); // rear left motor
    	driveTrainCIMFrontLeft = new CANTalon(12); // 
    	driveTrainCIMRearRight = new CANTalon(1);
    	driveTrainCIMFrontRight = new CANTalon(11);
    	driveTrainRobotDrive41 = new RobotDrive(driveTrainCIMRearLeft, driveTrainCIMFrontLeft, 
    			driveTrainCIMRearRight, driveTrainCIMFrontRight);
    	climberClimber = new CANTalon(3);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pDPPowerDistributionPanel1 = new PowerDistributionPanel(0);
        LiveWindow.addSensor("PDP", "PowerDistributionPanel 1", pDPPowerDistributionPanel1);
        
        intakeIntake = new TalonSRX(5);
        LiveWindow.addActuator("Intake", "Intake", (TalonSRX) intakeIntake);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        LiveWindow.addActuator("Climber", "Climber", climberClimber);
    }
}
