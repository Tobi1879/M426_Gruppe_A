package Console;

import FileSystem.Directory;
import FileSystem.Drive;
import Invoker.Parser;
import Invoker.Invoker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {
    Boolean isRunning = true;

    public void Console() {

    }

    public void Start() {
        while(isRunning){
            Directory directory = new Directory();
            Drive drive = new Drive();
            String drivePath;
            String directoryPath = directory.getPath();

            System.out.printf(drivePath + directoryPath);
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
