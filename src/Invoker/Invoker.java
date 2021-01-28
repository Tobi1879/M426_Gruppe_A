package Invoker;

import Commands.ShellCommand;

import java.util.List;

public class Invoker {

    public void ExecuteCommand(String command){
        IOutputWriter consoleOutputWriter = new ConsoleOutputWriter();
        Parser parser = new Parser();
        String [] arrayOfParameters = command.split(" ");
        ShellCommand shellCommand = parser.ParseCommand(arrayOfParameters[0]);
        if (shellCommand != null && arrayOfParameters.length > 1){
            List<String> parameters = parser.ParseCommandParameters(command);
            if (parameters == null){
                consoleOutputWriter.PrintLine("Falscheingabe!");
            } else {
                shellCommand.setParameters(parameters);
                shellCommand.Execute(consoleOutputWriter);
            }
        } else {
            consoleOutputWriter.PrintLine("\u001B[31mUngültige Eingabe\n\u001B[0m");

        }
    }

    public void Invoker(IOutputWriter iOutputWriter){

    }

    public void AddCommand(ShellCommand shellCommand){

    }

}
