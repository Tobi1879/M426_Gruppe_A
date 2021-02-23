package Commands;

import Invoker.IOutputWriter;

public class PromptCommand extends ShellCommand{


    @Override
    public void Execute(IOutputWriter iOutputWriter){
        System.out.print("");
    }
}
