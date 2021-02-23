package Factory;

import Commands.*;
import Invoker.ConsoleOutputWriter;
import Invoker.IOutputWriter;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommandFactory {
    public List GetCommands(){
        List<String> commandList = new ArrayList();
        commandList.add("cls");
        commandList.add("exit");
        commandList.add("mkdir");
        commandList.add("color");
        commandList.add("ver");
        return commandList;
    }

    public void CreateCommand(String command, List parameters){
        IOutputWriter consoleOutputwriter = new ConsoleOutputWriter();
        String commandLowerCase = command.toLowerCase();
        switch(commandLowerCase){
            case "exit": {
                ExitCommand exitCommand = new ExitCommand();
                exitCommand.Execute(consoleOutputwriter);
            }
            case "ver": {
                VerCommand verCommand = new VerCommand();
                verCommand.Execute(consoleOutputwriter);
            }
            case "color": {
                SetColorCommand setColorCommand = new SetColorCommand();
                setColorCommand.setParameters(parameters);
                setColorCommand.Execute(consoleOutputwriter);
            }
            case "cls": {
                ClsCommand clsCommand = new ClsCommand();
                clsCommand.Execute(consoleOutputwriter);
            }
            case "mkdir": {
                MkDirCommand mkDirCommand = new MkDirCommand();
                mkDirCommand.setParameters(parameters);
                mkDirCommand.Execute(consoleOutputwriter);
            }
        }
    }
}