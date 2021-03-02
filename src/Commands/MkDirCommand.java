package Commands;

import FileSystem.Directory;
import FileSystem.Drive;
import FileSystem.FileSystemItem;
import Invoker.IOutputWriter;

import java.util.ArrayList;
import java.util.List;

public class MkDirCommand extends ShellCommand {

    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String name = this.parameters.get(0);

        //name überprüfen
        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();

        Boolean nameIsOk = true;

        for (FileSystemItem fileSystemItem : fileSystemItems) {
            if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()){
                if (fileSystemItem.getName() == name) {
                    nameIsOk = false;
                }
            }
        }

        // Spezialfälle
        if (name.contains(".")) {
            iOutputWriter.PrintLine("ungültiger Verzeichnisname!");
        } else if (nameIsOk) {
            String path = Drive.getPrompt();
            Directory directory = new Directory();
            //test test test test test test test
            directory.setName(name);
            directory.setPath(path);
            directory.setParentDirectory(Drive.getCurrentDirecotry());

            // zum FileSystemItemList hinzufügen
            fileSystemItems.add(directory);
            Drive.setFileSystemItems(fileSystemItems);
        } else {
            iOutputWriter.PrintLine("Verzeichnis existiert bereits!");
        }
    }
}