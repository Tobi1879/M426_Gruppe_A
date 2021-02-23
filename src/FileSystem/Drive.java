package FileSystem;

public class Drive {
    private static String name = null;
    private static String label = null;
    private static int size = 0;
    private static Directory rootDirectory = null;
    private static Directory currentDirecotry = null;
    private static String prompt = null;

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Drive.name = name;
    }

    public static String getLabel() {
        return label;
    }

    public static void setLabel(String label) {
        Drive.label = label;
    }

    public static int getSize() {
        return size;
    }

    public static void setSize(int size) {
        Drive.size = size;
    }

    public static Directory getRootDirectory() {
        return rootDirectory;
    }

    public static void setRootDirectory(Directory rootDirectory) {
        Drive.rootDirectory = rootDirectory;
    }

    public static Directory getCurrentDirecotry() {
        return currentDirecotry;
    }

    public static void setCurrentDirecotry(Directory currentDirecotry) {
        Drive.currentDirecotry = currentDirecotry;
    }

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
