package Commands;

import Invoker.IOutputWriter;

public class VerCommand extends ShellCommand {
    @Override
    public void Execute(IOutputWriter iOutputWriter){
        String version = System.getProperty("os.name");
        iOutputWriter.PrintLine("Version: " + version);
    }
}
