package com.hexaware.techshop;

public class IncompleteOrderException extends Exception {
    public IncompleteOrderException(String message) {
        super(message);
    }
}
