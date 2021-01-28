package Commands;

import Invoker.IOutputWriter;

import javax.swing.plaf.ColorChooserUI;
import java.util.logging.ConsoleHandler;

public class SetColorCommand extends ShellCommand {

    public void Execute(IOutputWriter iOutputWriter) {

        System.out.println("Geben Sie die gewünschte Farbe ein:");
        SetColorCommand setColorCommand = new SetColorCommand();
    }
}


