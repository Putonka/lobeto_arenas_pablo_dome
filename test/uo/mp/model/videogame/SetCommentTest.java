package uo.mp.model.videogame;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;
import uo.mp.dome.model.VideoGame;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class SetCommentTest {

	private VideoGame mockVideoGame;
    private String mockTitle;
    private String mockAuthor;
    private int mockNumberOfPlayers;
    private String mockComment;


    @Before
    public void setUp() {
        this.mockTitle = "Come Together";
        this.mockAuthor = "Beatles";
        this.mockNumberOfPlayers = 4;
        this.mockVideoGame =
                new VideoGame(this.mockTitle, this.mockAuthor, this.mockNumberOfPlayers,VideoGame.Platform.NINTENDO);
    }

    /**
     * GIVEN: An existing VideoGame instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with a valid
     * string as an argument. 
     * THEN: The VideoGame instance comment is set to the given
     * one.
     */
    @Test
    public void testSetComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockVideoGame.getComment());
        this.mockComment = "This CD is a very good one.";
        this.mockVideoGame.setComment(this.mockComment);
        assertEquals(this.mockComment, this.mockVideoGame.getComment());
    }

    /**
     * GIVEN: An existing VideoGame instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with a null string
     * as an argument. 
     * THEN: The VideoGame instance comment is not set to the given one
     * and an IllegalArgumentException is thrown.
     */
    @Test(expected = NullPointerException.class)
    public void testSetNullComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockVideoGame.getComment());

        this.mockComment = null;
        this.mockVideoGame.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockVideoGame.getComment());
    }

    /**
     * GIVEN: An existing VideoGame instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with an empty
     * string (string containing only white spaces or nothing) as an argument.
     * THEN: The VideoGame instance comment is not set to the given one and an
     * IllegalArgumentException is thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBlankComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockVideoGame.getComment());

        this.mockComment = "      ";
        this.mockVideoGame.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockVideoGame.getComment());
    }

}
