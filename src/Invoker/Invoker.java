package Invoker;

import Commands.ShellCommand;
import Factory.CommandFactory;

import java.util.List;

public class Invoker {

    public void ExecuteCommand(String command){
        IOutputWriter consoleOutputWriter = new ConsoleOutputWriter();
        Parser parser = new Parser();
        String [] arrayOfParameters = command.split(" ");
        Boolean isCommand = parser.ParseCommand(arrayOfParameters[0]);
        if (isCommand == true && arrayOfParameters.length > 1){
            List<String> parameters = parser.ParseCommandParameters(command);
            if (parameters == null){
                consoleOutputWriter.PrintLine("Falscheingabe!");
            } else {
                CommandFactory commandFactory = new CommandFactory();
                commandFactory.CreateCommand(arrayOfParameters[0], parameters);
            }
        } else if (isCommand == true) {
            CommandFactory commandFactory = new CommandFactory();
            commandFactory.CreateCommand(arrayOfParameters[0], null);
        }
        else {
            consoleOutputWriter.PrintLine("\u001B[31mUngültige Eingabe\n\u001B[0m");
        }
    }

    public void Invoker(IOutputWriter iOutputWriter){

    }

    public void AddCommand(ShellCommand shellCommand){

    }

}
