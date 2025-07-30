package com.project.clientbackendchallenge.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private int idClient;

    @Column(name = "unique_code")
    private String uniqueCode;

    private String name;
    private String lastname;

    @Column(name = "type_document")
    private String typeDocument;

    @Column(name = "number_document")
    private String numberDocument;

//    @OneToMany(mappedBy = "idClient", cascade = CascadeType.ALL)
//    private List<FinancialProduct> listFinancialProduct;
}
