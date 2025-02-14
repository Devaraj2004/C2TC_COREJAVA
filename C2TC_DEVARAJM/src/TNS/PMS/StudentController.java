package TNS.PMS;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/students")
public class StudentController {
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