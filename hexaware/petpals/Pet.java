package com.hexaware.petpals;

public class Pet {
	
	public class InvalidPetAgeException extends Exception {
	    public InvalidPetAgeException(String message) {
	        super(message);
	    }
	}
	
    private String name;
    private int age;
    private String breed;

    public Pet(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        try {
            if (name == null) {
                throw new NullPointerException("Name cannot be null.");
            }
            this.name = name;
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the error - display a message or take appropriate action
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        try {
            if (age <= 0) {
                throw new InvalidPetAgeException("Age should be a positive integer.");
            }
            this.age = age;
        } catch (InvalidPetAgeException e) {
            System.out.println("Error: " + e.getMessage());
            // Handle the error - display a message or take appropriate action
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed='" + breed + '\'' +
                '}';
    }
}
