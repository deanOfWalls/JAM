package com.deanofwalls.jam.service;

import com.deanofwalls.jam.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationServiceImpl{
    @Autowired
    private final JobApplicationRepository jobApplicationRepository; // Since it's private, no other object can reference this variable

    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
        // Constructor of JobApplicationServiceImpl
        // Upon instantiation, it receives a JobApplicationRepository object as an argument
        // and assigns it to the jobApplicationRepository instance variable of the service
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public String helloWorld() {
        // Returns a string "Hello world"
        String hello = "Hello world";
        return hello;
    }

    public String goodbyeWorld() {
        // Returns a string "Goodbye world"
        String goodbye = "Goodbye world";
        return goodbye;
    }

    public String welcome(String name) {
        // Returns a string "Welcome, " concatenated with the provided name parameter
        String welcome = "Welcome, " + name;
        return welcome;
    }
}
