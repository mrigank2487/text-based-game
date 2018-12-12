package edu.psu.cmpsc221.model;

public class LimitedBulkinessInventorySystem extends InventorySystem{
    protected LimitedBulkinessInventorySystem(int maximumBulkiness){
        super();
        this.maximumBulkiness=maximumBulkiness;
    }

    @Override
    protected boolean canAddItem(Item item) {
        if (itemBulkiness<maximumBulkiness && (item.getBulkiness()+itemBulkiness<=maximumBulkiness))
        {
            itemBulkiness+=item.getBulkiness();
            return true;
        }
        else
            return false;
    } /* end canAddItem */

    @Override
    protected void drop(Item item){
        itemBulkiness-=item.getBulkiness();
    }

    @Override
    protected String getInventoryFullMessage() {
        return "You cannot carry more items since you have exceeded the bulk capacity. Drop something and try again.";
    }

    private int maximumBulkiness;
    private int itemBulkiness;
}

