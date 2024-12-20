import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @PostMapping("/search")
    public String search(@RequestParam("query") String query, Model model) {
        // Mock search results
        model.addAttribute("query", query);
        model.addAttribute("results", List.of("Job 1", "Internship 1", "Job 2", "Internship 2"));
        return "results";
    }
}
