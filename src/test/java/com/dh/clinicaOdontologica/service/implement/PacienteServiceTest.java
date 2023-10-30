package com.dh.clinicaOdontologica.service.implement;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.dh.clinicaOdontologica.entity.Paciente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PacienteServiceTest {

    @Autowired
    PacienteService pacienteService;

    @Test
    public void listarPaciente() {

        Paciente paciente = new Paciente();
        paciente.setNombre("Marco");
        paciente.setApellido("Chiarva");

        pacienteService.agregarPaciente(paciente);

        assertNotNull(pacienteService.listarTodos());

    }
}