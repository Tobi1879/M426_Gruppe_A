package FileSystem;

public interface IDrive {
    public String name = null;
    public String label = null;
    public int size = 0;
    public Directory rootDirectory = null;
    public Directory currentDirecotry = null;
    public String prompt = null;

    public void setCurrentDirectory(Directory directory);
    public void restore();
    public void Save();
}
