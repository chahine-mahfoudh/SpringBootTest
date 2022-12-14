package com.example.chahinemahfoudh.repositories;

import com.example.chahinemahfoudh.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProjectRepo extends JpaRepository<Project, Integer> {


    @Query("SELECT p FROM Project p INNER JOIN Sprint s on p.sprints=s.idSprint WHERE s.startDate>sysdate()")
    public Integer countByClasseRoleJPQL(@Param("role") Role role);
}
