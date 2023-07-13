package com.deanofwalls.jam.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import java.util.Date;

@Entity
public class JobApplication {
    @Id
    @GeneratedValue
    private long id;
    private String companyName;
    private String jobTitle;
    private String companyURL;
    private String jobURL;
    private String contactName;
    private String contactEmail;
    private String contactLinkedin;
    private Date dateContacted;
    private Boolean replied;
    private Date interviewDate;
    private Date thankedDate;

    public JobApplication() {
    }
        public JobApplication(Long id, String firstName, String lastName, Date birthdate){

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

    public Date getDateContacted() {
        return dateContacted;
    }

    public void setDateContacted(Date dateContacted) {
        this.dateContacted = dateContacted;
    }

    public Boolean getReplied() {
        return replied;
    }

    public void setReplied(Boolean replied) {
        this.replied = replied;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public Date getThankedDate() {
        return thankedDate;
    }

    public void setThankedDate(Date thankedDate) {
        this.thankedDate = thankedDate;
    }
}
