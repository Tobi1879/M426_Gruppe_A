package Commands;

import FileSystem.Drive;
import FileSystem.File;
import FileSystem.FileSystemItem;
import Invoker.ConsoleOutputWriter;
import Invoker.IOutputWriter;

import java.io.IOException;
import java.util.List;

public class DelCommand extends ShellCommand{
    @Override
    public void Execute(IOutputWriter iOutputWriter) throws IOException {
        String selectedFile = this.parameters.get(0);

        Boolean isFile = false;

        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();
        for (FileSystemItem fileSystemItem : fileSystemItems) {
            if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()){
                if (fileSystemItem.getName() == selectedFile) {
                    isFile = true;
                    fileSystemItems.remove(fileSystemItem);
                }
            }
        }

        if(isFile){
            Drive.setFileSystemItems(fileSystemItems);
        }
        else{
            iOutputWriter.PrintLine("File does not exist.");
        }

    }
}
