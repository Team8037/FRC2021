/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;

public class Lift extends Command {
  public Lift() {
    requires(Robot.pullUp);
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
  double m_lspeed = Math.abs(Robot.m_oi.GetDriver2RawAxis(RobotMap.RIGHT_STICK2_Y));
  double m_rspeed = Math.abs(Robot.m_oi.GetDriver2RawAxis(RobotMap.LEFT_STICK2_Y));

    Robot.pullUp.setLeftLiftSpeed(m_lspeed);
    Robot.pullUp.setRightLiftSpeed(m_rspeed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.pullUp.setLeftLiftSpeed(0);
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
