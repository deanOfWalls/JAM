package com.deanofwalls.jam.repository;

import com.deanofwalls.jam.model.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import org.springframework.transaction.annotation.Transactional;
//import javax.transaction.Transactional;

@Repository
public interface JobApplicationRepository extends JpaRepository<JobApplication, Long> { //Type Long matches the primary key

    //Need to create or update fields for given primary key {id}
    @Transactional
    @Modifying
    @Query("UPDATE JobApplication SET companyName = :companyName WHERE id = :id")
    int updateFields(@Param("id") Long id, @Param("companyName") String companyName);
    // The above query updates the 'companyName' field in the 'JobApplication' entity
    // for the record with the given 'id' parameter
    // The @Param annotations are used to bind the method parameters to the named parameters
    // in the query string

}
