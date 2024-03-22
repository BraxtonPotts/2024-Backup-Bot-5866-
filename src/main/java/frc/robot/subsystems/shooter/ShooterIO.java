package frc.robot.subsystems.shooter;

import org.littletonrobotics.junction.AutoLog;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

/** Add your docs here. */
public interface ShooterIO {
    @AutoLog
    class ShooterIOInputs implements LoggableInputs{
        public double leftCurent;
        public double rightCurent;
        public double leftVelocity;
        public double rightVelocity;
        public double leftPosition;
        public double rightPosition;
        public double leftAppliedPower;
        public double rightApppliedPower;
        public double setPoint;
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
    default void updateInputs(ShooterIOInputs inputs){}
    default void setPowers(double leftPower, double rightPower) {}
    default void setRPS(double leftRPS, double rightRPS) {}
}