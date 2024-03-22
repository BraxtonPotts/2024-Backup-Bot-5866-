package frc.robot.subsystems.arm;

import org.littletonrobotics.junction.AutoLog;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

/** Add your docs here. */
public interface ArmIO {
    @AutoLog
    class ArmIOInputs implements LoggableInputs{
        public boolean isBrake;
        public double curent;
        public double curentAngle;
        public double velocity;
        public double targetAngle;
        public double appliedPower;
        public double relativePos_l;
        public double relativePos_r;
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

    default void updateInputs(ArmIOInputs inputs){}
    default void setBreakMode(boolean isBrake){}
    default void setAngle(double angle){}
}