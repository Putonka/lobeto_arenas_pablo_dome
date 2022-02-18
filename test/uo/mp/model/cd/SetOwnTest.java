package uo.mp.model.cd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;

import static org.junit.Assert.assertEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class SetOwnTest {

    private Cd mockCD;
    private String mockTitle;
    private String mockArtist;
    private int mockNumberOfTracks;
    private int mockPlayingTime;


    @Before
    public void setUp() {
        this.mockTitle = "Come Together";
        this.mockArtist = "Beatles";
        this.mockPlayingTime = 70;
        this.mockNumberOfTracks = 4;
        this.mockCD =
                new Cd(this.mockTitle, this.mockArtist, this.mockNumberOfTracks,
                        this.mockPlayingTime);
    }

    /**
     * GIVEN: A CD with the default owned value. 
     * WHEN: The method to change the
     * owned value is invoked with true as an argument. 
     * THEN: The value of the that stores weather 
     * the CD is owned or not changes to true.
     */
    @Test
    public void testThatDefaultOwnedValueCanChangeToTrue() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_IS_OWNED_VALUE, this.mockCD.isOwned());

        final boolean newOwnedValue = true;
        this.mockCD.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockCD.isOwned());
    }

    /**
     * GIVEN: A CD with the default owned value. 
     * WHEN: The method to change the
     * owned value is invoked with false as an argument. 
     * THEN: The value of the that stores weather 
     * the CD is owned or not changes to true.
     */
    @Test
    public void testThatDefaultOwnedValueCanChangeToFalse() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_IS_OWNED_VALUE, this.mockCD.isOwned());

        final boolean newOwnedValue = false;
        this.mockCD.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockCD.isOwned());
    }

    // TODO: Test that the owned information about a Cd can change from false
    //  to true.

    // TODO: Test that the owned information about a Cd can change from true
    //  to false.

    // TODO: Test that the owned information about a Cd can change from false
    //  to false.

    // TODO: Test that the owned information about a Cd can change from true
    //  to true.
}
