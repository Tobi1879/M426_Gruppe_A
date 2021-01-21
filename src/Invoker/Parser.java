package Invoker;

import Commands.ExitCommand;
import Commands.SetColorCommand;
import Commands.ShellCommand;
import Commands.VerCommand;
import Factory.CommandFactory;

import java.util.List;

public class Parser {

    public List<String> ParseCommandParameters(String string){
        return null;
    }
    public ShellCommand ParseCommand(String command){
        String commandLowerCase = command.toLowerCase();
        switch(commandLowerCase){
            case "exit": {
                ExitCommand exitCommand = new ExitCommand();
                return exitCommand;
            }
            case "ver": {
                VerCommand verCommand = new VerCommand();
                return verCommand;
            }
            case "color": {
                SetColorCommand setColorCommand = new SetColorCommand();
                return setColorCommand;
            }
        }
        return null;
    }
}
