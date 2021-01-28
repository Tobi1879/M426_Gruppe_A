package Invoker;

import Commands.*;
import Factory.CommandFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public List<String> ParseCommandParameters(String command){
        String [] arrayOfParameters = command.split(" ");
        switch(arrayOfParameters[0]){
            case "color": {
                String colorParameter = "";
                if (!(arrayOfParameters.length > 2)) {
                    colorParameter = arrayOfParameters[1];
                    List<String> parameterList = new ArrayList<>();
                    parameterList.add(colorParameter);
                    return parameterList;
                } else {
                    new ConsoleOutputWriter().PrintLine("Falscheingabe!");
                }
                /*String parameters = string.replace("color ");
                String[] split = string.split("");
                split.
                ArrayList<String> parameterList = Arrays.asList(split);
                return split;*/
            }
            case "mkdir":{

            }
        }
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
            case "cls": {
                ClsCommand clsCommand = new ClsCommand();
                return clsCommand;
            }
            case "mkdir": {
                MkDirCommand mkDirCommand = new MkDirCommand();
                return mkDirCommand;
            }
        }
        return null;
    }
}
