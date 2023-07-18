package com.deanofwalls.jam.service;

import com.deanofwalls.jam.model.JobApplication;
import com.deanofwalls.jam.repository.JobApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JobApplicationServiceImpl {
    @Autowired
    private final JobApplicationRepository jobApplicationRepository; // Since it's private, no other object can reference this variable

    public JobApplicationServiceImpl(JobApplicationRepository jobApplicationRepository) {
        // Constructor of JobApplicationServiceImpl
        // Upon instantiation, it receives a JobApplicationRepository object as an argument
        // and assigns it to the jobApplicationRepository instance variable of the service
        this.jobApplicationRepository = jobApplicationRepository;
    }

    public String updateCompanyName(Long id, String companyName) {
        // Calls the updateFields method of the jobApplicationRepository instance variable (Repository class)
        // passing the id and companyName parameters
        int updatedRows = jobApplicationRepository.updateFields(id, companyName);
        if (updatedRows > 0) {
            // Returns a success message
            return "Company name updated successfully";
        } else {
            // Returns an error message if the update operation fails
            return "Update failed: No such company exists with the given ID";
        }
    }

    public String getCompanyName(Long id) {
        // Calls the findById method of the jobApplicationRepository instance variable (Repository class)
        // passing the id parameter
        Optional<JobApplication> jobApplicationOptional = jobApplicationRepository.findById(id);
        // Uses Optional's map and orElse methods to handle the presence or absence of a JobApplication object
        // If a JobApplication object exists, it retrieves the company name using the getCompanyName method reference
        // If no JobApplication object is found, it returns a default "Company not found" message
        return jobApplicationOptional.map(JobApplication::getCompanyName).orElse("Company not found");
    }
}
