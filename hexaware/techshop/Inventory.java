package com.hexaware.techshop;
import java.time.LocalDateTime;


public class Inventory {
    private int inventoryID;
    private Products product;
    private int quantityInStock;
    private LocalDateTime lastStockUpdate;
    
    public Inventory(int inventoryID, Products product, int quantityInStock) {
        this.inventoryID = inventoryID;
        this.product = product;
        this.quantityInStock = quantityInStock;
        this.lastStockUpdate = LocalDateTime.now();
    }
    
    public void removeFromInventory1(int quantity) throws InsufficientStockException  {
        if (quantity <= quantityInStock) {
            quantityInStock -= quantity;
        } else {
            throw new InsufficientStockException("Insufficient stock for product: " + product.getProductName());
        }
    }
    
    public int getInventoryID() {
    	 return inventoryID;
    }

    
    public Products getProduct() {
    	return product;
    }

    public int getQuantityInStock() {
    	return quantityInStock;
    }

    public void addToInventory(int quantity) {}

    public void removeFromInventory(int quantity) {}
    
    public void UpdateStockQuantity(int newQuantity) {}
    
    public boolean isProductAvailable(int quantityToCheck) {
    	return false;
    }
    
    public double getInventoryValue() {
    	return 0.0;
    }
    
    public void listLowStockProducts(int threshold) {}
    
    public void listOutOfStockProducts() {}

    public void listAllProducts() {}

}
