package TNS.PMS;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/applications")
public class ApplicationController {
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