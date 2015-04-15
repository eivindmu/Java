import java.util.ArrayList;

/**
 * Write a description of class Tape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tape extends Medium
{
    private String typeOfTape;
    private ArrayList<AudioTrack> tracks;
    private int archiveNumber;

    /**
     * Constructor for objects of class Tape
     * @param title Title of the tape
     * @param type Type of the tape (analog/digital)
     * @param archiveNumber Location of the tape in the archive (From 300001 to 39999)
     */
    public Tape(String title, String type, int archiveNumber)
    {
        super(title);
        this.typeOfTape = type;
        this.archiveNumber = archiveNumber;
        this.tracks = new ArrayList<>();
    }
    
    /**
     * Adds music to the tape
     * @param index The number of the track on the CD
     * @param Title of the song
     */
    public void addMusic(Music track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds advertising jingle to the tape
     * @param index The number of the jingle on the CD
     * @param Title of the jingle
     */
    public void addJingle(AudioTrack track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds news to the tape
     * @param index The number of the news on the CD
     * @param Title of the news
     */
    public void addNews(AudioTrack track)
    {
        this.tracks.add(track);
    }
    
    /**
     * Adds sound effects to the tape
     * @param index The number of the sound effect on the CD
     * @param Title of the sound effect
     */
    public void addSoundeffect(AudioTrack track)
    {
        this.tracks.add(track);
    }
}
