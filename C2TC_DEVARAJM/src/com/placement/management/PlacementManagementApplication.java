package AssignmentMain;

public class PlacementManagementApplication {
	package com.placement.management;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.web.bind.annotation.*;
	import java.util.*;

	@SpringBootApplication
	public class PlacementManagementApplication {
	    public static void main(String[] args) {
	        SpringApplication.run(PlacementManagementApplication.class, args);
	    }
	}

	// Admin Login Module
	@RestController
	@RequestMapping("/admin")
	class AdminController {
	    private static final String ADMIN_USERNAME = "admin";
	    private static final String ADMIN_PASSWORD = "password";

	    @PostMapping("/login")
	    public String login(@RequestParam String username, @RequestParam String password) {
	        if (ADMIN_USERNAME.equals(username) && ADMIN_PASSWORD.equals(password)) {
	            return "Login successful";
	        }
	        return "Invalid credentials";
	    }
	}

	// Manage Students Module
	@RestController
	@RequestMapping("/students")
	class StudentController {
	    private List<String> students = new ArrayList<>(Arrays.asList("John Doe", "Jane Smith"));
	    
	    @GetMapping("/")
	    public List<String> getStudents() {
	        return students;
	    }
	    
	    @PostMapping("/add")
	    public String addStudent(@RequestParam String name) {
	        students.add(name);
	        return "Student added successfully";
	    }
	}

	// Manage Companies and Job Openings
	@RestController
	@RequestMapping("/companies")
	class CompanyController {
	    private List<String> companies = new ArrayList<>(Arrays.asList("Google", "Microsoft"));
	    
	    @GetMapping("/")
	    public List<String> getCompanies() {
	        return companies;
	    }
	    
	    @PostMapping("/add")
	    public String addCompany(@RequestParam String name) {
	        companies.add(name);
	        return "Company added successfully";
	    }
	}

	// Approve/Reject Student Applications
	@RestController
	@RequestMapping("/applications")
	class ApplicationController {
	    private Map<String, String> studentApplications = new HashMap<>();
	    
	    @PostMapping("/approve")
	    public String approveApplication(@RequestParam String student, @RequestParam String company) {
	        studentApplications.put(student, "Approved for " + company);
	        return "Application approved for " + student;
	    }
	    
	    @PostMapping("/reject")
	    public String rejectApplication(@RequestParam String student) {
	        studentApplications.put(student, "Rejected");
	        return "Application rejected for " + student;
	    }
	    
	    @GetMapping("/")
	    public Map<String, String> getApplications() {
	        return studentApplications;
	    }
	}

	// View Placement Reports & Statistics
	@RestController
	@RequestMapping("/reports")
	class ReportController {
	    private Map<String, String> studentPlacements = new HashMap<>();
	    
	    @GetMapping("/")
	    public Map<String, String> getPlacementReport() {
	        return studentPlacements;
	    }
	}

}
