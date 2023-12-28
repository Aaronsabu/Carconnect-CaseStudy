package com.hexaware.techshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Products {
	
	 private List<Products> productList = new ArrayList<>();
	
	private int productID;
    private String productName;
    private String description;
    private double price;
    private boolean inStock;
    
    public Products(int productID, String productName, String description, double price) {
        this.productID = productID;
        this.productName = productName;
        this.description = description;
        setPrice(price);
    }
    
    public void addProduct(Products product) {
        if (!productList.contains(product)) {
            productList.add(product);
            System.out.println("Product added: " + product.getProductName());
        } else {
            System.out.println("Product already exists.");
        }
    }
    
    public void updateProduct(int productId, double price, String description) {
        for (Products product : productList) {
            if (product.getProductID() == productId) {
                try {
                    product.updateProductInfo(price, description);
                    System.out.println("Product updated: " + product.getProductName());
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
                return;
            }
        }
        System.out.println("Product ID not found.");
    }
    
    public void removeProduct(int productId) {
        Iterator<Products> iterator = productList.iterator();
        while (iterator.hasNext()) {
            Products product = iterator.next();
            if (product.getProductID() == productId) {
                if (!product.IsProductInStock()) {
                    iterator.remove();
                    System.out.println("Product removed: " + product.getProductName());
                } else {
                    System.out.println("Cannot remove product. It has existing orders.");
                }
                return;
            }
        }
        System.out.println("Product ID not found.");
    }
 
	
	public void getProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Description: " + description);
        System.out.println("Price: " + price);
        System.out.println("In Stock: " + (inStock ? "Yes" : "No"));
	};
	
	public int getProductID() {
		return productID;
	}
	public void setProductId(int productId) {
		 this.productID = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		 this.productName = productName;
	}
	
	 public String getDescription() {
		 return description;
	 }
	 public void setDescription(String description) {
		this.description = description;
	 }
	 
	 public double getPrice() {
		 return price;
	 }
		 
	
	public void updateProductInfo(double price, String description) {
		setPrice(price);
        this.description = description;
	};
	public boolean IsProductInStock() {
		return inStock;
	};
	
	public void setPrice(double price) {
	    try {
	        if (price >= 0) { 
	            this.price = price;
	        } else {
	            throw new IllegalArgumentException("Price cannot be negative");
	        }
	    } catch (IllegalArgumentException e) {
	        System.out.println(e.getMessage());
	    }
	}

	
}
