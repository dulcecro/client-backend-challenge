package com.project.clientbackendchallenge.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class FinancialProductDTO {

    private String typeProduct;
    private String nameProduct;
    private double balance;
}
