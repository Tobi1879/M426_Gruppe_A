package Commands;

import Invoker.ConsoleOutputWriter;
import Invoker.IOutputWriter;

import javax.swing.plaf.ColorChooserUI;
import java.util.logging.ConsoleHandler;

public class SetColorCommand extends ShellCommand {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public void Execute(IOutputWriter iOutputWriter) {
        if (this.parameters != null) {
            String parameters = this.parameters.get(0);
            if (!parameters.equals("-help")) {
                String arrayParameters[] = parameters.split("");
                int backgroundColor;
                int fontColor;
                if (arrayParameters.length == 2) {
                    try {
                        backgroundColor = Integer.parseInt(arrayParameters[0]);
                        fontColor = Integer.parseInt(arrayParameters[1]);
                    } catch (Exception e) {
                        //iOutputWriter.PrintLine("Falscheingabe!");
                        iOutputWriter.PrintLine("\u001B[31mUngültige Eingabe\n\u001B[0m");
                        return;
                    }
                    String ansiBackgroundColor = "";
                    String ansiFontColor = "";
                    switch (backgroundColor) {
                        case 0: {
                            ansiBackgroundColor = ANSI_BLACK_BACKGROUND;
                            break;
                        }
                        case 1: {
                            ansiBackgroundColor = ANSI_BLUE_BACKGROUND;
                            break;
                        }
                        case 2: {
                            ansiBackgroundColor = ANSI_GREEN_BACKGROUND;
                            break;
                        }
                        case 3: {
                            ansiBackgroundColor = ANSI_CYAN_BACKGROUND;
                            break;
                        }
                        case 4: {
                            ansiBackgroundColor = ANSI_RED_BACKGROUND;
                            break;
                        }
                        case 5: {
                            ansiBackgroundColor = ANSI_PURPLE_BACKGROUND;
                            break;
                        }
                        case 6: {
                            ansiBackgroundColor = ANSI_YELLOW_BACKGROUND;
                            break;
                        }
                        case 7: {
                            ansiBackgroundColor = ANSI_WHITE_BACKGROUND;
                            break;
                        }
                        default: {
                            iOutputWriter.PrintLine("Falscher Parameter!");
                            return;
                        }
                    }
                    switch (fontColor) {
                        case 0: {
                            ansiFontColor = ANSI_BLACK;
                            break;
                        }
                        case 1: {
                            ansiFontColor = ANSI_BLUE;
                            break;
                        }
                        case 2: {
                            ansiFontColor = ANSI_GREEN;
                            break;
                        }
                        case 3: {
                            ansiFontColor = ANSI_CYAN;
                            break;
                        }
                        case 4: {
                            ansiFontColor = ANSI_RED;
                            break;
                        }
                        case 5: {
                            ansiFontColor = ANSI_PURPLE;
                            break;
                        }
                        case 6: {
                            ansiFontColor = ANSI_YELLOW;
                            break;
                        }
                        case 7: {
                            ansiFontColor = ANSI_WHITE;
                            break;
                        }
                        default: {
                            iOutputWriter.PrintLine("Falscher Parameter!");
                            return;
                        }
                    }
                    System.out.print(ansiBackgroundColor + ansiFontColor );
                }
            } else {
                iOutputWriter.PrintLine("Geben Sie wie folgt die Parameter ein\n" +
                        "color <Farbe Hintergrund><Farbe Text>\n" +
                        "z.B. color 12\n" +
                        "\n" +
                        "Wie folgt sind die Farben:\n" +
                        "0 = Schwarz\t4 = Rot\n" +
                        "1 = Blau\t5 = Violett\n" +
                        "2 = Grün\t6 = Gelb\n" +
                        "3 = Cyan\t7 = Weiss\n");
            }
        } else {
            iOutputWriter.PrintLine("\u001B[31mUngültige Eingabe\n\u001B[0m");
            //iOutputWriter.PrintLine("Ungültige Eingabe!");
        }
    }
}


