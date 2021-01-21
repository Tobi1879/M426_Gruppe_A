package Invoker;

import Commands.ShellCommand;

import java.util.List;

public class Invoker {

    public void ExecuteCommand(String command){
        IOutputWriter consoleOutputWriter = new ConsoleOutputWriter();
        Parser parser = new Parser();
        ShellCommand shellCommand = parser.ParseCommand(command);
        if (shellCommand != null){
            List<String> parameters = parser.ParseCommandParameters(command);
            if (parameters == null){
                shellCommand.Execute(consoleOutputWriter);
            } else {
                // PArameters
            }
        } else {
            consoleOutputWriter.PrintLine("Ungültige Eingabe\n");
        }
    }

    public void Invoker(IOutputWriter iOutputWriter){

    }

    public void AddCommand(ShellCommand shellCommand){

    }

}
