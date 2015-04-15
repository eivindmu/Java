import java.util.ArrayList;
/**
 * Write a description of class Tracks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AudioReg
{
    // instance variables - replace the example below with your own
    private ArrayList<AudioTrack> tracks;

    /**
     * Constructor for objects of class Tracks
     */
    public AudioReg()
    {
       tracks = new ArrayList<>();
    }
    /**
     * 
     */
    public void addTrack(AudioTrack tempTrack)
    {
        tracks.add(tempTrack);
    }
    /**
     * 
     */
    public void listMusic()
    {
        for(AudioTrack track : tracks)
        {
            if(track instanceof Music)
            {
                System.out.println("True");
            }
        }
    }

}
