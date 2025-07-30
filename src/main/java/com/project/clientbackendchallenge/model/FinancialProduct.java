package com.project.clientbackendchallenge.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "financial_product")
@Getter
@Setter
@NoArgsConstructor
public class FinancialProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_financial_product")
    private int idFinancialProduct;

    @Column(name = "type_product")
    private String typeProduct;

    @Column(name = "name_product")
    private String nameProduct;

    private double balance;

    @ManyToOne
    @JoinColumn(name = "id_client", nullable = false)
    private Client idClient;
}
