package Commands;

import Invoker.IOutputWriter;

import java.util.Properties;

public class VerCommand extends ShellCommand {
    private Object SystemUtils;

    @Override
    public void Execute(IOutputWriter iOutputWriter){

        // genaue Version herausfinden

        String name = System.getProperty("os.name");
        String version = System.getProperty("os.version");
        iOutputWriter.PrintLine(name + " Version: " + version + "\n");
    }
}
