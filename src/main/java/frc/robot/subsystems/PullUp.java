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
import frc.robot.commands.Lift;

/**
 * Add your docs here.
 */
public class PullUp extends Subsystem {
  private VictorSPX pullUpLeft = new VictorSPX(RobotMap.PULLUP_LEFT_ID);
  private VictorSPX pullUpRight = new VictorSPX(RobotMap.PULLUP_RIGHT_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    //setDefaultCommand(new LeftLift(0));
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    setDefaultCommand(new Lift());
  }
  public void setRightLiftSpeed(double rspeed){
    pullUpRight.set(ControlMode.PercentOutput, rspeed);
  }
  public void setLeftLiftSpeed(double lspeed){
    pullUpLeft.set(ControlMode.PercentOutput, lspeed);
  }
}
