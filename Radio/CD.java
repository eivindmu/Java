import java.util.ArrayList;
import java.time.Duration;
/**
 * Write a description of class CD here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CD extends Medium
{
    // instance variables - replace the example below with your own
    private String nameOfArtist;
    private String yearReleased;
    private String recordLabel;
    private Duration totDuration;
    private ArrayList<AudioTrack> tracks;
    private int archiveNumber;

   /**
     * Constructor for objects of class CD
     * @param title Title of the album
     * @param artist Name of artist (if the CD is a collection of various artist, use "Various Artists" as name)
     * @param yearReleased The year the CD was released
     * @param recordLabel The record label (ex EMI, Polygram, Sony, Warner Music Group etc)
     * @param duration Total duration of the CD
     * @param archiveNumber Location of the CD in the archive (From 10001 to 19999)
     */
    public CD(String title, String artist, String yearReleased, String recordLabel, int archiveNumber)
    {
        super(title);
        this.nameOfArtist = artist;
        this.yearReleased = yearReleased;
        this.recordLabel = recordLabel;
        this.tracks = new ArrayList<>();
        this.archiveNumber = archiveNumber;
    }
    
    /**
     * Adds music to the CD
     * @param index The number of the track on the CD
     * @param Title of the song
     */
    public void addMusic(Music track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds advertising jingle to the CD
     * @param index The number of the jingle on the CD
     * @param Title of the jingle
     */
    public void addJingle(AudioTrack track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds news to the CD
     * @param index The number of the news on the CD
     * @param Title of the news
     */
    public void addNews(AudioTrack track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds sound effects to the CD
     * @param index The number of the sound effect on the CD
     * @param Title of the sound effect
     */
    public void addSoundeffect(AudioTrack track)
    {
        this.tracks.add(track);
    }
    /**
     * 
     */
    public String getInfo()
    {
        String info = "CD: ";
        info += super.getTitle() + ".    Archive Number: " + archiveNumber;
        return info;
    }
}
