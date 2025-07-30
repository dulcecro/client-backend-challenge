package com.project.clientbackendchallenge.controller;

import com.project.clientbackendchallenge.model.FinancialProduct;
import com.project.clientbackendchallenge.service.FinancialProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/challenge")
public class FinancialProductController {
    @Autowired
    private FinancialProductService financialProductService;

    @GetMapping("/financialProduct")
    public List<FinancialProduct> listFinancialProducts() {
        return financialProductService.listFinancialProducts();
    }

    @GetMapping("/financialProduct/{uniqueCodeClient}")
    public List<FinancialProduct> listFinancialProductsByUniqueCode(@PathVariable String uniqueCodeClient) {
        return financialProductService.listFinancialProductsByUniqueCode(uniqueCodeClient);
    }
}
