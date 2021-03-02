package Commands;

import FileSystem.Directory;
import FileSystem.Drive;
import FileSystem.FileSystemItem;
import Invoker.IOutputWriter;

import java.util.List;

public class MkDirCommand extends ShellCommand {

    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String name = this.parameters.get(0);
        String path = Drive.getPrompt();
        Directory directory = new Directory();
        //test test test test test test test
        directory.setName(name);
        directory.setPath(path);
        directory.setParentDirectory(Drive.getCurrentDirecotry());
        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();
        fileSystemItems.add(directory);
        Drive.setFileSystemItems(fileSystemItems);
    }
}