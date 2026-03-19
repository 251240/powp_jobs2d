package edu.kis.powp.jobs2d.command;
import edu.kis.powp.jobs2d.Job2dDriver;

public class CircleCommandFactory{
    public static DriverCommand create(Job2dDriver driver, int cx, int cy, int r){
        ComplexCommand command = new ComplexCommand();

        int steps = 20;
        double step = 2 * Math.PI / steps;
        int startX = cx + r;
        int startY = cy;

        command.addCommand(new SetPositionCommand(driver, startX, startY));

        for(int i = 1; i <= steps; i++){
            int x = cx + (int)(r * Math.cos(i * step));
            int y = cy + (int)(r * Math.sin(i * step));
            command.addCommand(new OperateToCommand(driver, x, y));
        }

        return command;
    }
}
