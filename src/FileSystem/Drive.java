package FileSystem;

public abstract class Drive {
    public static String name = null;
    public static String label = null;
    public static int size = 0;
    public static Directory rootDirectory = null;
    public static Directory currentDirecotry = null;
    private static String prompt = null;

    public static String getPrompt() {
        return prompt;
    }

    public static void setPrompt(String prompt) {
        Drive.prompt = prompt;
    }

    public static void setCurrentDirectory(Directory directory) {

    }

    public static void restore() {

    }

    public static void Save() {

    }
}
