package com.example.chahinemahfoudh.controllers;


import com.example.chahinemahfoudh.entities.Project;
import com.example.chahinemahfoudh.entities.Sprint;
import com.example.chahinemahfoudh.entities.User;
import com.example.chahinemahfoudh.repositories.ProjectRepo;
import com.example.chahinemahfoudh.repositories.SprintRepo;
import com.example.chahinemahfoudh.repositories.UserRepo;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@Slf4j
@org.springframework.web.bind.annotation.RestController
@RequestMapping("rest")
@AllArgsConstructor


public class RestController {

    @Autowired
    UserRepo userRepo;
    @Autowired
    SprintRepo sprintRepo;
    @Autowired
    ProjectRepo projectRepo;

    @PostMapping("/add-User")
    public User addUser(@RequestBody User entity) {
        return	userRepo.save(entity);
    }

    @PostMapping("/add-Project")
    public Project addProject(@RequestBody Project entity) {
        return	projectRepo.save(entity);
    }

    @PostMapping("/add-Sprint")
    public Sprint addSprint(@RequestBody Sprint entity) {
        return	sprintRepo.save(entity);
    }


    @GetMapping("/affecterProjectUser/{userId}/{projectId}")
    public void assignProjectToUser(@PathVariable int userId, @PathVariable Integer projectId ) {

        User user  =UserRepo.findById(userId).orElse(null);
        Project  project  =ProjectRepo.findById(projectId).orElse(null);

        user.setProjects(project);
        UserRepo.save(user);


    }


    @GetMapping("/affecterProjectClient/{userId}/{projectId}")
    public void assignProjectToUser(@PathVariable String fName,@PathVariable String lName, @PathVariable Integer projectId ) {
        User user =
        Project project  =ProjectRepo.findById(projectId).orElse(null);

        user.setProjects(project);
        UserRepo.save(user);


    }



}
