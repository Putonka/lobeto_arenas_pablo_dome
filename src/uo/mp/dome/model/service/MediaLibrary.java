package uo.mp.dome.model.service;

import java.util.ArrayList;
import java.util.List;

import uo.mp.dome.model.Item;
import uo.mp.util.validate.Validate;

/**
 * The {@code MediaLibrary} class represents a collection of media items, like
 * CDs, DVDs or Video Games. And as a collection of items it also contains the
 * operations that can be applied over the collection.
 * <p>
 * TODO: Update this comment when you implement the class.
 *
 * @author Programming Methodology 2022 Teaching Staff
 */
public class MediaLibrary {

	private static final int ITEM_NOT_FOUND = -1;
	private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
    	Validate.nonNull(item, "The item must not be null");
    	items.add(item);
    }

    public int getTotalNumberOfOwnedItems() {
    	int owned = 0;
    	for(Item i: items)
    		if(i.isOwned())
    			owned++;
    	return owned;
    }

    public  void printAll() {
    	String aux = "";
    	
    	for(Item i : items) {
    		aux+=i.toString()+" / ";
    	}
    }

    public int searchItem(Item item) {
    	int counter = -1;
    	for(Item i: items) {
    		counter++;
    		if(i.equals(item))
    			return counter;
    	}
    	return ITEM_NOT_FOUND;
    }
    
    public String getResponsibles() {
    	String responsibles = "";
    	for(Item i : items)
    		responsibles += i.getResponsibles() + ",";
    	return responsibles;
    }
    
}
