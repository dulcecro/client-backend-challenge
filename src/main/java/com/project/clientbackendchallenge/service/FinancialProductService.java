package com.project.clientbackendchallenge.service;

import com.project.clientbackendchallenge.DTO.FinancialProductDTO;

import java.util.List;

public interface FinancialProductService {
    List<FinancialProductDTO> getFinancialProductByUniqueCode(String uniqueCode);
}
