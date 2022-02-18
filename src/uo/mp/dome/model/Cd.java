package uo.mp.dome.model;

import uo.mp.util.validate.Validate;

/**
 * The {@code Cd} class represents a compact disk.
 *
 * <p>It has a title, an artist, a number of tracks, a playing time, if it is
 * owned or not and a comment. For it to be valid none of the fields can be null
 * and the number of tracks and playing time cannot be 0. Furthermore the
 * comment is initialized to "No comment" and the owned field to false.
 * </p>
 * <p>
 *
 * @author Programming Methodology 2022 Teaching Staff.
 */
public class Cd extends Item {

    private final String artist;
    private final int numberOfTracks;
    private final int playingTime;
 
    public Cd(String title, String artist, int numberOfTracks, int playingTime,
              boolean isOwned, String comment) {
    	
        super(title,isOwned,comment);
        Validate.nonNull(artist, comment);
        this.artist = artist;
        Validate.higherThan(numberOfTracks, 0, "Number of tracks must be higher than 0");
        this.numberOfTracks = numberOfTracks;
        Validate.higherThan(playingTime, 0, "Playing time must be higher than 0");
        this.playingTime = playingTime;
    }

    public Cd(String title, String artist, int numberOfTracks,
              int playingTime) {
        this(title, artist, numberOfTracks, playingTime,
                DEFAULT_IS_OWNED_VALUE, DEFAULT_COMMENT_VALUE);
    }

    public String getArtist() {
        return artist;
    }
    
    public int getPlayingTime() {
    	return playingTime;
    }
    
    public String getResponsibles() {
        return artist;
    }

    public int getNumberOfTracks() {
        return numberOfTracks;
    }

    @Override
    public String toString() {
        return "Cd{" + "title='" + getTitle() + '\'' + ", artist='" + artist + '\'' +
                ", numberOfTracks=" + numberOfTracks + ", playingTime=" +
                getPlayingTime() + ", isOwned=" + isOwned() + ", comment='" + getComment() +
                '\'' + '}';
    }

}