package Commands;

import Invoker.IOutputWriter;

public class ExitCommand  extends ShellCommand {
    @Override
    public void Execute(IOutputWriter iOutputWriter){
        System.exit(0);
    }

}