# JAM Technical Design Document

## Introduction
JAM (Job Application Tracker) is a web application designed to track job applications. It allows users to create, edit, and delete entries in a MySQL database to keep track of the jobs they have applied to. The application is built using Java, Spring Boot, React, Thymeleaf, and MySQL. The Model-View-Controller (MVC) architectural pattern is used to separate concerns and improve maintainability.

## System Architecture
The JAM system follows a client-server architecture. The client-side of the application is built using React and Thymeleaf, which handle the user interface and interaction. The server-side is implemented using Java and Spring Boot, providing the business logic and data persistence layer. MySQL is used as the database management system to store and retrieve job application data.

## Database Design
The MySQL database consists of a single table named job_applications. The table schema is defined as follows:

```sql
Copy code
CREATE TABLE job_applications (
ID INT PRIMARY KEY AUTO_INCREMENT,
company_name VARCHAR(45),
job_title VARCHAR(45),
company_url VARCHAR(45),
job_posting_url VARCHAR(45),
contact_name VARCHAR(45),
contact_email VARCHAR(45),
contact_linkedin VARCHAR(45),
date_contacted DATE,
responded TINYINT,
date_interview DATE,
date_thanked DATE
);
```

The table includes the following columns:

- ID: Unique identifier for each job application.
- company_name: Name of the company.
- job_title: Title of the job position.
- company_url: URL of the company's website.
- job_posting_url: URL of the job posting.
- contact_name: Name of the contact person.
- contact_email: Email address of the contact person.
- contact_linkedin: LinkedIn profile URL of the contact person.
- date_contacted: Date when the application was submitted.
- responded: Flag indicating whether a response has been received (0 = No, 1 = Yes).
- date_interview: Date of the interview.
- date_thanked: Date when a thank-you note was sent.

# System Components
## Client-Side Components
The client-side of the application is implemented using React and Thymeleaf. It includes the following components:

- ### Job Application Form: Allows users to enter details about a job application, such as company name, job title, contact information, etc.
- ### Job Application List: Displays a list of all job applications stored in the database. Users can view, edit, and delete entries from this list.
## Server-Side Components
The server-side of the application is implemented using Java and Spring Boot. It includes the following components:

- Controller: Handles HTTP requests and performs appropriate actions, such as retrieving job applications, creating new applications, updating existing applications, and deleting applications.
- Service: Implements the business logic of the application. It interacts with the database through the repository layer to perform CRUD (Create, Read, Update, Delete) operations on job applications.
- Repository: Provides an interface to interact with the MySQL database. It includes methods for querying and modifying job application data.
## Data Persistence
The application uses MySQL as the database management system to store and retrieve job application data. Spring Data JPA is used to interact with the database. The repository layer provides abstraction over the database operations, allowing the service layer to perform CRUD operations on job applications.

# User Interface Flow
1. The user accesses the JobAppTracker web application through a web browser.
2. The application presents the user with a list of job applications stored in the database.
3. The user can click on a job application
4. The user can add a new job application by filling out the Job Application Form with the required details and submitting the form.
5. Upon submission, the application validates the form inputs and saves the new job application to the database.
6. The user can edit an existing job application by clicking the edit button next to the respective entry in the Job Application List.
7. The application loads the job application details into the Job Application Form, allowing the user to make changes.
8. After making the desired edits, the user can save the changes, and the application updates the corresponding entry in the database.
9. The user can delete a job application by clicking the delete button next to the respective entry in the Job Application List.
10. The application prompts the user for confirmation and removes the selected job application from the database.
11. The user can perform search and filter operations on the job application list to quickly find specific entries based on criteria such as company name, job title, or application status.
12. The application provides an intuitive and responsive user interface, ensuring a seamless experience across different devices and screen sizes.
## Conclusion
The JAM web application leverages Java, Spring Boot, React, Thymeleaf, and MySQL to provide a robust solution for tracking job applications. By following the MVC architectural pattern,
the application separates concerns and promotes maintainability. With its intuitive user interface and efficient data persistence, JobAppTracker simplifies the process of managing and monitoring
job applications, helping users stay organized and informed throughout their job search journey.