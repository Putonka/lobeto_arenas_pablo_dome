package uo.mp.model.dvd;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Dvd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class SetCommentTest {

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
     * GIVEN: An existing DVD instance with the 
     * initial comment set as default one. 
     * WHEN: The method to change the comment is 
     * invoked with a valid string as an argument. 
     * THEN: The DVD instance comment is set to the given
     * one.
     */
    @Test
    public void testSetComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Dvd.DEFAULT_COMMENT_VALUE, this.mockDVD.getComment());

        this.mockComment = "This Dvd is a very good one.";
        this.mockDVD.setComment(this.mockComment);
        assertEquals(this.mockComment, this.mockDVD.getComment());
    }

    /**
     * GIVEN: An existing DVD instance with 
     * the initial comment set as default one. 
     * WHEN: The method to change the comment 
     * is invoked with a null string as an argument. 
     * THEN: The DVD instance comment is not set to the given
     * one and an IllegalArgumentException is thrown.
     */
    @Test(expected = NullPointerException.class)
    public void testSetNullComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Dvd.DEFAULT_COMMENT_VALUE, this.mockDVD.getComment());

        this.mockComment = null;
        this.mockDVD.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockDVD.getComment());
    }

    /**
     * GIVEN: An existing DVD instance with the initial comment set as default
     * one. 
     * WHEN: The method to change the comment is invoked with an empty
     * string (string containing only white spaces or nothing) as an argument.
     * THEN: The DVD instance comment is not set to the given one and an
     * IllegalArgumentException is thrown.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetBlankComment() {
        // Precondition, not supported in JUnit 4 so we have to do it with an
        // assert.
        assertEquals(Dvd.DEFAULT_COMMENT_VALUE, this.mockDVD.getComment());

        this.mockComment = "      ";
        this.mockDVD.setComment(this.mockComment);
        assertNotEquals(this.mockComment, this.mockDVD.getComment());
    }

}