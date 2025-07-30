package com.project.clientbackendchallenge.service;

import com.project.clientbackendchallenge.model.FinancialProduct;
import com.project.clientbackendchallenge.repository.FinancialProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialProductService {
    @Autowired
    private FinancialProductRepository financialProductRepository;

    public List<FinancialProduct> listFinancialProducts() {
        return financialProductRepository.findAll();
    }

    public List<FinancialProduct> listFinancialProductsByUniqueCode(String uniqueCodeClient) {
        List<FinancialProduct> financialProducts = financialProductRepository.findByIdClient_UniqueCode(uniqueCodeClient);

        if(financialProducts.isEmpty()) {
            throw new RuntimeException("The client with code: " + uniqueCodeClient + " doesn't have any financial products");
        }
        return financialProducts;
    }
}
