package com.project.clientbackendchallenge.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "client")
@Getter
@Setter
@NoArgsConstructor
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String codigoUnico;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
}
