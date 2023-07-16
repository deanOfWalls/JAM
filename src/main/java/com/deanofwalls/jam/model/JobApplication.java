package com.deanofwalls.jam.model;


import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "jam_db")
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //generates auto incremented primary key value for id field
    private long id;
    private String companyName;
    private String jobTitle;
    private String companyURL;
    private String jobURL;
    private String contactName;
    private String contactEmail;
    private String contactLinkedin;
    private LocalDate dateContacted;
    private Boolean replied;
    private LocalDate interviewDate;
    private LocalDate thankedDate;

    public JobApplication() {
    }

    public JobApplication(long id, String companyName, String jobTitle, String companyURL, String jobURL, String contactName, String contactEmail, String contactLinkedin, LocalDate dateContacted, Boolean replied, LocalDate interviewDate, LocalDate thankedDate) {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyURL() {
        return companyURL;
    }

    public void setCompanyURL(String companyURL) {
        this.companyURL = companyURL;
    }

    public String getJobURL() {
        return jobURL;
    }

    public void setJobURL(String jobURL) {
        this.jobURL = jobURL;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactLinkedin() {
        return contactLinkedin;
    }

    public void setContactLinkedin(String contactLinkedin) {
        this.contactLinkedin = contactLinkedin;
    }

    public LocalDate getDateContacted() {
        return dateContacted;
    }

    public void setDateContacted(LocalDate dateContacted) {
        this.dateContacted = dateContacted;
    }

    public Boolean getReplied() {
        return replied;
    }

    public void setReplied(Boolean replied) {
        this.replied = replied;
    }

    public LocalDate getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(LocalDate interviewDate) {
        this.interviewDate = interviewDate;
    }

    public LocalDate getThankedDate() {
        return thankedDate;
    }

    public void setThankedDate(LocalDate thankedDate) {
        this.thankedDate = thankedDate;
    }
}
