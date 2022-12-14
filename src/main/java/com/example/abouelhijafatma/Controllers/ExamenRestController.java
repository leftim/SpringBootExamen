package com.example.abouelhijafatma.Controllers;

import com.example.abouelhijafatma.Entities.Project;
import com.example.abouelhijafatma.Entities.Sprint;
import com.example.abouelhijafatma.Entities.User;
import com.example.abouelhijafatma.Repositories.ProjectRepository;
import com.example.abouelhijafatma.Repositories.SprintRepository;
import com.example.abouelhijafatma.Repositories.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("examen")
public class ExamenRestController {
    @Autowired
    ProjectRepository projectRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    SprintRepository sprintRepository;

    @PostMapping("/addproject")
    public Project addProject(@RequestBody Project project) {
        return	projectRepository.save(project);
    }

    @PostMapping("/addsprint")
    public Sprint addSprint(@RequestBody Sprint sprint) {
        return sprintRepository.save(sprint);
    }

    @PostMapping("/adduser")
    public User addUser(@RequestBody User user) {
        return	userRepository.save(user);
    }

    @PutMapping("/assignprojectToUser/{projectId}/{Userid}")
    public void assignProjectToUser(@PathVariable int projectId,@PathVariable int Userid){
        Project project = projectRepository.findById(projectId).get();
        User user = userRepository.findById(Userid).get();
        List<Project> projectList = user.getProjectlist();
        projectList.add(project);
        userRepository.save(user);
    }

    @PutMapping("/assignProjectToClient/{projectId}/{firstName}/{lastName}")
    public void assignProjectToClient(@PathVariable int projectId, @PathVariable String firstName, @PathVariable String lastName){
        Project project = projectRepository.findById(projectId).get();
        User user = userRepository.findByFirstnameAndLastname(firstName,lastName);
        List<Project> proj = user.getProjects();
        proj.add(project);
        user.setProjects(proj);
        userRepository.save(user);

    }






}
