package Commands;

import FileSystem.Directory;
import FileSystem.Drive;
import Invoker.IOutputWriter;

public class CDCommand extends ShellCommand{


    @Override
    public void Execute(IOutputWriter iOutputWriter) {

        String destination = this.parameters.get(0);

        Directory directory = new Directory();

        Drive.setCurrentDirecotry(directory);


    }

}
