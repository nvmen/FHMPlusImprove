package utilities;

import java.util.ArrayList;
import java.util.List;

import miner.ElementFHMPlus;

/**
 * This class represents a UtilityList as used by the FHM+ algorithm.
 *
 * @see AlgoFHMPlus
 * @see ElementFHMPlus
 * @author Philippe Fournier-Viger
 */
public class UtilityListFHMPlus {
	public Integer item;  // the item
	public long sumIutils = 0;  // the sum of item utilities
	public long sumRutils = 0;  // the sum of remaining utilities
	public List<ElementFHMPlus> elements = new ArrayList<ElementFHMPlus>();  // the elements
	
	 
	/**
	 * Constructor.
	 * @param item the item that is used for this utility list
	 */
	public UtilityListFHMPlus(Integer item){
		this.item = item;
	}
	
	/**
	 * Method to add an element to this utility list and update the sums at the same time.
	 */
	public void addElement(ElementFHMPlus element){
		sumIutils += element.iutils;
		sumRutils += element.rutils;
		elements.add(element);
	}
	
	/**
	 * Get the support of the itemset represented by this utility-list
	 * @return the support as a number of trnsactions
	 */
	public int getSupport() {
		return elements.size();
	}
}
