package Console;

import FileSystem.Directory;
import FileSystem.Drive;
import Invoker.Parser;
import Invoker.Invoker;
import Invoker.ConsoleOutputWriter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    Boolean isRunning = true;

    public void Console() {

    }

    public void Start() {
        Directory rootDirectory = new Directory();
        rootDirectory.setName("M426:");
        rootDirectory.setPath("");
        Drive.setRootDirectory(rootDirectory);
        Drive.setPrompt(Drive.getRootDirectory().getName() + "/");
        while(isRunning){
            ConsoleOutputWriter consoleOutputWriter = new ConsoleOutputWriter();
            consoleOutputWriter.Print("");
            ProcessInput();
        }
    }

    private void ProcessInput(){
        Scanner scanner = new Scanner(System.in);

        Invoker invoker = new Invoker();

        try {
            String input = scanner.nextLine();
            invoker.ExecuteCommand(input);
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("Ungültige Eingabe!\n");

        }
    }

}
