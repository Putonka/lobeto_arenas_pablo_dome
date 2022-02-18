package uo.mp.model.dvd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Dvd;

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

    // TODO: Constructor with null title

    // TODO: Constructor with invalid title (empty)

    // TODO: Constructor with null director

    // TODO: Constructor with invalid director (empty)

    // TODO: Constructor with invalid playing time (<0, 0)

}
