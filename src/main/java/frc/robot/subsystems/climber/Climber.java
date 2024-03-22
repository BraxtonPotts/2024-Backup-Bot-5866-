package frc.robot.subsystems.climber;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.subsystems.climber.ClimberIO.ClimberIOInputs;

import org.littletonrobotics.junction.Logger;

public class Climber extends SubsystemBase {
  
  private final ClimberIOInputs inputs = new ClimberIOInputs();

  private ClimberIO io;

  public Climber(ClimberIO io) {
    this.io = io;
  }

  @Override
  public void periodic() {
    io.updateInputs(inputs);

    Logger.processInputs("Climber", inputs);

    if (this.getCurrentCommand() != null) {

      Logger.recordOutput("Climber/CurentCommand", this.getCurrentCommand().getName());
    } else {
      Logger.recordOutput("Climber/CurentCommand", "none");
    }
  }

  public void setWinchPower(double power) {

    io.setWenchPower(power);
  }
}
