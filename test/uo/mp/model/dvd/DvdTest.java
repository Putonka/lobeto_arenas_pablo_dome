package uo.mp.model.dvd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Dvd;
import uo.mp.dome.model.VideoGame;

import static org.junit.Assert.assertEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class DvdTest {

    private Dvd mockDVD;
    private String mockTitle;
    private String mockDirector;
    private int mockPlayingTime;

    @Before
    public void setUp() {
        this.mockTitle = "La guerra de las Galaxias";
        this.mockDirector = "George Lucas";
        this.mockPlayingTime = 125;
    }

    /**
     * GIVEN: A set of valid parameters to create an instance of Dvd class.
     * WHEN: The constructor is invoked with the set of valid parameters. 
     * THEN: A Dvd instance is created correctly, 
     * the given parameters are assigned to
     * corresposding fields and default values 
     * are assigned to not given fields.
     */
    @Test
    public void testConstructorWithValidParameters() {
        this.mockDVD = new Dvd(this.mockTitle, this.mockDirector,
                this.mockPlayingTime);

        assertEquals(this.mockTitle, this.mockDVD.getTitle());
        assertEquals(this.mockDirector, this.mockDVD.getDirector());
        assertEquals(this.mockPlayingTime, this.mockDVD.getPlayingTime());
        assertEquals(Dvd.DEFAULT_IS_OWNED_VALUE, this.mockDVD.isOwned());
        assertEquals(Dvd.DEFAULT_COMMENT_VALUE, this.mockDVD.getComment());
    }

    /**
     * Given: a null title
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullTitle() {
    	Dvd DvD = new Dvd(null, mockDirector, mockPlayingTime);
    }

    /**
     * Given: a illegal title
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalTitle() {
    	Dvd DvD = new Dvd("", mockDirector, mockPlayingTime);
    }

    /**
     * Given: a null director
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullDirector() {
    	Dvd DvD = new Dvd(mockTitle, null, mockPlayingTime);
    }

    /**
     * Given: a illegal director
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalDirector() {
    	Dvd DvD = new Dvd(mockTitle, "", mockPlayingTime);
    }

    /**
     * Given: a zero playing time
     * When: the constructor is called
     * Then: a nullPointerException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithZeroPlayingTime() {
    	Dvd DvD = new Dvd(mockTitle, mockDirector, 0);
    }

    /**
     * Given: a illegal playingTime
     * When: the constructor is called
     * Then: a IllegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithIllegalPlayingTime() {
    	Dvd DvD = new Dvd(mockTitle, mockDirector, -1);
    }

}
