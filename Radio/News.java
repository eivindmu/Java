
/**
 * Write a description of class News here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class News extends AudioTrack
{
    private String shortDescription;
    private String journalist;
    private String dateProduced;
    private String dateBroadcasted;

    /**
     * Constructor for objects of class News
     */
    public News(String title, String duration, Medium medium, String shortDescription, String journalist, String dateProduced)
    {
        super(title, duration, medium);
        this.shortDescription = shortDescription;
        this.journalist = journalist;
        this.dateProduced = dateProduced;
        
    }
    /**
     * Constructor for objects of class News
     */
    public News(String title, String duration, Medium medium, String shortDescription, String journalist, String dateProduced, String path, String filesize)
    {
        super(title, duration, medium, path, filesize);
        this.shortDescription = shortDescription;
        this.journalist = journalist;
        this.dateProduced = dateProduced;
        
    }

  
}
