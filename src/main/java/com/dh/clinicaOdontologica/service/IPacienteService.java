package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.dto.PacienteDTO;

import java.util.Set;

public interface IPacienteService {

    PacienteDTO listarPaciente(Long id);
    Set<PacienteDTO> listarTodos();
    void agregarPaciente(PacienteDTO pacienteDTO);
    void modificarPaciente(PacienteDTO pacienteDTO);
    void eliminarPaciente(Long id);

}
