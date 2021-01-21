package Console;

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
            System.out.printf("Geben Sie einen Command ein: ");
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
            System.out.println("Ungültige Eingabe!");
        }
    }

}
