package com.project.clientbackendchallenge.mapper;

import com.project.clientbackendchallenge.DTO.FinancialProductDTO;
import com.project.clientbackendchallenge.model.FinancialProduct;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface FinancialProductMapper {
    FinancialProductDTO entityToDTO(FinancialProduct financialProduct);
}
