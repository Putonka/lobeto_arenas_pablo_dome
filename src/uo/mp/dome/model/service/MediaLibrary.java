package uo.mp.dome.model.service;

import java.util.ArrayList;
import java.util.List;

import uo.mp.dome.model.Cd;
import uo.mp.dome.model.Dvd;
import uo.mp.dome.model.Item;
import uo.mp.dome.model.VideoGame;
import uo.mp.util.validate.Validate;

/**
 * The {@code MediaLibrary} class represents a collection of media items, like
 * CDs, DVDs or Video Games. And as a collection of items it also contains the
 * operations that can be applied over the collection.
 * <p>
 *
 * @author Programming Methodology 2022 Teaching Staff
 */
public class MediaLibrary {

	private static final int ITEM_NOT_FOUND = -1;
	private final List<Item> items = new ArrayList<Item>();
	
	
	public void run() {
		addItem(new Cd("A","B",12,1,true,""));
		addItem(new Cd("C","D",12,1));
		addItem(new Cd("E","F",12,1,true,"A comment"));
		addItem(new Cd("C","D",12,1,false,"A comment"));
		addItem(new Dvd("a","b",12));
		addItem(new Dvd("c","d",12,true,""));
		addItem(new Dvd("e","f",12,false,""));
		addItem(new VideoGame("a","b",11,true,"",VideoGame.Platform.PLAYSTATION));
		addItem(new VideoGame("c","d",12,true,"",VideoGame.Platform.NINTENDO));
		addItem(new VideoGame("c","d",12,VideoGame.Platform.XBOX));
		
		System.out.println(getResponsibles());
		System.out.println(getTotalNumberOfOwnedItems());
	}
	
	/**
	 * Adds an item to the library. The item can't be null
	 * 
	 * @param item the Item wanted to be add, it can't be null
	 */
    public void addItem(Item item) {
    	Validate.nonNull(item, "The item must not be null");
    	items.add(item);
    }

    /**
     * Checks in the library the number of items owned
     * 
     * @return the number of items owned
     */
    public int getTotalNumberOfOwnedItems() {
    	int owned = 0;
    	for(Item i: items)
    		if(i.isOwned())
    			owned++;
    	return owned;
    }

    /**
     * Prints in the console the toString of all the items in the library.
     * 
     * If there are now items it prints a empty string
     */
    public  void printAll() {
    	String aux = "";
    	
    	for(Item i : items) {
    		aux+=i.toString()+" / ";
    	}
    }
    
    /**
     * Search through the library if the given item is in
     * 
     * @param item the Item to be searched
     * @return the index of the Item, in case it is not it return ITEM_NOT_FOUND
     */

    public int searchItem(Item item) {
    	int counter = -1;
    	for(Item i: items) {
    		counter++;
    		if(i.equals(item))
    			return counter;
    	}
    	return ITEM_NOT_FOUND;
    }
    
    /**
     * Get a String with all the responsibles of the items in the list
     * 
     * @return a String with the responsibles. If the list is empty, it returns a empty String
     */
    
    public String getResponsibles() {
    	String responsibles = "";
    	for(Item i : items)
    		responsibles += i.getResponsibles() + ",";
    	return responsibles;
    }
    
}
