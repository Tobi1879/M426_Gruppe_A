package Commands;

import FileSystem.Directory;
import FileSystem.Drive;
import FileSystem.File;
import FileSystem.FileSystemItem;
import Invoker.IOutputWriter;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class CreateCommand extends ShellCommand {


    @Override
    public void Execute(IOutputWriter iOutputWriter) throws IOException {
        String name = this.parameters.get(0);
        String content = this.parameters.get(1);

        //name überprüfen
        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();

        Boolean nameIsOk = true;

        for (FileSystemItem fileSystemItem : fileSystemItems) {
            if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()){
                if (fileSystemItem.getName().equals(name)) {
                    nameIsOk = false;
                }
            }
        }

        // Spezialfälle
        if (!name.contains(".txt")) {
            iOutputWriter.PrintLine("ungültiger Name! (.txt)");
        } else if (nameIsOk) {
            String path = Drive.getPrompt();
            File file = new File();
            //test test test test test test test
            file.setName(name);
            file.setPath(path);
            file.setParentDirectory(Drive.getCurrentDirecotry());
            file.setContent(content);

            // zum FileSystemItemList hinzufügen
            fileSystemItems.add(file);
            Drive.setFileSystemItems(fileSystemItems);
        } else {
            iOutputWriter.PrintLine("File existiert bereits!");
        }
    }
}



