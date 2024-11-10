import java.util.List;
import java.util.ArrayList;

public class InternshipRepository {
    private List<Internship> internships = new ArrayList<>();

    public void addInternship(Internship internship) {
        internships.add(internship);
    }

    public List<Internship> getAllInternships() {
        return new ArrayList<>(internships);
    }

    public Internship findInternshipById(int id) {
        return internships.stream().filter(internship -> internship.getId() == id).findFirst().orElse(null);
    }
}
