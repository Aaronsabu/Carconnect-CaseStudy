package com.hexaware.carconnect;

public interface AdminService {
    Admin getAdminById(int adminId) throws AdminNotFoundException;
    Admin getAdminByUsername(String username);
    void registerAdmin(Admin admin);
    void updateAdmin(Admin updatedAdmin);
    void deleteAdmin(int adminId);
}
