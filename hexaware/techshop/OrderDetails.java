package com.hexaware.techshop;
import java.util.ArrayList;
import java.util.List;
	

public class OrderDetails {
	
    private int orderDetailID;
    private Orders order;
    private List<Products> product;
    private List<Integer> quantity;
    
    public OrderDetails(int orderDetailID, Orders order, Products product, int quantity) throws IncompleteOrderException  {
        this.orderDetailID = orderDetailID;
        this.order = order;
        if (product == null) {
            throw new IncompleteOrderException("Incomplete order detail: Product reference is missing");
        } else {
            this.product = new ArrayList<>();
        }
        this.quantity = new ArrayList<>();
    }
    
    public void addProduct(Products product, int quantity) {
        this.product.add(product);
        this.quantity.add(quantity);
    }
	
	public double calculateSubtotal() {
        double subtotal = 0.0;
        for (int i = 0; i < product.size(); i++) {
            subtotal += product.get(i).getPrice() * quantity.get(i);
        }
        return subtotal;
	};
	public void getOrderDetailInfo() {
        System.out.println("Order Detail ID: " + orderDetailID);
        System.out.println("Order Details:");
        for (int i = 0; i < product.size(); i++) {
            System.out.println("Product: " + product.get(i).getProductName());
            System.out.println("Quantity: " + quantity.get(i));
        }
	};
	public void updateQuantity(int index, int newQuantity) {
        if (index >= 0 && index < quantity.size()) {
            quantity.set(index, newQuantity);
        }
	};
	public void addDiscount() {};
	


}
