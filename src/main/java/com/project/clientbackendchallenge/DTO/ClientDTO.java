package com.project.clientbackendchallenge.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClientDTO {
    private String name;
    private String lastname;
    private String typeDocument;
    private String numberDocument;
}
