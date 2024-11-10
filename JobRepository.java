import java.util.List;
import java.util.ArrayList;

public class JobRepository {
    private List<Job> jobs = new ArrayList<>();

    public void addJob(Job job) {
        jobs.add(job);
    }

    public List<Job> getAllJobs() {
        return new ArrayList<>(jobs);
    }

    public Job findJobById(int id) {
        return jobs.stream().filter(job -> job.getId() == id).findFirst().orElse(null);
    }
}
