package com.tns.ifet.placementmanagementsystem.admin.services;

public class AdminService {
	import com.example.placementmanagement.model.Admin;
	import com.example.placementmanagement.repository.AdminRepository;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import java.util.List;
	import java.util.Optional;

	@Service
	public class AdminService {

	    @Autowired
	    private AdminRepository adminRepository;

	    // Create a new admin
	    public Admin saveAdmin(Admin admin) {
	        return adminRepository.save(admin);
	    }

	    // Get all admins
	    public List<Admin> getAllAdmins() {
	        return adminRepository.findAll();
	    }

	    // Get an admin by ID
	    public Optional<Admin> getAdminById(Long id) {
	        return adminRepository.findById(id);
	    }

	    // Get an admin by username
	    public Optional<Admin> getAdminByUsername(String username) {
	        return adminRepository.findByUsername(username);
	    }

	    // Update Admin Details
	    public Admin updateAdmin(Long id, Admin adminDetails) {
	        Admin admin = adminRepository.findById(id).orElseThrow(() -> new RuntimeException("Admin not found"));
	        admin.setUsername(adminDetails.getUsername());
	        admin.setPassword(adminDetails.getPassword());
	        admin.setEmail(adminDetails.getEmail());
	        admin.setPhoneNumber(adminDetails.getPhoneNumber());
	        admin.setRole(adminDetails.getRole());
	        return adminRepository.save(admin);
	    }

	    // Delete an Admin
	    public void deleteAdmin(Long id) {
	        adminRepository.deleteById(id);
	    }
	}

}
