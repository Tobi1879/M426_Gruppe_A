package Factory;

import Commands.*;
import Invoker.ConsoleOutputWriter;
import Invoker.IOutputWriter;

import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CommandFactory {
    public List GetCommands() {
        List<String> commandList = new ArrayList();
        commandList.add("cls");
        commandList.add("exit");
        commandList.add("mkdir");
        commandList.add("color");
        commandList.add("ver");
        commandList.add("create");
        commandList.add("cd");
        return commandList;
    }

    public ShellCommand CreateCommand(String command, List parameters) throws IOException {
        String commandLowerCase = command.toLowerCase();
        switch (commandLowerCase) {
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
                setColorCommand.setParameters(parameters);
                return setColorCommand;
            }
            case "cls": {
                ClsCommand clsCommand = new ClsCommand();
                return clsCommand;
            }
            case "mkdir": {
                MkDirCommand mkDirCommand = new MkDirCommand();
                mkDirCommand.setParameters(parameters);
                return mkDirCommand;
            }
            case "cd": {
                CDCommand cdCommand = new CDCommand();
                cdCommand.setParameters(parameters);
                return cdCommand;
            }
            case "create": {

                break;
            }
        }
        return null;
    }
}