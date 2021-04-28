/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class UpYaGoBall extends Command {
  double m_speed;
  public UpYaGoBall(double speeeeed) {
    requires(Robot.transfer);
    m_speed = speeeeed;
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
    Robot.transfer.setTransferPower(m_speed);
    // double rightTrigger = Robot.m_oi.GetDriver1RawAxis(RobotMap.RIGHT_TRIG2_ID);
    // boolean rightBumper = Robot.m_oi.rightBumper2.get();
    // Robot.transfer.setTransferPower(double speed);
    //double rightTrigger = Robot.m_oi.GetDriver2RawAxis(RobotMap.RIGHT_TRIG2_ID);

   // if (rightTrigger > 0.1) {
    //  new Thread() {
    //    public void run() {
    //      Robot.shooter.setShooterSpeed(1);
     //     Thread.sleep(300);
    //      Robot.transfer.setTransferPower(0.5);
    //    }.start();
    //  };
    //} else {      Robot.shooter.setShooterSpeed(0);
    //}

  // if (rightTrigger > 0.1) {
   //   Robot.transfer.setTransferPower(0.2);
   // } else {      Robot.shooter.setShooterSpeed(0);
   // }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
