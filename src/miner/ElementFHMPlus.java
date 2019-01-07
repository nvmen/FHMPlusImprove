package miner;

public class ElementFHMPlus  extends Element{

	/** The remaining array (see the paper)
	 * It will have a size "maxpattern -1" */
	public int[] remainingArray = null;  
	
	/**
	 * Constructor.
	 * @param tid  the transaction id
	 * @param iutils  the itemset utility
	 * @param rutils  the remaining utility
	 */
	public ElementFHMPlus(int tid, int iutils, int rutils){
		super(tid,iutils,rutils);
	}
	
	/**
	 * Constructor
	 * @param tid  the transaction id
	 * @param iutils  the itemset utility
	 */
	public ElementFHMPlus(int tid, int iutils){
		super(tid,iutils,0);
	}
}