package frc.robot.subsystems.intake;

import org.littletonrobotics.junction.AutoLog;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

/** Add your docs here. */
public interface IntakeIO {

    @AutoLog
    class IntakeIOInputs implements LoggableInputs{
        public boolean isBrake;
        public double curent;
        public double velocity;
        public boolean beamBreak;
        public double position;
        public double appliedOutput;
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
    default void updateInputs(IntakeIOInputs inputs){}
    default void setPower(double power) {}
    default void setBrake(boolean brake) {}
}