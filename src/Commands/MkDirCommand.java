package Commands;

import FileSystem.Directory;
import FileSystem.Drive;
import Invoker.IOutputWriter;

public class MkDirCommand extends ShellCommand {

    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String name = this.parameters.get(0);
        String path = Drive.getPrompt();
        Directory directory = new Directory();

        directory.setName(name);
        directory.setPath(path);

    }
}