package com.deanofwalls.jam.repository;

import com.deanofwalls.jam.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> {
//    Long findById();

}
