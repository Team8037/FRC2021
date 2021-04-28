/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  private CANSparkMax leftMaster = new CANSparkMax(RobotMap.MOTOR_LEFT_1_ID, MotorType.kBrushless);
  private CANSparkMax leftSlave = new CANSparkMax(RobotMap.MOTOR_LEFT_2_ID, MotorType.kBrushless);
  private CANSparkMax rightMaster = new CANSparkMax(RobotMap.MOTOR_RIGHT_1_ID, MotorType.kBrushless);
  private CANSparkMax rightSlave = new CANSparkMax(RobotMap.MOTOR_RIGHT_2_ID, MotorType.kBrushless);

  public DifferentialDrive drive = new DifferentialDrive(leftSlave, rightSlave);
  
  public DriveTrain() {
    leftMaster.follow(leftSlave);
    rightMaster.follow(rightSlave);

    //leftMaster.setInverted(true);
    //leftSlave.setInverted(true);

  }




 //Put methods for controlling this subsystem
 //here. Call these from Commands.

  public void manualDrive(double Move, double Turn){
    if (Math.abs(Move) < 0.025){
      Move = 0;
    }
    if (Math.abs(Turn) < 0.05){
      Turn = 0;
    }

    drive.arcadeDrive(Move, Turn);
  }
  @Override
  public void initDefaultCommand() {
    
   //Set the default command for a subsystem here.
   //setDefaultCommand(new MySpecialCommand());
  }
  
}
