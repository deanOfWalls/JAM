package com.deanofwalls.jam.service;

import com.deanofwalls.jam.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class JobApplicationServiceImpl implements IJobApplicationService {
    private final JobApplicationRepository jobApplicationRepository;

    @Autowired
    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository){
        this.jobApplicationRepository = jobApplicationRepository;
    }


    public String helloWorld() {
        String hello = "Hello world";
        return hello;
    }

    public String goodbyeWorld() {
        String goodbye = "Goodbye world";
        return goodbye;
    }

    public String welcome(String name) {
        String welcome = "Welcome, " + name;
        return welcome;
    }
}
