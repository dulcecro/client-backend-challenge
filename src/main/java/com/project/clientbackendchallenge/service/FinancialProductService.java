package com.project.clientbackendchallenge.service;

import com.project.clientbackendchallenge.repository.FinancialProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinancialProductService {
    @Autowired
    private FinancialProductRepository financialProductRepository;
}
