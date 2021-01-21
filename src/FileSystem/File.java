package FileSystem;

public class File extends FileSystemItem{

    private String content;

    public String getSize(){
        return size;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String newContent){
        this.content = newContent;
    }
}
