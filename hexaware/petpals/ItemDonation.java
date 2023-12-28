package com.hexaware.petpals;

public class ItemDonation extends Donation {
    private String itemType;

    public ItemDonation(String donorName, double amount, String itemType) {
        super(donorName, amount);
        this.itemType = itemType;
    }
    
    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }
    
    @Override
    public void recordDonation() {
        System.out.println("Item donation recorded for: " + getDonorName() + " - Type: " + itemType + ", Amount: " + getAmount());
        // You might add database interactions or any other recording mechanism here
    }
}
