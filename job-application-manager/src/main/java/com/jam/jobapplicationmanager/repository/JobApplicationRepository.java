package java.com.jam.jobapplicationmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.com.jam.jobapplicationmanager.model.JobApplication;

public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {

    //additional query methods


}
