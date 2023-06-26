package java.com.jam.jobapplicationmanager.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController //this is basically @Controller and @ResponseBody combined in a single annotation. all action methods in this class will return the JSON response
@RequestMapping("/") //specifies a method in the controller that should be responsible for serving the HTTP request to the given path
public class JobApplicationController {


//methods mapped to CRUD operations using annotations like @GetMapping, @PostMapping, etc.



}
