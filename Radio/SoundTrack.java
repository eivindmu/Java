
/**
 * Write a description of class SoundTrack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SoundTrack extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String description;

    /**
     * Constructor for objects of class SoundTrack
     */
    public SoundTrack(String title, String duration, Medium medium, String description)
    {
        super(title, duration, medium);
        this.description = description;
        
    }
    /**
     * Constructor for objects of class SoundTrack
     */
    public SoundTrack(String title, String duration, Medium medium, String description, String path, String filesize)
    {
        super(title, duration, medium, path, filesize);
        this.description = description;
    }
}
