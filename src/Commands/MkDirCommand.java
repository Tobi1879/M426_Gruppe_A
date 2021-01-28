package Commands;

import FileSystem.Directory;
import Invoker.IOutputWriter;

public class MkDirCommand extends ShellCommand {

    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String name = this.parameters.get(0);
        Directory directory = new Directory();

    }
}
