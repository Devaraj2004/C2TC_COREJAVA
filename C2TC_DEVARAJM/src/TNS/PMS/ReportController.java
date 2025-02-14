package TNS.PMS;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/reports")
public class ReportController {
    private Map<String, String> studentPlacements = new HashMap<>();
    
    @GetMapping("/")
    public Map<String, String> getPlacementReport() {
        return studentPlacements;
    }
}