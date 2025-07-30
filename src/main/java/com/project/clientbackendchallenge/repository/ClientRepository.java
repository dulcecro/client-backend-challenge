package com.project.clientbackendchallenge.repository;

import com.project.clientbackendchallenge.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
