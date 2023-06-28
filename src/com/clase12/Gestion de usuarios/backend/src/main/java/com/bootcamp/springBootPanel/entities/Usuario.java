package com.bootcamp.springBootPanel.entities;

import lombok.*;

@Getter @Setter @AllArgsConstructor
public class Usuario {


    private String id;
    private String nombre;
    private String apellido;
    private long telefono;
    private String email;
}
