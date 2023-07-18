package com.deanofwalls.jam.controller;

import com.deanofwalls.jam.service.JobApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobApplicationController {

    private final JobApplicationServiceImpl jobAppServiceImp; // Initialize but not assign the JobApplicationServiceImpl instance

    @Autowired
    public JobApplicationController(JobApplicationServiceImpl jobApplicationServiceImpl) {
        this.jobAppServiceImp = jobApplicationServiceImpl;
    }

    @PatchMapping(value = "/{id}")
    // Using /{id} for the endpoint will let me specify which row I want to perform operations on. Also using @PatchMapping instead of @RequestMapping
    public String updateCompanyName(@PathVariable Long id, @RequestBody String companyName) {
        // Calls the updateCompanyName method of the jobAppServiceImp instance variable (Service class)
        // passing the id and companyName parameters
        jobAppServiceImp.updateCompanyName(id, companyName);
        // Returns a success message
        return "Company name updated successfully";
    }

    @GetMapping(value = "/{id}")
    public String getCompanyName(@PathVariable Long id) {
        // Calls the getCompanyName method of the jobAppServiceImp instance variable (Service class)
        // passing the id parameter
        String companyName = jobAppServiceImp.getCompanyName(id);
        // Returns a string containing the company name
        return "Company name: " + companyName;
    }
}
