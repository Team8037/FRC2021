/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class FortunateWheel extends Command {
  double m_Speed;
  // this sets it so that in the MoveSequence you will put numbers in place of these
  // variables like this
  // addSequential(new Move(2, 0.5, 0.5));
  // in this case m_time is 2, m_lSpeed is 0.5, and m_rSpeed is also 0.5


  public FortunateWheel(double speed) {
    m_Speed = speed;

    // Use requires() here to declare subsystem dependencies
    requires(Robot.wheelOFortune);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    Robot.wheelOFortune.setWheelSpeed(m_Speed);
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    Robot.wheelOFortune.setWheelSpeed(0);
   
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
