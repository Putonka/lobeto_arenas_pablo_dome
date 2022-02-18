package uo.mp.model.dvd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Dvd;

import static org.junit.Assert.assertEquals;


public class SetOwnTest {

    private Dvd mockDVD;
    private String mockTitle;
    private String mockDirector;
    private int mockPlayingTime;
    private String mockComment;

    @Before
    public void setUp() {
        mockTitle = "La guerra de las Galaxias";
        mockDirector = "George Lucas";
        mockPlayingTime = 125;
        mockDVD = new Dvd(this.mockTitle, this.mockDirector,
                this.mockPlayingTime);
    }

    /**
     * GIVEN: A Dvd with the default owned value. 
     * WHEN: The method to change the
     * owned value is invoked with true as an argument. 
     * THEN: The value of the
     * that stores weather the Dvd is owned or not changes to true.
     */
    @Test
    public void testThatDefaultOwnedValueCanChangeToTrue() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Dvd.DEFAULT_IS_OWNED_VALUE, this.mockDVD.isOwned());

        final boolean newOwnedValue = true;
        this.mockDVD.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockDVD.isOwned());
    }

    /**
     * GIVEN: A Dvd with the default owned value. 
     * WHEN: The method to change the
     * owned value is invoked with false as an argument. 
     * THEN: The value of the
     * that stores weather the Dvd is owned or not changes to true.
     */
    @Test
    public void testThatDefaultOwnedValueCanChangeToFalse() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Dvd.DEFAULT_IS_OWNED_VALUE, this.mockDVD.isOwned());

        final boolean newOwnedValue = false;
        this.mockDVD.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockDVD.isOwned());
    }

    // TODO: Test that the owned information about a Dvd can change from
    //  false to true.

    // TODO: Test that the owned information about a Dvd can change from true
    //  to false.

    // TODO: Test that the owned information about a Dvd can change from
    //  false to false.

    // TODO: Test that the owned information about a Dvd can change from true
    //  to true.


}