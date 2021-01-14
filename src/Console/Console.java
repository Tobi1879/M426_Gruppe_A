package Console;

import Invoker.Invoker;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console {

    public void Console(){

    }

    public void Start(){
        System.out.printf("Geben Sie einen Command ein: ");
        ProcessInput();
    }

    private void ProcessInput(){
        Scanner scanner = new Scanner(System.in);

        Invoker invoker = new Invoker();

        try {
            String command = scanner.nextLine();
        } catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("Ungültige Eingabe!");
        }
    }

}
