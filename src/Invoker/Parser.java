package Invoker;

import Commands.*;
import Factory.CommandFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    public List<String> ParseCommandParameters(String command){
        String [] arrayOfParameters = command.split(" ");
        switch(arrayOfParameters[0].toLowerCase()){
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
            }
            case "mkdir":{
                String nameParameter = "";
                if (!(arrayOfParameters.length > 2)) {
                    nameParameter = arrayOfParameters[1];
                    List<String> parameterList = new ArrayList<>();
                    parameterList.add(nameParameter);
                    return parameterList;
                } else {
                    new ConsoleOutputWriter().PrintLine("Falscheingabe!");
                }
            }
        }
        return null;
    }
    public Boolean ParseCommand(String command){
        String commandLowerCase = command.toLowerCase();
        CommandFactory commandFactory = new CommandFactory();
        if(commandFactory.GetCommands().contains(commandLowerCase)) {
            return true;
        }
        return false;
    }
}
