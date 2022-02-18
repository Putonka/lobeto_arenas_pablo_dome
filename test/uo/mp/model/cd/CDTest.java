package uo.mp.model.cd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;

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


    // TODO: Constructor with null title

    // TODO: Constructor with invalid title (empty)

    // TODO: Constructor with null artist

    // TODO: Constructor with invalid artist (empty)

    // TODO: Constructor with invalid playing time (<0, 0)

    // TODO: Constructor with invalid number of tracks (<0, 0)

}
