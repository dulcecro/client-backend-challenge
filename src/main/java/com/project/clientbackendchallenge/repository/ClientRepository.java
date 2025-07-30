package com.project.clientbackendchallenge.repository;

import com.project.clientbackendchallenge.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByUniqueCode(String uniqueCode);
}
