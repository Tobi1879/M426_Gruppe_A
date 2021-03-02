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



        String prompt = Drive.getPrompt();
        switch (destination){
            case "..":
                ;
            case "\\":
                Drive.setCurrentDirecotry(Drive.getRootDirectory());
                Drive.setPrompt(Drive.getCurrentDirecotry().getName() + "/");
                ;
            default:
                if (destination.contains(".txt")) {
                    iOutputWriter.PrintLine("Parameter kein Directory!");
                } else {
                    for (FileSystemItem fileSystemItem : fileSystemItems) {
                        if (fileSystemItem.getParentDirectory() == Drive.getCurrentDirecotry()) {
                            // name überprüefe und wenner glich isch denn das directory als currentdirectory neh
                            // isDirectory uf true setze, zum nocher überprüefe ob de Fehlermeldig musch usgeh
                            if (fileSystemItem.getName().equals(destination)) {
                                isDirectory = true;
                                Drive.setCurrentDirecotry((Directory) fileSystemItem);

                                // Prompt
                                Drive.setPrompt(prompt + Drive.getCurrentDirecotry().getName() + "/");
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
