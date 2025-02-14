package com.tns.ifet.placementmanagementsystem.admin.entity;

public class Admin {
	import jakarta.persistence.*;
	import jakarta.validation.constraints.*;

	@Entity
	@Table(name = "admins")
	public class Admin {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;  // Admin ID (Primary Key)

	    @Column(nullable = false, unique = true)
	    @Size(min = 3, max = 50, message = "Username should be between 3 to 50 characters")
	    private String username;  // Admin Username (Unique)

	    @Column(nullable = false)
	    @Size(min = 8, message = "Password must be at least 8 characters")
	    private String password;  // Admin Password

	    @Column(nullable = false, unique = true)
	    @Email(message = "Invalid email format")
	    private String email;  // Admin Email (Unique)

	    @Column(nullable = false)
	    @Pattern(regexp = "^[6-9]\\d{9}$", message = "Invalid phone number")
	    private String phoneNumber;  // Contact Number

	    @Column(nullable = false)
	    private String role;  // Admin Role (e.g., "Super Admin", "HR", etc.)

	    // Constructors
	    public Admin() {}

	    public Admin(Long id, String username, String password, String email, String phoneNumber, String role) {
	        this.id = id;
	        this.username = username;
	        this.password = password;
	        this.email = email;
	        this.phoneNumber = phoneNumber;
	        this.role = role;
	    }

	    // Getters and Setters
	    public Long getId() {
	        return id;
	    }

	    public void setId(Long id) {
	        this.id = id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhoneNumber() {
	        return phoneNumber;
	    }

	    public void setPhoneNumber(String phoneNumber) {
	        this.phoneNumber = phoneNumber;
	    }

	    public String getRole() {
	        return role;
	    }

	    public void setRole(String role) {
	        this.role = role;
	    }

	    // Overridden toString() Method
	    @Override
	    public String toString() {
	        return "Admin{" +
	                "id=" + id +
	                ", username='" + username + '\'' +
	                ", email='" + email + '\'' +
	                ", phoneNumber='" + phoneNumber + '\'' +
	                ", role='" + role + '\'' +
	                '}';
	    }
	}


}
