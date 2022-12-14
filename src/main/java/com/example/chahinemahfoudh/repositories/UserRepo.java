package com.example.chahinemahfoudh.repositories;

import com.example.chahinemahfoudh.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {




}
