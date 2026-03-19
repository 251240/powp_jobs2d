package edu.kis.powp.jobs2d.command;
import java.util.*;

public class ComplexCommand implements DriverCommand{
    private final List<DriverCommand> commands = new ArrayList<>();

    public void addCommand(DriverCommand command){
        commands.add(command);
    }

    @Override
    public void execute(){
        for(DriverCommand c : commands){
            c.execute();
        }
    }
}
