package com.deanofwalls.jam.service;

import com.deanofwalls.jam.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/app", method = RequestMethod.GET)
public interface IJobApplicationService {
//    @Autowired
//    private JobApplicationRepository jobApplicationRepository;

//    @PostMapping(value = "/create", consumes = "application/json")
}
