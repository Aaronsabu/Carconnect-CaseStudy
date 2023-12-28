package com.hexaware.petpals;

import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PetShelter {
	
    private List<Pet> availablePets = new ArrayList<>();
    
    public void addPet(Pet pet) {
        availablePets.add(pet);
    }

    public void removePet(Pet pet) {
        availablePets.remove(pet);
    }

    public void listAvailablePets() {
        System.out.println("Available Pets:");
        for (Pet pet : availablePets) {
            System.out.println(pet);
        }
    }
    
    public void readDataFromFile(String filename) {
        try {
            File file = new File(filename);
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found or cannot be read.");
            // Handle the error - display a message or take appropriate action
        }
    }
    
    public void adoptPet(Pet pet) {
        try {
            if (!availablePets.contains(pet)) {
                throw new AdoptionException("Pet is not available for adoption.");
            }
        } catch (AdoptionException e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }
}
