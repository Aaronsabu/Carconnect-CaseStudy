package com.hexaware.carconnect;

import java.util.ArrayList;
import java.util.List;

public class AdminServiceImpl implements AdminService {
    private List<Admin> admins = new ArrayList<>();

    @Override
    public Admin getAdminById(int adminId) throws AdminNotFoundException {
        for (Admin admin : admins) {
            if (admin.getAdminID() == adminId) {
                return admin;
            }
        }
        throw new AdminNotFoundException("Admin with ID " + adminId + " not found.");
    }

    @Override
    public Admin getAdminByUsername(String username) {
        for (Admin admin : admins) {
            if (admin.getUsername().equals(username)) {
                return admin;
            }
        }
        return null; // Return null if admin with username is not found
    }

    @Override
    public void registerAdmin(Admin admin) {
        admins.add(admin);
    }

    @Override
    public void updateAdmin(Admin updatedAdmin) {
        for (Admin admin : admins) {
            if (admin.getAdminID() == updatedAdmin.getAdminID()) {
                // Update the existing admin with new information
                admin.setFirstName(updatedAdmin.getFirstName());
                admin.setLastName(updatedAdmin.getLastName());
                admin.setEmail(updatedAdmin.getEmail());
                admin.setPhoneNumber(updatedAdmin.getPhoneNumber());
                admin.setUsername(updatedAdmin.getUsername());
                admin.setPassword(updatedAdmin.getPassword());
                admin.setRole(updatedAdmin.getRole());
                admin.setJoinDate(updatedAdmin.getJoinDate());
                // Update other admin details accordingly
                return;
            }
        }
        // Handle case if the admin to be updated is not found
        System.out.println("Admin not found for update.");
    }

    @Override
    public void deleteAdmin(int adminId) {
        admins.removeIf(admin -> admin.getAdminID() == adminId);
    }
}
