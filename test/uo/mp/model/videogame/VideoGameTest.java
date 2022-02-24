package uo.mp.model.videogame;

import org.junit.Before;
import org.junit.Test;
import uo.mp.dome.model.Cd;
import uo.mp.dome.model.VideoGame;

import static org.junit.Assert.assertEquals;

// TODO: Add a Javadoc comment to indicate what it is the responsibility of
//  this class.
public class VideoGameTest {

    // Testing fields.
    private String mockTitle;
    private String mockAuthor;
    private int mockNumberOfPlayers;


    @Before
    public void setUp() {
        mockTitle = "Come Together";
        mockAuthor = "Beatles";
        mockNumberOfPlayers = 4;
    }

    /**
     * GIVEN: A set of valid parameters. WHEN: The constructor is called with
     * that set of parameters THEN: The CD instance is created, the given
     * parameters are assigned to the instance fields and the default values are
     * assigned to the non given fields.
     */
    @Test
    public void testConstructorWithValidParameters() {
        VideoGame videoGame = new VideoGame(mockTitle, mockAuthor, mockNumberOfPlayers,
                VideoGame.Platform.NINTENDO);

        assertEquals(this.mockTitle, videoGame.getTitle());
        assertEquals(this.mockAuthor, videoGame.getAuthor());
        assertEquals(this.mockNumberOfPlayers, videoGame.getNumberOfPlayers());
        assertEquals(VideoGame.Platform.NINTENDO, videoGame.getPlatform());
        assertEquals(Cd.DEFAULT_IS_OWNED_VALUE, videoGame.isOwned());
        assertEquals(Cd.DEFAULT_COMMENT_VALUE, videoGame.getComment());
    }


    /**
     * Given: a null title
     * When: the constructor is called
     * Then: a null pointer exception is thrown
     */
    @Test(expected = NullPointerException.class)
    public void testConstructorWithNullTittle() {
    	VideoGame videoGame = new VideoGame(null, mockAuthor, mockNumberOfPlayers,
                VideoGame.Platform.NINTENDO);
    }
    

    /**
     * Given: a empty title
     * When: the constructor is called
     * Then: a illegalArgumentException is thrown
     */
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorWithEmptyTittle() {
    	VideoGame videoGame = new VideoGame("", mockAuthor, mockNumberOfPlayers,
                VideoGame.Platform.NINTENDO);
    }

    /**
    * Given: a null author
    * When: the constructor is called
    * Then: a null pointer exception is thrown
    */
   @Test(expected = NullPointerException.class)
   public void testConstructorWithNullauthor() {
   	VideoGame videoGame = new VideoGame(mockTitle, null, mockNumberOfPlayers,
               VideoGame.Platform.NINTENDO);
   }

   /**
    * Given: a empty author
    * When: the constructor is called
    * Then: a illegalArgumentException is thrown
    */
   @Test(expected = IllegalArgumentException.class)
   public void testConstructorWithEmptyAuthor() {
   	VideoGame videoGame = new VideoGame(mockTitle, "", mockNumberOfPlayers,
               VideoGame.Platform.NINTENDO);
   }

   /**
    * Given: a illegal numberOfPlayers
    * When: the constructor is called
    * Then: a illegalArgumentException is thrown
    */
   @Test(expected = IllegalArgumentException.class)
   public void testConstructorWithIllegalNumberOfPlayers() {
   	VideoGame videoGame = new VideoGame(mockTitle, mockAuthor, -1,
               VideoGame.Platform.NINTENDO);
   }

   /**
    * Given: a zero numberOfPlayers
    * When: the constructor is called
    * Then: a illegalArgumentException is thrown
    */
   @Test(expected = IllegalArgumentException.class)
   public void testConstructorWithZeroNumberOfPlayers() {
   	VideoGame videoGame = new VideoGame(mockTitle, mockAuthor, 0,
               VideoGame.Platform.NINTENDO);
   }

}
