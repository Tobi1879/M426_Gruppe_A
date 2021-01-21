package Commands;

import Invoker.IOutputWriter;

import javax.swing.plaf.ColorChooserUI;

public class SetColorCommand extends ShellCommand{

public void Execute(IOutputWriter iOutputWriter){

    System.out.println("Geben Sie die gewünschte Farbe ein:");

    String setColor = new String();
    switch(setColor){
        case "red":{
            System.out.println((char)27 + "[31m" + "Neue Farbe: Rot \n");

        }
    }


    };
}


