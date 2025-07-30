package com.project.clientbackendchallenge.repository;

import com.project.clientbackendchallenge.model.FinancialProduct;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinancialProductRepository extends JpaRepository<FinancialProduct, Integer> {

    List<FinancialProduct> findByIdClient_UniqueCode(String uniqueCodeClient);
}
