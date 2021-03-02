package Invoker;

import Commands.ShellCommand;
import Factory.CommandFactory;

import java.io.IOException;
import java.util.List;

public class Invoker {

    public void ExecuteCommand(String command) throws IOException {
        IOutputWriter consoleOutputWriter = new ConsoleOutputWriter();
        Parser parser = new Parser();
        String [] arrayOfParameters = command.split(" ");
        Boolean isCommand = parser.ParseCommand(arrayOfParameters[0]);
        if (isCommand == true && arrayOfParameters.length > 1){
            List<String> parameters = parser.ParseCommandParameters(command);
            if (parameters == null){
                //consoleOutputWriter.PrintLine("Falscheingabe!");
                consoleOutputWriter.PrintLine("\u001B[31mUngültige Eingabe\n\u001B[0m");
            } else {
                ShellCommand shellCommand = CommandFactory.CreateCommand(arrayOfParameters[0], parameters);
                shellCommand.Execute(consoleOutputWriter);
            }
        } else if (isCommand == true) {
            ShellCommand shellCommand = CommandFactory.CreateCommand(arrayOfParameters[0], null);
            shellCommand.Execute(consoleOutputWriter);
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
