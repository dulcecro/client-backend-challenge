package com.project.clientbackendchallenge.impl;

import com.project.clientbackendchallenge.DTO.FinancialProductDTO;
import com.project.clientbackendchallenge.mapper.FinancialProductMapper;
import com.project.clientbackendchallenge.model.FinancialProduct;
import com.project.clientbackendchallenge.repository.FinancialProductRepository;
import com.project.clientbackendchallenge.service.FinancialProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialProductServiceImpl implements FinancialProductService {
    private FinancialProductRepository repository;
    private FinancialProductMapper mapper;

    public FinancialProductServiceImpl(FinancialProductRepository repository, FinancialProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public List<FinancialProductDTO> getFinancialProductByUniqueCode(String uniqueCodeClient){
        List<FinancialProduct> financialProducts = repository.findByIdClient_UniqueCode(uniqueCodeClient);

        if (financialProducts.isEmpty()) {
            throw new RuntimeException("The client with code: " + uniqueCodeClient + " doesn't have any financial products");
        }

        return financialProducts.stream()
                .map(mapper::entityToDTO)
                .toList();

    }
}
