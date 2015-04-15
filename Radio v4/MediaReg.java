import java.util.HashMap;
import java.time.Duration;
import java.util.Set;
/**
 * Write a description of class Archieve here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediaReg
{
    
    private HashMap<Integer, Medium> mediums;
    private int cdNumber;
    private int tapeNumber;

    /**
     * Constructor for objects of class Archieve
     */
    public MediaReg()
    {
        mediums = new HashMap<>();
        tapeNumber = 30001;
        cdNumber = 10001;
    }
    /**
     * 
     */
    public void createCD(String title, String artist, String yearReleased, String recordLabel, int archiveNumber)
    {
        CD tempCD = new CD(title, artist, yearReleased, recordLabel, archiveNumber);
        mediums.put(archiveNumber, tempCD);
        //cdNumber = cdNumber + 1;
    }
    
    /**
     * 
     */
    public void createTape(String title, String type, int archiveNumber)
    {
        Tape tempTape = new Tape(title, type, archiveNumber);
        mediums.put(archiveNumber, tempTape);
    }
    /**
     * 
     */
    public AudioTrack addMusicTrack(int archiveNumber, String title, String duration, String artist)
    {
        Medium medium = getMedium(archiveNumber);
        Music tempTrack = new Music(title, duration, artist, medium);
        medium.addMusic(tempTrack);
        return (AudioTrack) tempTrack;
    }
    /**
     * 
     */
    public AudioTrack addAdJingle(int archiveNumber, String title, String duration,String product, String company)
    {
        Medium medium = getMedium(archiveNumber);
        AdvertisingJingle tempTrack = new AdvertisingJingle(title, duration, medium, product, company);
        medium.addJingle(tempTrack);
        return (AudioTrack) tempTrack;
    }
    /**
     * 
     */
    public AudioTrack addNews(int archiveNumber, String title, String duration, String shortDescription, String journalist, String dateProduced)
    {
       Medium medium = getMedium(archiveNumber);   
       News tempTrack = new News(title, duration, medium, shortDescription, journalist, dateProduced);
       medium.addNews(tempTrack);
       return (AudioTrack) tempTrack;
    }
    /**
     * 
     */
    public AudioTrack addSound(int archiveNumber, String title, String duration, String description)
    {
        Medium medium = getMedium(archiveNumber);
        SoundTrack tempTrack = new SoundTrack(title, duration, medium, description);
        medium.addSoundeffect(tempTrack);
        return (AudioTrack) tempTrack;
    }    
    /**
     * 
     */
    public Medium getMedium(int archiveNumber)
    {
        Medium tempMedium = mediums.get(archiveNumber);
        return tempMedium;
        
    }
    
    public String listCDs()
    {
        String returnString = "CD's:" + "\n";
        Set<Integer> keys = mediums.keySet();
        for(Integer index : keys)
        {
            Medium tempMedium = mediums.get(index);
            if(tempMedium instanceof CD)
            {
                String title = tempMedium.getTitle();
                returnString += "- " + title + "\n";
            }
        }
        return returnString;
    }
    
    public String listTapes()
    {
        String returnString = "Tapes:" + "\n";
        Set<Integer> keys = mediums.keySet();
        for(Integer index : keys)
        {
            Medium tempMedium = mediums.get(index);
            if(tempMedium instanceof Tape)
            {
                String title = tempMedium.getTitle();
                returnString += "- " + title + "\n";
            }
        }
        return returnString;
    }
}
