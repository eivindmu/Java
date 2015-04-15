
import java.time.Duration;
/**
 * Write a description of class Music here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Music extends AudioTrack
{
    // instance variables - replace the example below with your own
    private String artist;
    private String lastPlayed;
    private int timesPlayed;

    /**
     * Constructor for objects of class Music
     */
    public Music(String title, String duration, String artist, Medium medium)
    {
        super(title, duration, medium);
        this.artist = artist;
        this.timesPlayed = 0;
    }
    /**
     * Constructor for objects of class Music
     */
    public Music(String title, String duration, String artist, Medium medium, String path, String filesize)
    {
        super(title, duration, medium, path, filesize);
        this.artist = artist;
        this.timesPlayed = 0;
    }
    /**
     * 
     */
    public String getArtist()
    {
        return artist;
    }
    /**
     * 
     */
    public String getInfo()
    {
        String text = getArtist() + "  -  "  + super.getTitle() + "\n      " + super.getMedium().getInfo();
        return text;
    }
    /**
     * 
     */
    public void changeArtist(String newArtist)
    {
        this.artist = newArtist;
    }
    /**
     * 
     */
    public void playSong()
    {
        this.timesPlayed = timesPlayed + 1;
    }


}
