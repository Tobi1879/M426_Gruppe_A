package Commands;

import FileSystem.Drive;
import FileSystem.FileSystemItem;
import Invoker.IOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class DirCommand extends ShellCommand {
    @Override
    public void Execute(IOutputWriter iOutputWriter){
        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();
        List<FileSystemItem> itemsToShow = new ArrayList<>();

        for (FileSystemItem fileSystemItem : fileSystemItems) {
            if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()){
                itemsToShow.add(fileSystemItem);
            }
        }

        if (itemsToShow != null) {
            for (FileSystemItem fileSystemItem : itemsToShow) {
                iOutputWriter.PrintLine(fileSystemItem.getName());
            }
        } else {
            iOutputWriter.PrintLine("Verzeichnis leer!");
        }
    }
}
