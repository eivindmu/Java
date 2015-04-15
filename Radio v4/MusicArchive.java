import java.util.ArrayList;
import java.time.Duration;

/**
 * Write a description of class Radio here.
 * 
 * @author Eivind er en kjempedust!
 * @version (a version number or a date)
 */
public class MusicArchive
{
    // instance variables - replace the example below with your own
    private Parser parser;
    private MediaReg mediaRegister;
    private AudioReg audioRegister;
    private Harddrives harddrives;
    private Test temp;
    

    /**
     * Constructor for objects of class Radio
     */
    public MusicArchive()
    {
        parser = new Parser();
        mediaRegister = new MediaReg();
        audioRegister = new AudioReg();
        harddrives = new Harddrives();
        temp = new Test(this);
    }
    /**
     * 
     */
    public void startApp()
    {
        System.out.println();
        System.out.println("Welcome to Bird Radio");
                
        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
    }
        /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        boolean wantToClose = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help")) {
            help();
        }
        else if (commandWord.equals("create")) {
            System.out.println("test");
        }
        else if (commandWord.equals("close")) {
            wantToClose = closeApp();
        }
        // else command not recognised.
        return wantToClose;
    }
    /**
     * 
     */
    public boolean closeApp()
    {
        System.out.println("The app is closing");
        return true;
    }
    /**
     *
     */
    private void help()
    {
        System.out.println("Help menu: ");
        System.out.println(" ");
    }
    /**
     * 
     */
    public void createCD(String title, String artist, String yearReleased, String recordLabel, int archiveNumber)
    {
        mediaRegister.createCD(title, artist, yearReleased, recordLabel, archiveNumber);
    }
    /**
     * 
     */
    public void createTape(String title, String type, int archiveNumber)
    {
        mediaRegister.createTape(title, type, archiveNumber);
    }
    /**
     * 
     */
    public void createHarddrive(String name)
    {
        harddrives.createHD(name);
    }
    /**
     * 
     */
    public void addMusicTrack(int archiveNumber, String title, String duration, String artist)
    {
        audioRegister.addTrack(mediaRegister.addMusicTrack(archiveNumber, title, duration, artist));
    }
    /**
     * 
     */
    public void addAdJingle(int archiveNumber, String title, String duration, String product, String company)
    {
        audioRegister.addTrack(mediaRegister.addAdJingle(archiveNumber, title, duration, product, company));
    }
    /**
     * 
     */
    public void addNews(int archiveNumber, String title, String duration, String shortDescription, String journalist, String dateProduced)
    {
        audioRegister.addTrack(mediaRegister.addNews(archiveNumber, title, duration, shortDescription, journalist, dateProduced));
    }
    /**
     * 
     */
    public void addSound(int archiveNumber, String title, String duration, String description)
    {
        audioRegister.addTrack(mediaRegister.addSound(archiveNumber, title, duration, description));
    }  
    /**
     * 
     */
    public void addMusicToHarddrive(int HDNumber, String title, String duration, String artist, String filesize)
    {
        audioRegister.addTrack(harddrives.addMusic(HDNumber, title, duration, artist, filesize));
    }
    /**
     * 
     */
    public void addJingleToHarddrive(int HDNumber, String title, String duration, String product, String company, String filesize)
    {
        audioRegister.addTrack(harddrives.addJingle(HDNumber, title, duration, product, company, filesize));
    }
    /**
     * 
     */
    public void addNewsToHarddrive(int HDNumber, String title, String duration, String shortDescription, String journalist, String dateProduced, String filesize)
    {
        audioRegister.addTrack(harddrives.addNews(HDNumber, title, duration, shortDescription, journalist, dateProduced, filesize));
    }
    /**
     * 
     */
    public void addSoundTrackToHarddrive(int HDNumber, String title, String duration, String description, String filesize)
    {
        audioRegister.addTrack(harddrives.addSoundTrack(HDNumber, title, duration, description, filesize));
    }
    
    public void listCDs()
    {
        System.out.println(mediaRegister.listCDs());
    }
    
    public void listTapes()
    {
        System.out.println(mediaRegister.listTapes());
    }
    
    public void listHarddrives()
    {
        System.out.println(harddrives.listHarddrives());
    }
}
