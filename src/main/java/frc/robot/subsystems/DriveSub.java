/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class DriveSub extends SubsystemBase {

  private WPI_TalonSRX lMotor, rMotor;
  private DifferentialDrive arcaDrive;

  public DriveSub() {
    lMotor = new WPI_TalonSRX(Constants.LEFT_MOTOR_ID);
    rMotor = new WPI_TalonSRX(Constants.RIGHT_MOTOR_ID);

    arcaDrive = new DifferentialDrive(lMotor, rMotor);
  }

  public void Drive(double xSpeed, double zRotation) {
    arcaDrive.arcadeDrive(xSpeed, zRotation);
  }
}
