import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        JobRepository jobRepo = new JobRepository();
        JobService jobService = new JobService(jobRepo);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Job and Internship Finder");
        
        while (true) {
            System.out.println("1. Add Job");
            System.out.println("2. View Jobs");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter Job ID: ");
                int id = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter Job Title: ");
                String title = scanner.nextLine();
                System.out.print("Enter Company Name: ");
                String company = scanner.nextLine();
                System.out.print("Enter Location: ");
                String location = scanner.nextLine();
                System.out.print("Enter Description: ");
                String description = scanner.nextLine();

                jobService.createJob(id, title, company, location, description);
                System.out.println("Job added successfully!");

            } else if (choice == 2) {
                jobService.getJobs().forEach(job -> 
                    System.out.println("ID: " + job.getId() + ", Title: " + job.getTitle() +
                                       ", Company: " + job.getCompany() + ", Location: " + job.getLocation())
                );
            } else if (choice == 3) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
