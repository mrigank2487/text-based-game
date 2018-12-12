package edu.psu.cmpsc221.model;

public class Item {
    public Item(String name, String lookDescription, int weight, int bulkiness) {
        this.lookDescription = lookDescription;
        this.name = name;
        this.weight=weight;
        this.bulkiness=bulkiness;
    } /* end Item */

    public String getLookDescription() {
        return lookDescription;
    } /* end getLookDescription */

    public String getName() {
        return name;
    } /* end getName */

    public Integer getWeight() { return weight; }

    public Integer getBulkiness() { return bulkiness; }
    private String lookDescription;
    private String name;
    private int weight;
    private int bulkiness;
} /* end Item */
