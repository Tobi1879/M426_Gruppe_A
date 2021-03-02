package Commands;

import FileSystem.Directory;
import FileSystem.Drive;

import FileSystem.FileSystemItem;
import Invoker.IOutputWriter;

import java.util.List;

public class CDCommand extends ShellCommand {


    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String destination = this.parameters.get(0);
        Boolean isDirectory = false;
        List<FileSystemItem> fileSystemItems = Drive.getFileSystemItems();



        switch (destination){
            case "..":
                ;
            case "\\":
                ;
            default:
                if (destination.contains(".txt")) {
                    iOutputWriter.PrintLine("Parameter kein Directory!");
                } else {
                    for (FileSystemItem fileSystemItem : fileSystemItems) {
                        if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()) {
                            // name überprüefe und wenner glich isch denn das directory als currentdirectory neh
                            // isDirectory uf true setze, zum nocher überprüefe ob de Fehlermeldig
                            if (fileSystemItem.getName().equals(destination)) {
                                isDirectory = true;
                                Drive.setCurrentDirecotry((Directory) fileSystemItem);
                            }
                        }
                    }
                    if (!isDirectory){
                        iOutputWriter.PrintLine("Directory wurde nicht gefunden!");
                    }
                }
        }
    }
}
