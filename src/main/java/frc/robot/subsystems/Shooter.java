/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.SendIt;

/**
 * Add your docs here.
 */
public class Shooter extends Subsystem {
  private VictorSPX leftShooter = new VictorSPX(RobotMap.LEFT_SHOOTER_ID);
  private VictorSPX rightShooter = new VictorSPX(RobotMap.RIGHT_SHOOTER_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    setDefaultCommand(new SendIt());
  }
  public void setShooterSpeed(double speed){
    leftShooter.set(ControlMode.PercentOutput, speed);
    rightShooter.set(ControlMode.PercentOutput, -speed);
  }
}
