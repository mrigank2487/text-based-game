package edu.psu.cmpsc221.model;

public class LimitedWeightInventorySystem extends InventorySystem{
    protected LimitedWeightInventorySystem(int maximumWeight){
        super();
        this.maximumWeight=maximumWeight;
    }

    @Override
    protected boolean canAddItem(Item item) {
        if (itemWeight<maximumWeight && (item.getWeight()+itemWeight<=maximumWeight))
        {
            itemWeight+=item.getWeight();
            return true;
        }
        else
            return false;
    } /* end canAddItem */

    @Override
    protected void drop(Item item){
        itemWeight-=item.getWeight();
    }

    @Override
    protected String getInventoryFullMessage() {
        return "You cannot carry more items since you have exceeded the weight capacity. Drop something and try again.";
    }

    private int maximumWeight;
    private int itemWeight;
}

