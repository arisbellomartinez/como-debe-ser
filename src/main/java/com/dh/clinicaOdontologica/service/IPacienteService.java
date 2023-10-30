package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface IPacienteService {

    Optional<Paciente> listarPaciente(Long id);
    List<Paciente> listarTodos();
    void agregarPaciente(Paciente paciente);
    void modificarPaciente(Paciente paciente);
    void eliminarPaciente(Long id);

}
