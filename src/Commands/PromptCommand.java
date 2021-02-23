package Commands;

import FileSystem.Directory;
import Invoker.IOutputWriter;

public class PromptCommand extends ShellCommand{


    @Override
    public void Execute(IOutputWriter iOutputWriter){
        String currentDirectory = "";
        System.out.print(currentDirectory);
    }
}
