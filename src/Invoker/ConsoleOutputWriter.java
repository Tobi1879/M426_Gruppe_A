package Invoker;

import FileSystem.Directory;
import FileSystem.Drive;
import Invoker.IOutputWriter;

public class ConsoleOutputWriter implements IOutputWriter {

    @Override
    public void Print(String text) {
        System.out.print(Drive.getPrompt()+ "> " + text);
    }

    @Override
    public void PrintLine(String text) {
        System.out.println(text);
    }
}
