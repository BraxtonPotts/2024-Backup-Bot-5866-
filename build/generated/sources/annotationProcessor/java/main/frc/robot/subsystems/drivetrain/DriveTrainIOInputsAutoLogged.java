package frc.robot.subsystems.drivetrain;

import java.lang.Cloneable;
import java.lang.Override;
import org.littletonrobotics.junction.LogTable;
import org.littletonrobotics.junction.inputs.LoggableInputs;

public class DriveTrainIOInputsAutoLogged extends DriveTrainIO.DriveTrainIOInputs implements LoggableInputs, Cloneable {
  @Override
  public void toLog(LogTable table) {
    table.put("IsBrake", isBrake);
    table.put("LeftCurent", leftCurent);
    table.put("RightCurent", rightCurent);
    table.put("LeftAppliedPower", leftAppliedPower);
    table.put("RightAppliedPower", rightAppliedPower);
  }

  @Override
  public void fromLog(LogTable table) {
    isBrake = table.get("IsBrake", isBrake);
    leftCurent = table.get("LeftCurent", leftCurent);
    rightCurent = table.get("RightCurent", rightCurent);
    leftAppliedPower = table.get("LeftAppliedPower", leftAppliedPower);
    rightAppliedPower = table.get("RightAppliedPower", rightAppliedPower);
  }

  public DriveTrainIOInputsAutoLogged clone() {
    DriveTrainIOInputsAutoLogged copy = new DriveTrainIOInputsAutoLogged();
    copy.isBrake = this.isBrake;
    copy.leftCurent = this.leftCurent;
    copy.rightCurent = this.rightCurent;
    copy.leftAppliedPower = this.leftAppliedPower;
    copy.rightAppliedPower = this.rightAppliedPower;
    return copy;
  }
}
