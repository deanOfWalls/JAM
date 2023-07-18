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

//    @RequestMapping(value = "/hello", method = RequestMethod.GET)
//    private String helloWorld() {
//        // Handles a GET request to "/hello"
//        // Calls the helloWorld() method of jobAppServiceImp instance variable (Service class)
//        // and returns the result as a response
//        return jobAppServiceImp.helloWorld();
//    }
//
//    @RequestMapping(value = "/bye", method = RequestMethod.GET)
//    private String goodbyeWorld() {
//        // Handles a GET request to "/bye"
//        // Calls the goodbyeWorld() method of jobAppServiceImp instance variable (Service class)
//        // and returns the result as a response
//        return jobAppServiceImp.goodbyeWorld();
//    }

    @PatchMapping(value ="/{id}")
    //using /{id} for the endpoint will let me specify which row i want to perform operations on. also using @PatchMapping instead of @RequestMapping
    public String updateCompanyName(@PathVariable Long id, @RequestBody String companyName) {
        jobAppServiceImp.updateCompanyName(id, companyName);
        // Handles a POST request to "/welcome"
        // Expects a request body containing a string value (name)
        // Calls the welcome(String name) method of jobAppServiceImp instance variable (Service class)
        // passing the name parameter, and returns the result as a response
        return "Company name updated successfully";
    }

    @GetMapping(value ="/{id}")
    public String getCompanyName(@PathVariable Long id) {
        String companyName = jobAppServiceImp.getCompanyName(id);
        return "Company name: " + companyName;
    }
}