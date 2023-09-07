package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.dto.PacienteDTO;
import com.dh.clinicaOdontologica.service.IPacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    IPacienteService pacienteService;

    @PostMapping()
    public ResponseEntity<?> crearPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.agregarPaciente(pacienteDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente creado");
    }

    @GetMapping("/listarTodos")
    public Set<PacienteDTO> listarPacientes() {
        return pacienteService.listarTodos();
    }

    @GetMapping("/{id}")
    public PacienteDTO listarPacientePorId(@PathVariable Long id){
        return pacienteService.listarPaciente(id);
    }

    @PutMapping()
    public ResponseEntity<String> actualizarPaciente(@RequestBody PacienteDTO pacienteDTO){
        pacienteService.modificarPaciente(pacienteDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente actualizado");
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarPaciente(@PathVariable("id") Long id){
        pacienteService.eliminarPaciente(id);
        return ResponseEntity.status(HttpStatus.OK).body("Paciente eliminado");
    }

}
