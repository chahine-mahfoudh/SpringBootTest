package com.example.chahinemahfoudh.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor


public class Project implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;

    private String title;

    private String description;

    @ManyToMany (mappedBy="projects")
    Set<User> users;


    @OneToMany(mappedBy = "projects")
    private Set<Sprint> sprints;



}
