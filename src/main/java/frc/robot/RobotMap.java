/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  
  //Driver controller 1
  public static final int DRIVER_CONTROLLER_1 = 0;
  public static final int LEFT_STICK1_Y = 1;
  public static final int LEFT_STICK1_X = 0;
  public static final int RIGHT_STICK1_Y = 5;
  public static final int RIGHT_STICK1_X = 4;
  public static final int LEFT_TRIG1_ID = 2;
  public static final int RIGHT_TRIG1_ID = 3;
  public static final int BUTTON1_A_ID = 1;
  public static final int BUTTON1_Y_ID = 2;
  public static final int BUTTON1_X_ID = 3;
  public static final int BUTTON1_B_ID = 4; 
  
  //Driver controller 2
  public static final int DRIVER_CONTROLLER_2 = 1;
  public static final int LEFT_STICK2_Y = 1;
  public static final int LEFT_STICK2_X = 0;
  public static final int RIGHT_STICK2_Y = 5;
  public static final int RIGHT_STICK2_X = 4;
  public static final int LEFT_TRIG2_ID = 2;
  public static final int RIGHT_TRIG2_ID = 3;
  public static final int BUTTON2_A_ID = 1;
  public static final int BUTTON2_B_ID = 2;
  public static final int BUTTON2_X_ID = 3;
  public static final int BUTTON2_Y_ID = 4;
  public static final int BUMPER_LEFT_2_ID = 5;
  public static final int BUMPER_RIGHT_2_ID =6;

  //Drive train
  public static final int MOTOR_LEFT_1_ID = 4;
  public static final int MOTOR_LEFT_2_ID = 5;
  public static final int MOTOR_RIGHT_1_ID = 2;
  public static final int MOTOR_RIGHT_2_ID = 3;
  
  //Transfer
  public static final int TRANSFER_BACK_ID = 0;
  public static final int TRANSFER_FRONT_ID = 1;
  
  //Wheel of fortune
  public static final int WHEEL_MOTOR_ID = 6;
  
  //Shooter
  public static final int RIGHT_SHOOTER_ID = 8;
  public static final int LEFT_SHOOTER_ID = 9;
  
  //Collection
  public static final int COLLECTION_ID = 7;
  
  //Pull-up 
  public static final int PULLUP_LEFT_ID = 10;
  public static final int PULLUP_RIGHT_ID = 11;

  //Motor speeds
  public static final double TRANSFER_IN_SPEED = 0.5;
  public static final double TRANSFER_OUT_SPEED = -0.5;
  public static final int SHOOTER_SPEED = 1;
  public static final double COLLECTION_IN_SPEED = 0.9;
  public static final double COLLECTION_OUT_SPEED = -0.7;
  public static final int LEFT_LIFT_SPEED = 1;
  public static final int RIGHT_LIFT_SPEED = 1;
  public static final int WHEEL_OF_FORTUINE_SPEED = 1;
  public static final double AUTO_SHOOTER_SPEED = 1;
  
  

  
  
  
  
  
  
  
  
  
  
   
  
  
  
  
  
  
  // none of the above numbers are known at this point and will be 0 until these numbers are 
  //found using the phenox tuner !!!!!!!!!!
}
