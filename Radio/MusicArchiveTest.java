

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class MusicArchiveTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class MusicArchiveTest
{
    /**
     * Default constructor for test class MusicArchiveTest
     */
    public MusicArchiveTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void Test()
    {
        MusicArchive musicArc1 = new MusicArchive();
        musicArc1.createCD("Black Market", "Rise Against", "2014", "Interscope", 1);
        musicArc1.addMusicTrack(1, "Great Die-Off", "3:22", "Rise Against");
        musicArc1.addMusicTrack(1, "I Don't Want to Be Here Anymore", "2:33", "Rise Against");
        musicArc1.addMusicTrack(1, "Tragedy + Time", "5:01", "Rise Against");
        musicArc1.addMusicTrack(1, "Black Market", "3:44", "Rise Against");
    }

    @Test
    public void test2()
    {
        MusicArchive musicArc1 = new MusicArchive();
        musicArc1.createTape("Various", "Analog", 2);
        musicArc1.addAdJingle(2, "Audi", "2:33", "Audi", "Audi");
        musicArc1.addNews(2, "Traffic Jam", "4:33", "Big traffic jam E6", "Magnus", "13.04.2015");
        musicArc1.addSound(2, "Scream", "0:05", "Loud scream");
        musicArc1.addSound(2, "Laugh", "0:09", "Laugh");
    }

    @Test
    public void test3()
    {
        MusicArchive musicArc2 = new MusicArchive();
        musicArc2.createCD("Paradise Valley", "John Mayer", "2013", "Columbia", 3);
        musicArc2.addMusicTrack(3, "Wildfire", "3:44", "John Mayer");
        musicArc2.addMusicTrack(3, "Dear Marie", "6:43", "John Mayer");
        musicArc2.addMusicTrack(3, "Waitin' On The Day", "4:21", "John Mayer");
        musicArc2.addMusicTrack(3, "Paper Doll", "3:23", "John Mayer");
        musicArc2.createCD("Hard Dance Mania 33", "Hard Dance Mania", "2015", "Dj Beat", 4);
        musicArc2.addMusicTrack(4, "Pumping Blood (Extended Edit)", "3:33", "Malibu Drive ft. CvB");
        musicArc2.addMusicTrack(4, "Alive (Bodybangers Remix)", "5:45", "Shaun Bate & Sam Walkertone");
        musicArc2.addMusicTrack(4, "Universal Sound (Club Mix)", "3:54", "Don Esteban");
        musicArc2.addMusicTrack(4, "Wake Me Up (Stereo Faces Remix)", "2:34", "Basslovers United feat. D.A.D.");
        musicArc2.createTape("Unapologetic", "Analog", 5);
        musicArc2.addMusicTrack(5, "Phresh Out The Runway", "5:33", "Rihanna");
        musicArc2.addMusicTrack(5, "Diamonds", "3:33", "Rihanna");
        musicArc2.addMusicTrack(5, "Numb (feat. Eminem)", "4:44", "Rihanna");
        musicArc2.addMusicTrack(5, "Pour It Up", "4:55", "Rihanna");
        musicArc2.createTape("The Very Best Of The Eagles", "Digital", 6);
        musicArc2.addMusicTrack(6, "One Of These Nights", "3:33", "The Eagles");
        musicArc2.addMusicTrack(6, "Take It Easy", "5:44", "The Eagles");
        musicArc2.addMusicTrack(6, "Hotel California", "2:32", "The Eagles");
        musicArc2.addMusicTrack(6, "New Kid In Town", "2:45", "The Eagles");
    }

    @Test
    public void test4()
    {
        MusicArchive musicArc1 = new MusicArchive();
        musicArc1.createHarddrive("C");
        musicArc1.createHarddrive("D");
        musicArc1.createHarddrive("F");
        musicArc1.addJingleToHarddrive(1, "Audi", "2:22", "Audi", "Audi", "2.2mB");
        musicArc1.addJingleToHarddrive(1, "Head and shoulders", "2:33", "Shampoo", "ShampooCompany", "5.6MB");
        musicArc1.addSoundTrackToHarddrive(2, "Clap", "00:03", "A clap", "2.3MB");
        musicArc1.addSoundTrackToHarddrive(2, "whistle", "00:06", "A loud whistle", "5.6MB");
        musicArc1.addSoundTrackToHarddrive(2, "Car", "00:10", "Car sounds", "1.2MB");
        musicArc1.addNewsToHarddrive(3, "Collision", "00:30", "A collision on R136", "Marius", "13.04.2015", "2.3MB");
        musicArc1.addNewsToHarddrive(3, "Oil price", "00:50", "Big fall in oil prices", "Gunnar", "13.04.2015", "23MB");
    }

    @Test
    public void test5()
    {
        MusicArchive musicArc2 = new MusicArchive();
        musicArc2.addMusicToHarddrive(1, "Architects", "4:33", "Rise Against", "3.4MB");
    }
}






