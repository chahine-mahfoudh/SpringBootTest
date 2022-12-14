package com.example.chahinemahfoudh.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
public class User implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;

    private String email;

    private String pwd;

    private String fName;

    private String lName;


    @Enumerated(EnumType.STRING)
    private Role role;

@ManyToMany
private Set<Project> projects;

@OneToMany
private Set<Project> project;





}
