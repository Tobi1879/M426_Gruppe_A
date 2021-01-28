package Commands;

import FileSystem.Directory;
import Invoker.IOutputWriter;

public class MkDirCommand extends ShellCommand {

    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        Directory directory = new Directory();
    }
}
