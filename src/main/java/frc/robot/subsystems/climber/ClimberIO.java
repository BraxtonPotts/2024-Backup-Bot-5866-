// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.climber;

import org.littletonrobotics.junction.AutoLog;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

/** Add your docs here. */
public interface ClimberIO {
    @AutoLog
    class ClimberIOInputs implements LoggableInputs{
        public boolean climberisBrakeWench;
        public double climberCurrentWench;
        public double angularPosWench;
        public double appliedPowerWench;
        @Override
        public void toLog(LogTable table) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'toLog'");
        }
        @Override
        public void fromLog(LogTable table) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'fromLog'");
        }
    }

    default void updateInputs(ClimberIOInputs inputs){}
    default void setWenchPower(double power){}
    default void setBreak(boolean brake){}

}