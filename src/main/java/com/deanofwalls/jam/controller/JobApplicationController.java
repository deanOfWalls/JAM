package com.deanofwalls.jam.controller;

import com.deanofwalls.jam.service.JobApplicationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JobApplicationController {


    @Autowired
    JobApplicationServiceImpl jobAppServiceImp = new JobApplicationServiceImpl();

    @RequestMapping("/hello")
    private String helloWorld() {
        return jobAppServiceImp.helloWorld();
    }

    @RequestMapping("/bye")
    private String goodbyeWorld() {
        return jobAppServiceImp.goodbyeWorld();
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.POST)
    private String welcome(@RequestBody String name) {
        return jobAppServiceImp.welcome(name);
    }
}

// GET /hello-world/ and recieve a "Hello World" payload with a response of 200 OK
// The GET /hello-world/ should call a helloWorld() function.
// Your app should call your Controller and Service classes.
