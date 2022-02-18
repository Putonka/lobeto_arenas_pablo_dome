package uo.mp.dome.model;

import uo.mp.util.validate.Validate;

/**
 * * The {@code VideoGame} class represents a video gane.
 *
 * <p>It has a title, an author, number of players, a platform and if it is owned or not and a comment. 
 * For it to be valid none of the fields can be null and the
 * number of players cannot be 0. Furthermore the comment is initialized to "No
 * comment" and the owned field to false.
 * </p>
 * <p>
 * 
 * @author pablo
 *
 */
public class VideoGame extends Item {

	private final String author;
	private final int numberOfPlayers;
	private final Platform platform;
	
	enum Platform{
		NINTENDO,
		XBOX,
		PLAYSTATION
	}

	/**
	 * Constructor for the VideoGame class, with comments and if it is own
	 * 
	 * @param title of the video game
	 * @param author of the video game
	 * @param numberOfPlayers the video game admits
	 * @param isOwned
	 * @param comment any comments on the game
	 * @param platform
	 */
	public VideoGame(String title, String author, int numberOfPlayers,
	              boolean isOwned, String comment, Platform platform) {
		
	        super(title,isOwned,comment);
	        Validate.nonNull(author, comment);
	        this.author = author;
	        Validate.higherThan(numberOfPlayers, 0, "Number of players must be higher than 0");
	        this.numberOfPlayers = numberOfPlayers;
	        Validate.nonNull(platform, "Platform can't be null");
	        this.platform = platform;
	    }
	
	
	/**
	 * Constructor for the VideoGame class, 
	 * where the comments and the isOwn are set to the default value
	 * 
	 * @param title
	 * @param author
	 * @param numberOfPlayers
	 * @param playingTime
	 * @param platform
	 */
	public VideoGame(String title, String author, int numberOfPlayers,
	              int playingTime, Platform platform) {
	        this(title, author, numberOfPlayers,
	                DEFAULT_IS_OWNED_VALUE, DEFAULT_COMMENT_VALUE, platform);
	    }

	/**
	 *  getter for author
	 *  
	 * @return the name of the author
	 */
	public String getAuthor() {
		return author;
	}

	
	public String getResponsibles() {
		return author;
	}

	/**
	 * getter for the number of players
	 * 
	 * @return the ammount of players that can play the game
	 */
	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
	/**
	 * getter for the platform
	 * 
	 * @return the platform where the game can be played
	 */
	public Platform getPlatform() {
		return platform;
	}

	@Override
	public String toString() {
		return "Cd{" + "title='" + getTitle() + '\'' + ", author='" +author + '\'' + ", numberOfPlayers="
				+ numberOfPlayers + ", platform=" + getPlatform() + ", isOwned=" + isOwned() + ", comment='"
				+ getComment() + '\'' + '}';
	}
}
