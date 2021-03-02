package Commands;

import FileSystem.File;
import Invoker.IOutputWriter;

import java.io.*;
import java.util.Scanner;

public class CreateCommand extends ShellCommand {


    @Override
    public void Execute(IOutputWriter iOutputWriter) throws IOException {

        File file = new File();

        try
        {
            Scanner sc=new Scanner(System.in);         //object of Scanner class
            iOutputWriter.Print("Geben Sie den Filenamen ein: ");
            String name=sc.nextLine();              //Variable speichert den Filenamen
            FileOutputStream fos=new FileOutputStream(name, true);  // true for append mode
            iOutputWriter.Print("Geben Sie etwas für das File ein: ");
            String str=sc.nextLine()+"\n";      //str speichert die Eingaben der File
            byte[] b= str.getBytes();       //converts string into bytes
            fos.write(b);           //writes bytes into file
            fos.close();            //close the file
            iOutputWriter.Print("file saved.");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

}



