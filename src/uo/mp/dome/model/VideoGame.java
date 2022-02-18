package uo.mp.dome.model;

import uo.mp.util.validate.Validate;

public class VideoGame extends Item {

	private final String author;
	private final int numberOfPlayers;
	private final Platform platform;
	
	enum Platform{
		NINTENDO,
		XBOX,
		PLAYSTATION
	}

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

	public VideoGame(String title, String author, int numberOfPlayers,
	              int playingTime, Platform platform) {
	        this(title, author, numberOfPlayers,
	                DEFAULT_IS_OWNED_VALUE, DEFAULT_COMMENT_VALUE, platform);
	    }

	public String getAuthor() {
		return author;
	}

	public String getResponsibles() {
		return author;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}
	
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
