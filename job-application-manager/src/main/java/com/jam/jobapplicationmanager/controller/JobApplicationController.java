package java.com.jam.jobapplicationmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.com.jam.jobapplicationmanager.model.JobApplication;
import java.com.jam.jobapplicationmanager.service.JobApplicationService;
import java.util.List;


@RestController
//this is basically @Controller and @ResponseBody combined in a single annotation. all action methods in this class will return the JSON response
@RequestMapping("/")
//specifies a method in the controller that should be responsible for serving the HTTP request to the given path
public class JobApplicationController {
//methods mapped to CRUD operations using annotations like @GetMapping, @PostMapping, etc.


    private final JobApplicationService jobApplicationService;

    @Autowired
    public JobApplicationController(JobApplicationService jobApplicationService) {
        this.jobApplicationService = jobApplicationService;
    }

    @GetMapping
    public ResponseEntity<List<JobApplication>> getAllJobApplications() {
        List<JobApplication> jobApplications = jobApplicationService.getAllJobApplications();
        return ResponseEntity.ok(jobApplications);
    }

    @GetMapping("/{id}")
    public ResponseEntity<JobApplication> getJobApplicationById(@PathVariable Long id) {
        JobApplication jobApplication = jobApplicationService.getJobApplicationById(id);
        return ResponseEntity.ok(jobApplication);
    }

    @PostMapping
    public ResponseEntity<JobApplication> createJobApplication(@RequestBody JobApplication jobApplication) {
        JobApplication createdJobApplication = jobApplicationService.saveJobApplication(jobApplication);
        return new ResponseEntity<>(createdJobApplication, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<JobApplication> updateJobApplication(@PathVariable Long id, @RequestBody JobApplication jobApplication) {
        jobApplication.setId(Math.toIntExact(id));
        JobApplication updatedJobApplication = jobApplicationService.saveJobApplication(jobApplication);
        return ResponseEntity.ok(updatedJobApplication);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteJobApplication(@PathVariable Long id) {
        jobApplicationService.deleteJobApplication(id);
        return ResponseEntity.noContent().build();
    }


}
