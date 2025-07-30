package com.project.clientbackendchallenge.repository;

import com.project.clientbackendchallenge.model.FinancialProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialProductRepository extends JpaRepository<FinancialProduct, Integer> {

}
