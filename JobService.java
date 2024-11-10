public class JobService {
    private JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public void createJob(int id, String title, String company, String location, String description) {
        Job job = new Job(id, title, company, location, description);
        jobRepository.addJob(job);
    }

    public List<Job> getJobs() {
        return jobRepository.getAllJobs();
    }
}   
