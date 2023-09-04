package com.dh.clinicaOdontologica.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Getter
@Setter
public class Turno {
    @Id
    @SequenceGenerator(name = "turnos_id", sequenceName = "turnos_id", initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "odontologo_id", nullable = false)
    private Odontologo odontologo;

    @OneToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    public Turno() {
    }

    @Autowired
    public Turno(Odontologo odontologo, Paciente paciente) {
        this.odontologo = odontologo;
        this.paciente = paciente;
    }

}
