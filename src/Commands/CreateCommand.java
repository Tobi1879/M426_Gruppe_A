package Commands;

import Invoker.IOutputWriter;

import java.io.*;
import java.util.Scanner;

public class CreateCommand extends ShellCommand {


    @Override
    public void Execute(IOutputWriter iOutputWriter) throws IOException {

        try
        {
            Scanner sc=new Scanner(System.in);         //object of Scanner class
            System.out.print("Geben Sie den Filenamen ein: ");
            String name=sc.nextLine();              //Variable speichert den Filenamen
            FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode
            System.out.print("Geben Sie etwas für das File ein: ");
            String str=sc.nextLine()+"\n";      //str speichert die Eingaben der File
            byte[] b= str.getBytes();       //converts string into bytes
            fos.write(b);           //writes bytes into file
            fos.close();            //close the file
            System.out.println("file saved.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}



