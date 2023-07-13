package com.deanofwalls.jam;

import com.deanofwalls.jam.model.JobApplication;
import com.deanofwalls.jam.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.batch.BatchProperties;

@SpringBootApplication
public class JamApplication {

    public static void main(String[] args) {
        SpringApplication.run(JamApplication.class, args);
    }
}
