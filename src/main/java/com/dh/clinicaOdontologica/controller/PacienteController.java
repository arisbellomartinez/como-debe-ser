package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.Paciente;
import com.dh.clinicaOdontologica.entity.Turno;
import com.dh.clinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @PostMapping()
    public ResponseEntity<?> crearPaciente(@RequestBody Paciente paciente){
        pacienteService.agregarPaciente(paciente);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente creado");
    }

    @GetMapping("/listarTodos")
    public List<Paciente> listarPacientes() {
        return pacienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Paciente> listarPacientePorId(@PathVariable Long id){
        return pacienteService.listarPaciente(id);
    }

    @PutMapping()
    public ResponseEntity<String> actualizarPaciente(@RequestBody Paciente paciente){
        pacienteService.modificarPaciente(paciente);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente actualizado");
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable("id") Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente eliminado");
    }

}
