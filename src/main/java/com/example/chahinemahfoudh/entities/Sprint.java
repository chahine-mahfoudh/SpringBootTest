package com.example.chahinemahfoudh.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor

public class Sprint implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSprint;

    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @ManyToOne
    private Project projects;



}
