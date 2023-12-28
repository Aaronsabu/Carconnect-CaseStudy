package com.hexaware.techshop;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Orders {
    private int orderID;
    private Customer customer;
    private String orderDate;
    private List<Orders> ordersList = new ArrayList<>();
    private List<OrderDetails> orderDetailsList;
    private double totalAmount;
    private boolean hasProductReference;
    private String orderStatus;
    
    public Orders(int orderID, Customer customer, String orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
        this.orderDetailsList = new ArrayList<>();
        this.orderStatus = "Pending";
    }
    
    public String getOrderDate() {
    	return orderDate;
    }
    
    public void addOrder(Orders order) {
        ordersList.add(order);
    }
    public void sortOrdersByDate(boolean ascending) {
        Comparator<Orders> dateComparator = Comparator.comparing(Orders::getOrderDate);

        if (!ascending) {
            dateComparator = dateComparator.reversed();
        }

        Collections.sort(ordersList, dateComparator);
    }
    public List<Orders> getOrdersWithinDateRange(String startDate, String endDate) {
        List<Orders> ordersWithinRange = new ArrayList<>();
        // Assuming getOrderDate() returns the order date in a comparable format (e.g., YYYY-MM-DD)

        for (Orders order : ordersList) {
            String orderDate = order.getOrderDate();
            if (orderDate.compareTo(startDate) >= 0 && orderDate.compareTo(endDate) <= 0) {
                ordersWithinRange.add(order);
            }
        }

        return ordersWithinRange;
    }
    
    public void addProductReference(OrderDetails orderDetails) {
    	this.orderDetailsList.add(orderDetails);	
    }
    

	public double CalculateTotalAmount() {
	    for (OrderDetails orderDetail : orderDetailsList) {
	         totalAmount += orderDetail.calculateSubtotal();
	    }
        try {
            if (totalAmount < 0) {
                throw new InvalidDataException("Total amount cannot be negative");
            }
            return totalAmount;
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
            
            return 0.0;
        }
	};
	
	public void GetOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Order Details:");
        for (OrderDetails orderDetail : orderDetailsList) {
            orderDetail.getOrderDetailInfo();
        }
	};
	public void UpdateOrderStatus(String newStatus) {
		this.orderStatus = newStatus;
	};
	public void CancelOrder() {
		this.orderStatus = "Canceled";
	};
	
}
