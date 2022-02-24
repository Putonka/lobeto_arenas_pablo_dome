package uo.mp.model.cd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;
import uo.mp.dome.model.Dvd;

import static org.junit.Assert.assertEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class CDTest {

    // Testing fields.
    private String mockTitle;
    private String mockArtist;
    private int mockNumberOfTracks;
    private int mockPlayingTime;


    @Before
    public void setUp() {
        mockTitle = "Come Together";
        mockArtist = "Beatles";
        mockNumberOfTracks = 4;
        mockPlayingTime = 70;
    }

    /**
     * GIVEN: A set of valid parameters. WHEN: The constructor is called with
     * that set of parameters THEN: The CD instance is created, the given
     * parameters are assigned to the instance fields and the default values are
     * assigned to the non given fields.
     */
    @Test
    public void testConstructorWithValidParameters() {
        Cd cd = new Cd(mockTitle, mockArtist, mockNumberOfTracks,
                mockPlayingTime);

        assertEquals(this.mockTitle, cd.getTitle());
        assertEquals(this.mockArtist, cd.getArtist());
        assertEquals(this.mockNumberOfTracks, cd.getNumberOfTracks());
        assertEquals(this.mockPlayingTime, cd.getPlayingTime());
        assertEquals(Cd.DEFAULT_IS_OWNED_VALUE, cd.isOwned());
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, cd.getComment());
    }


    /**
     * Given: a null title
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullTitle() {
    	Cd Cd = new Cd(null, mockArtist, mockNumberOfTracks, mockPlayingTime);
    }

    /**
     * Given: a illegal title
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalTitle() {
    	Cd Cd = new Cd("", mockArtist, mockNumberOfTracks, mockPlayingTime);
    }

    /**
     * Given: a null artist
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullArtist() {
    	Cd Cd = new Cd(mockTitle, null, mockNumberOfTracks, mockPlayingTime);
    }

    /**
     * Given: a illegal artist
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalArtist() {
    	Cd Cd = new Cd(mockTitle, "", mockNumberOfTracks, mockPlayingTime);
    }

    /**
     * Given: a zero playing Time
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroNumberOfTracks() {
    	Cd Cd = new Cd(mockTitle , mockArtist, 0, mockPlayingTime);
    }

    /**
     * Given: a illegal playing time
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalNumberOfTracks() {
    	Cd Cd = new Cd(mockTitle , mockArtist, -1, mockPlayingTime);
    }

    /**
     * Given: a zero playing Time
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroPlayingTime() {
    	Cd Cd = new Cd(mockTitle , mockArtist, mockNumberOfTracks, 0);
    }

    /**
     * Given: a illegal playing time
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalPlayingTime() {
    	Cd Cd = new Cd(mockTitle , mockArtist, mockNumberOfTracks, -1);
    }

}
