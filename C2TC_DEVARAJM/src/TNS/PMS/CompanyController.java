package TNS.PMS;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/companies")
public class CompanyController {
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