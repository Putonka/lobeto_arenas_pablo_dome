package uo.mp.model.videogame;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;
import uo.mp.dome.model.VideoGame;

import static org.junit.Assert.assertEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class SetOwnTest {

    private VideoGame mockVideoGame;
    private String mockTitle;
    private String mockAuthor;
    private int mockNumberOfPlayers;


    @Before
    public void setUp() {
        this.mockTitle = "Come Together";
        this.mockAuthor = "Beatles";
        this.mockNumberOfPlayers = 4;
        this.mockVideoGame =
                new VideoGame(this.mockTitle, this.mockAuthor, this.mockNumberOfPlayers,VideoGame.Platform.NINTENDO);
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
        assertEquals(VideoGame.DEFAULT_IS_OWNED_VALUE, this.mockVideoGame.isOwned());

        final boolean newOwnedValue = true;
        this.mockVideoGame.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockVideoGame.isOwned());
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
        assertEquals(Cd.DEFAULT_IS_OWNED_VALUE, this.mockVideoGame.isOwned());

        final boolean newOwnedValue = false;
        this.mockVideoGame.setOwned(newOwnedValue);
        assertEquals(newOwnedValue, mockVideoGame.isOwned());
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
