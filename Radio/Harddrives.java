import java.util.ArrayList;
/**
 * Write a description of class Harddrives here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Harddrives
{
    private ArrayList<Harddrive> harddrives;
    private Harddrive harddrive;

    /**
     * Constructor for objects of class Harddrives
     */
    public Harddrives()
    {
        harddrives = new ArrayList<>();
    }
    
    public void createHD(String name)
    {
        harddrive = new Harddrive(name);
        harddrives.add(harddrive);
    }
    
    public Harddrive getHD(int slotNumber)
    {
        Harddrive tempHD = harddrives.get(slotNumber);
        return tempHD;
    }
    
    public AudioTrack addMusic(int slotNumber, String title, String duration, String artist, String filesize)
    {
        Harddrive harddrive = getHD((slotNumber - 1));
        String path = harddrive.getName() + title;
        Music tempTrack = new Music(title, duration, artist, harddrive, path, filesize);
        AudioTrack file = (AudioTrack) tempTrack;
        harddrive.addFiles(file);
        return tempTrack;
    }
    
    public AudioTrack addJingle(int slotNumber, String title, String duration, String product, String company, String filesize)
    {
        Harddrive harddrive = getHD((slotNumber - 1));
        String path = harddrive.getName() + title;
        AdvertisingJingle tempJingle = new AdvertisingJingle(title, duration, harddrive, product, company, path, filesize);
        AudioTrack file = (AudioTrack) tempJingle;
        harddrive.addFiles(file);
        return tempJingle;
    }
    
    public AudioTrack addNews(int slotNumber, String title, String duration, String shortDescription, String journalist, String dateProduced, String filesize)
    {
        Harddrive harddrive = getHD((slotNumber - 1));
        String path = harddrive.getName() + title;
        News tempNews = new News(title, duration, harddrive, shortDescription, journalist, dateProduced, path, filesize);
        AudioTrack file = (AudioTrack) tempNews;
        harddrive.addFiles(file);
        return tempNews;
    }
     
    public AudioTrack addSoundTrack(int slotNumber, String title, String duration, String description, String filesize)
    {
        Harddrive harddrive = getHD((slotNumber - 1));
        String path = harddrive.getName() + title;
        SoundTrack tempSound = new SoundTrack(title, duration, harddrive, description, path, filesize);
        AudioTrack file = (AudioTrack) tempSound;
        harddrive.addFiles(file);
        return tempSound;
    }
    /**
     * 
     */
    public String listHarddrives()
    {
        String returnString = "Harddrives:" + "\n";
        for(Harddrive tempHD : harddrives)
        {
            String name = tempHD.getName();
            returnString += "- " + name + "\\" + "\n";
        }
        return returnString;
    }
}
