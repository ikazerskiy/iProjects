package net.ikazerskiy.projects.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

}