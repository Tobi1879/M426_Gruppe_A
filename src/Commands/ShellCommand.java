package Commands;

import Invoker.IOutputWriter;

import java.util.List;
public abstract class ShellCommand {
    protected List<String> parameters;
    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }
    public void Execute(IOutputWriter iOutputWriter){
    }
}