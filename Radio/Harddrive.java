import java.util.ArrayList;

/**
 * Write a description of class Harddrive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harddrive extends Medium
{
    private ArrayList<AudioTrack> files;
    private String name;

    /**
     * Constructor for objects of class Harddrive
     */
    public Harddrive(String name)
    {
        super(name);
        this.name = name;
        files = new ArrayList<>();
    }
    
    public void addFiles(AudioTrack file)
    {
        this.files.add(file);
    }
    
    public String getName()
    {
        return (name + ":\\");
    }
    /**
     * 
     */
    public String getInfo()
    {
        String info = "Harddrive: " + getName();
        return info;
    }
}
