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
//import frc.robot.commands.ShooterCombo;

import frc.robot.commands.UpYaGoBall;

/**
 * Add your docs here.
 */
public class Transfer extends Subsystem {
  private VictorSPX TransferBack = new VictorSPX(RobotMap.TRANSFER_BACK_ID);
  private VictorSPX TransferFront = new VictorSPX(RobotMap.TRANSFER_FRONT_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new UpYaGoBall(0));
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }

  public void setTransferPower(double speeeeed) {
    TransferBack.set(ControlMode.PercentOutput, speeeeed);
    TransferFront.set(ControlMode.PercentOutput, speeeeed);
  }
}
