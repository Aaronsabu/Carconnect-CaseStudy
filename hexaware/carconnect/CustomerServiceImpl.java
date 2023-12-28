package com.hexaware.carconnect;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customers;

    public CustomerServiceImpl() {
        // Initialize customers list
        customers = new ArrayList<>();
    }

    @Override
    public Customer getCustomerById(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == customerId) {
                return customer;
            }
        }
        return null; // Return null if customer is not found
    }

    @Override
    public Customer getCustomerByUsername(String username) {
        for (Customer customer : customers) {
            if (customer.getUsername().equals(username)) {
                return customer;
            }
        }
        return null; // Return null if customer with username is not found
    }

    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void updateCustomer(Customer updatedCustomer) {
        for (Customer customer : customers) {
            if (customer.getCustomerID() == updatedCustomer.getCustomerID()) {
                // Update the existing customer with new information
                customer.setFirstName(updatedCustomer.getFirstName());
                customer.setLastName(updatedCustomer.getLastName());
                customer.setEmail(updatedCustomer.getEmail());
                customer.setPhoneNumber(updatedCustomer.getPhoneNumber());
                customer.setAddress(updatedCustomer.getAddress());
                customer.setUsername(updatedCustomer.getUsername());
                customer.setPassword(updatedCustomer.getPassword());
                customer.setRegistrationDate(updatedCustomer.getRegistrationDate());
                // Update other customer details accordingly
                return;
            }
        }
        // Handle case if the customer to be updated is not found
        System.out.println("Customer not found for update.");
    }

    @Override
    public void deleteCustomer(int customerId) {
        customers.removeIf(customer -> customer.getCustomerID() == customerId);
    }
}
