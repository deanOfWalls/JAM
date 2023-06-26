package java.com.jam.jobapplicationmanager.model;
import javax.persistence.*;
import java.util.Date;

@Entity
public class JobApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 45)
    private String companyName;

    @Column(length = 45)
    private String jobTitle;

    @Column(length = 45)
    private String companyUrl;

    @Column(length = 45)
    private String jobPostingUrl;

    @Column(length = 45)
    private String contactName;

    @Column(length = 45)
    private String contactEmail;

    @Column(length = 45)
    private String contactLinkedin;

    @Column
    private boolean responded; //can change this from private int to private boolean and Hibernate (the ORM used in Spring Boot) will default this map to a TINYINT(1) which is what is supported in MySQL

    @Temporal(TemporalType.DATE) //allows you to specify the precision of the date or time value that Hibernate will use when communicating with the database
    @Column
    private Date dateInterview;

    @Temporal(TemporalType.DATE)
    @Column
    private Date dateThanked;

//getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getCompanyUrl() {
        return companyUrl;
    }

    public void setCompanyUrl(String companyUrl) {
        this.companyUrl = companyUrl;
    }

    public String getJobPostingUrl() {
        return jobPostingUrl;
    }

    public void setJobPostingUrl(String jobPostingUrl) {
        this.jobPostingUrl = jobPostingUrl;
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

    public boolean isResponded() {
        return responded;
    }

    public void setResponded(boolean responded) {
        this.responded = responded;
    }

    public Date getDateInterview() {
        return dateInterview;
    }

    public void setDateInterview(Date dateInterview) {
        this.dateInterview = dateInterview;
    }

    public Date getDateThanked() {
        return dateThanked;
    }

    public void setDateThanked(Date dateThanked) {
        this.dateThanked = dateThanked;
    }
}
