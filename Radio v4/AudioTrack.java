
/**
 * Write a description of class AudioTrack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioTrack
{
    private String title;
    private String duration;
    private String path;
    private String filesize;
    private Medium medium;

    /**
     * Constructor for objects of class AudioTrack
     */
    public AudioTrack(String title, String duration, Medium medium)
    {
        this.title = title;
        this.duration = duration;
        this.medium = medium;
    }
    /**
     * Constructor for objects of class AudioTrack
     */
    public AudioTrack(String title, String duration, Medium medium, String path, String filesize)
    {
        this.title = title;
        this.duration = duration;
        this.medium = medium;
        this.path = path;
        this.filesize = filesize;
    }
    /**
     * 
     */
    public String getTitle()
    {
        return title;
    }
    /**
     * 
     */
    public void changeTitle(String newTitle)
    {
        this.title = newTitle;
    }
    /**
     * 
     */
    public String getDuration()
    {
        return duration;
    }
    /**
     * 
     */
    public void changeDuration(String newDuration)
    {
        this.duration = newDuration;
    }


}
