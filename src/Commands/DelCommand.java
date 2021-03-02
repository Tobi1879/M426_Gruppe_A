package Commands;

import FileSystem.File;
import Invoker.ConsoleOutputWriter;
import Invoker.IOutputWriter;

import java.io.IOException;

public class DelCommand extends ShellCommand{
    @Override
    public void Execute(IOutputWriter iOutputWriter) throws IOException {
        File file = new File();
        String selectedFile = this.parameters.get(0);
        if(file.getName().equals(selectedFile)){
            file = null;
        }
        else{
            iOutputWriter.PrintLine("File does not exist.");
        }

    }
}
