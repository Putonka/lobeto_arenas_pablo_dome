package uo.mp.dome.model;

import uo.mp.util.validate.Validate;

/**
 * The {@code Item} is a superclass for media.
 *
 * <p>It has a title, if it is owned or not and a comment. 
 * For it to be valid none of the fields can be null.
 * Furthermore the comment is initialized 
 * to "No comment" and the owned field to false.
 * </p>
 * <p>
 * 
 * @author pablo
 *
 */

public abstract class Item {
	
	public static final boolean DEFAULT_IS_OWNED_VALUE = false;
    public static final String DEFAULT_COMMENT_VALUE = "No comment";

    private final String title;

    private boolean isOwned = DEFAULT_IS_OWNED_VALUE;
    private String comment = DEFAULT_COMMENT_VALUE;
    
    public Item(String title, boolean isOwned, String comment) {
    	Validate.nonNull(title, "Title can't be null");
    	Validate.nonEmpty(title, "Title cannot be empty");
    	this.title= title;
    	this.setOwned(isOwned);
    	this.setComment(comment);
    }

	public boolean isOwned() {
		return isOwned;
	}

	public void setOwned(boolean isOwned) {
		this.isOwned = isOwned;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		Validate.nonNull(comment, "Comment can't be null");
		Validate.nonEmpty(comment, "Comment can't be empty");
		this.comment = comment;
	}

	public String getTitle() {
		return title;
	}
	
	public abstract String getResponsibles();
	
	public abstract String toString();

}
