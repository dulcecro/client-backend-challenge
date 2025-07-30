package com.project.clientbackendchallenge.model;

import jakarta.persistence.*;

@Entity
@Table(name = "financial_product")
public class FinancialProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo_producto")
    private String tipoProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    private double saldo;
}
