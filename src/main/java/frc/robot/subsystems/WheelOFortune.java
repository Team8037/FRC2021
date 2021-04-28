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
import frc.robot.commands.FortunateWheel;

/**
 * Add your docs here.
 */
public class WheelOFortune extends Subsystem {
  private VictorSPX fortunateMotor = new VictorSPX(RobotMap.WHEEL_MOTOR_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new FortunateWheel(0));
    // Set the default command for a subsystem here.
  }

  public void setWheelSpeed(double speed){
    fortunateMotor.set(ControlMode.PercentOutput, speed);
  }
}
