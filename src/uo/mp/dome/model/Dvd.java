package uo.mp.dome.model;

import uo.mp.util.validate.Validate;

/**
 * The {@code DVD} class represents a dvd.
 *
 * <p>It has a title, an artist, a director, a playing time, if it is owned or
 * not and a comment. For it to be valid none of the fields can be null and the
 * playing time cannot be 0. Furthermore the comment is initialized to "No
 * comment" and the owned field to false.
 * </p>
 * <p>
 * TODO: Add Javadoc to all public methods.
 *
 * @author Programming Methodology 2022 Teaching Staff.
 */
public class Dvd extends Item {


    private final String director;
    private final int playingTime;

    public Dvd(String title, String director, int playingTime, boolean isOwned,
               String comment) {
    	super(title,isOwned,comment);
    	Validate.higherThan(playingTime, 0, "Playing time must be higher than 0");
    	this.playingTime = playingTime;
        this.director = director;
    }
    
    public int getPlayingTime() {
    	return playingTime;
    }
    

    public Dvd(String title, String director, int playingTime) {
        this(title, director, playingTime, DEFAULT_IS_OWNED_VALUE,
                DEFAULT_COMMENT_VALUE);
    }

    public String getDirector() {
        return director;
    }
    
    public String getResponsibles() {
        return director;
    }

    @Override
    public String toString() {
        return "Dvd{" + "title='" + getTitle() + '\'' + ", director='" + director +
                '\'' + ", playingTime=" + getPlayingTime() + ", isOwned=" + isOwned() +
                ", comment='" + getComment() + '\'' + '}';
    }
}
