package Commands;

import Invoker.IOutputWriter;

public class ClsCommand extends ShellCommand{

    @Override
    public void Execute(IOutputWriter iOutputWriter){

        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
