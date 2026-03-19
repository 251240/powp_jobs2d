package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class RectangleCommandFactory {
    public static DriverCommand create(Job2dDriver driver, int x, int y, int width, int height){
        ComplexCommand command = new ComplexCommand();

        command.addCommand(new SetPositionCommand(driver, x, y));
        command.addCommand(new OperateToCommand(driver, x + width, y));
        command.addCommand(new OperateToCommand(driver, x + width, y + height));
        command.addCommand(new OperateToCommand(driver, x, y + height));
        command.addCommand(new OperateToCommand(driver, x, y));

        return command;
    }
}