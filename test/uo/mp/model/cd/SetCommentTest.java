package uo.mp.model.cd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class SetCommentTest {

    private Cd mockCD;
    private String mockTitle;
    private String mockArtist;
    private int mockPlayingTime;
    private int mockNumberOfTracks;
    private String mockComment;


    @Before
    public void setUp() {
        this.mockTitle = "Come Together";
        this.mockArtist = "Beatles";
        this.mockNumberOfTracks = 4;
        this.mockPlayingTime = 70;
        this.mockCD =
                new Cd(this.mockTitle, this.mockArtist, this.mockNumberOfTracks,
                        this.mockPlayingTime);
    }

    /**
     * GIVEN: An existing CD instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with a valid
     * string as an argument. 
     * THEN: The CD instance comment is set to the given
     * one.
     */
    @Test
    public void testSetComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockCD.getComment());
        this.mockComment = "This CD is a very good one.";
        this.mockCD.setComment(this.mockComment);
        assertEquals(this.mockComment, this.mockCD.getComment());
    }

    /**
     * GIVEN: An existing CD instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with a null string
     * as an argument. 
     * THEN: The CD instance comment is not set to the given one
     * and an IllegalArgumentException is thrown.
     */
    @Test(expected = NullPointerException.class)
    public void testSetNullComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockCD.getComment());

        this.mockComment = null;
        this.mockCD.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockCD.getComment());
    }

    /**
     * GIVEN: An existing CD instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with an empty
     * string (string containing only white spaces or nothing) as an argument.
     * THEN: The CD instance comment is not set to the given one and an
     * IllegalArgumentException is thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBlankComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, this.mockCD.getComment());

        this.mockComment = "      ";
        this.mockCD.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockCD.getComment());
    }

}
