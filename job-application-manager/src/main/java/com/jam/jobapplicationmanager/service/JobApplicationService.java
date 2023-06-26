package java.com.jam.jobapplicationmanager.service;
import java.com.jam.jobapplicationmanager.model.JobApplication;
import java.util.List;

public interface JobApplicationService {

    //this interface will be used to interact with the data layer of the application
    List<JobApplication> getAllJobApplications();

    JobApplication getJobApplicationById(Long id);

    JobApplication saveJobApplication(JobApplication jobApplication);

    void deleteJobApplication(Long id);



}
