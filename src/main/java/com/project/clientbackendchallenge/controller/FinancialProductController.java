package com.project.clientbackendchallenge.controller;

import com.project.clientbackendchallenge.DTO.FinancialProductDTO;
import com.project.clientbackendchallenge.service.FinancialProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FinancialProductController {
    private FinancialProductService financialProductService;

    public FinancialProductController(FinancialProductService financialProductService) {
        this.financialProductService = financialProductService;
    }

    @GetMapping("/financialProduct/{uniqueCodeClient}")
    public ResponseEntity<List<FinancialProductDTO>> listFinancialProductsByUniqueCode (@PathVariable String uniqueCodeClient){
        return ResponseEntity.ok(financialProductService.getFinancialProductByUniqueCode(uniqueCodeClient));
    }
}
