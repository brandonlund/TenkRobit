// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5638.TenkRobit;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.Drive.*;
import com.ctre.Mechanical.SensoredGearbox;
import com.ctre.MotorControl.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.RobotDrive;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon left1 = new CANTalon(1);
    public static CANTalon left2 = new CANTalon(2);
    public static CANTalon right1 = new CANTalon(3);
    public static CANTalon right2 = new CANTalon(4);
    public static RobotDrive driveSubdrive;
    public static DoubleSolenoid shiftSubshiftSol;
    public static SensoredTank drive;
    public static SensoredGearbox left = new SensoredGearbox(4096, left1, left2, SmartMotorController.FeedbackDevice.CtreMagEncoder_Relative);
    public static SensoredGearbox right = new SensoredGearbox(4096, right1, right2, SmartMotorController.FeedbackDevice.CtreMagEncoder_Relative);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	
        left = new SensoredGearbox(4096, left1, left2, SmartMotorController.FeedbackDevice.CtreMagEncoder_Relative);
        right = new SensoredGearbox(4096, right1, right2, SmartMotorController.FeedbackDevice.CtreMagEncoder_Relative);
        
        drive = new SensoredTank(left, right, false, true, 2, 0);
        
        driveSubdrive.setSafetyEnabled(true);
        driveSubdrive.setExpiration(0.1);
        driveSubdrive.setSensitivity(0.5);
        driveSubdrive.setMaxOutput(1.0);
        
        drive.ConfigPeakPercentOutputVoltage(12, 12);

        shiftSubshiftSol = new DoubleSolenoid(0, 0, 1);
        LiveWindow.addActuator("shiftSub", "shiftSol", shiftSubshiftSol);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
