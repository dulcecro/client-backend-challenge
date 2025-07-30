package com.project.clientbackendchallenge.controller;

import com.project.clientbackendchallenge.service.FinancialProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/challenge")
public class FinancialProductController {
    @Autowired
    private FinancialProductService financialProductService;
}
