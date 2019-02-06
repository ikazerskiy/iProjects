package net.ikazerskiy.projects.rest.controller;

import net.ikazerskiy.projects.service.api.ProjectService;
import net.ikazerskiy.projects.service.api.dto.ProjectDto;
import net.ikazerskiy.projects.service.api.dto.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    @PostMapping()
    public SearchResult<ProjectDto> getProjectsList() {
        return projectService.findAll();
    }

}
