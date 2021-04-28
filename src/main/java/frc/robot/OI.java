/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.FortunateWheel;
import frc.robot.commands.UpYaGoBall;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  //Driver controller 1
  private static final XboxController driverController1 = new XboxController(RobotMap.DRIVER_CONTROLLER_1);
  public static final Button bButton1 = new JoystickButton(driverController1, RobotMap.BUTTON1_B_ID);
  public static final Button xButton1 = new JoystickButton(driverController1, RobotMap.BUTTON1_X_ID);
  public static final Button yButton1 = new JoystickButton(driverController1, RobotMap.BUTTON1_Y_ID);
  public static final Button aButton1 = new JoystickButton(driverController1, RobotMap.BUTTON1_A_ID);
  //Driver controller 2
  private static final XboxController driverController2 = new XboxController(RobotMap.DRIVER_CONTROLLER_2);
  public static final Button bButton2 = new JoystickButton(driverController2, RobotMap.BUTTON2_B_ID);
  public static final Button xButton2 = new JoystickButton(driverController2, RobotMap.BUTTON2_X_ID);
  public static final Button yButton2 = new JoystickButton(driverController2, RobotMap.BUTTON2_Y_ID);
  public static final Button aButton2 = new JoystickButton(driverController2, RobotMap.BUTTON2_A_ID);

  public final Button leftBumper2 = new JoystickButton(driverController2, RobotMap.BUMPER_LEFT_2_ID);
  public final Button rightBumper2 = new JoystickButton(driverController2, RobotMap.BUMPER_RIGHT_2_ID);



  public double GetDriver1RawAxis(final int axis){ 
   return driverController1.getRawAxis(axis);
  }
  public double GetDriver2RawAxis(final int axis){
    return driverController2.getRawAxis(axis);
  }

  public OI(){
    aButton2.whenPressed(new UpYaGoBall(RobotMap.TRANSFER_IN_SPEED));
    aButton2.whenReleased(new UpYaGoBall(0));
    bButton2.whenPressed(new UpYaGoBall(RobotMap.TRANSFER_OUT_SPEED));
    bButton2.whenReleased(new UpYaGoBall(0));
    yButton2.whenPressed(new FortunateWheel(RobotMap.WHEEL_OF_FORTUINE_SPEED));
    yButton2.whenReleased(new FortunateWheel(0));

  //aButton2.whenPressed(new UpYaGoBall(0.2));
  //aButton2.whenReleased(new UpYaGoBall(0));
   

    //xButton.whenPressed(new MogveSequence());
    //xButton1.whenPressed(new MotorTest());
    //xButton1.whenReleased(new MotorTestStop());
    // this code tells to robot to do whatever MovgeSequence is when the xButton is pressed
  }
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a
  //// joystick.
  // You create one by telling it which joystick it's on and which button
  // number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenPressed(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());
}
