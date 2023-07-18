package com.deanofwalls.jam.model;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "jam_db")
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generates auto-incremented primary key value for the 'id' field
    private long id;
    private String companyName; // Stores the name of the company
    private String jobTitle; // Stores the job title
    private String companyURL; // Stores the URL of the company's website
    private String jobURL; // Stores the URL of the job posting
    private String contactName; // Stores the name of the contact person
    private String contactEmail; // Stores the email address of the contact person
    private String contactLinkedin; // Stores the LinkedIn profile URL of the contact person
    private LocalDate dateContacted; // Stores the date when the contact was made
    private Boolean replied; // Indicates whether a reply has been received (true/false)
    private LocalDate interviewDate; // Stores the date of the interview
    private LocalDate thankedDate; // Stores the date when a thank-you note was sent

    public JobApplication() {
        // Default constructor
    }

    public JobApplication(long id, String companyName, String jobTitle, String companyURL, String jobURL, String contactName, String contactEmail, String contactLinkedin, LocalDate dateContacted, Boolean replied, LocalDate interviewDate, LocalDate thankedDate) {
        // Parameterized constructor for setting all the fields
        this.id = id;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.companyURL = companyURL;
        this.jobURL = jobURL;
        this.contactName = contactName;
        this.contactEmail = contactEmail;
        this.contactLinkedin = contactLinkedin;
        this.dateContacted = dateContacted;
        this.replied = replied;
        this.interviewDate = interviewDate;
        this.thankedDate = thankedDate;
    }

    // Getter and setter methods for each field
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
