

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
}


