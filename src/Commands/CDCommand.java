package Commands;

import Invoker.IOutputWriter;

public class CDCommand extends ShellCommand{


    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String destination = this.parameters.get(0);
    }

}
