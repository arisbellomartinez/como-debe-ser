package com.dh.clinicaOdontologica.entity.dto;

import java.time.LocalDate;

public class PacienteDTO {

    private Long id;
    private String nombre;
    private String apellido;

    public PacienteDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
