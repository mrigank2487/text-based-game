package edu.psu.cmpsc221.model;

public class FiniteInventorySystem extends InventorySystem {

    public FiniteInventorySystem(int maximumInventorySize){
        this.maximumInventorySize = maximumInventorySize;
    }

    protected boolean canAddItem(Item item){
        if (numberOfItems < maximumInventorySize){
            numberOfItems += 1;
            return true;
        }
        else
            return false;
    } /* end canAddItem */

    protected void drop(Item item){
        numberOfItems -= 1;
    }

    protected String getInventoryFullMessage() {
        return "You cannot carry more items. Drop something and try again.";
    } /* end getInventoryFullMessage */

    private int numberOfItems;
    private int maximumInventorySize;

}