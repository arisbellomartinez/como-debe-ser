package com.dh.clinicaOdontologica.service.implement;

import com.dh.clinicaOdontologica.entity.Paciente;
import com.dh.clinicaOdontologica.repository.IPacienteRepository;
import com.dh.clinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService implements IPacienteService {

    @Autowired
    IPacienteRepository pacienteRepository;

    @Override
    public void agregarPaciente(Paciente paciente) {
        guardarPacienteAux(paciente);
    }

    @Override
    public Optional<Paciente> listarPaciente(Long id) {
        return pacienteRepository.findById(id);
    }

    @Override
    public void modificarPaciente(Paciente paciente) {
        guardarPacienteAux(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteRepository.deleteById(id);
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacienteRepository.findAll();
    }
    public void guardarPacienteAux(Paciente paciente){
        pacienteRepository.save(paciente);
    }
}
