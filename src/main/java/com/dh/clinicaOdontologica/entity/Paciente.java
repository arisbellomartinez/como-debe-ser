package com.dh.clinicaOdontologica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
@Table(name = "paciente")
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
    private String apellido;
    private String domicilio;
    private Integer dni;
    private String fechaAlta;

    public Paciente() {}

    @Autowired
    public Paciente(String nombre, String apellido, String domicilio, Integer dni, String fechaAlta, Turno turno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
        this.turno = turno;
    }

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "paciente")
    private Turno turno;

}
