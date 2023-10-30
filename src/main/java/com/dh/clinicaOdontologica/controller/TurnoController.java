package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.Turno;
import com.dh.clinicaOdontologica.service.ITurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turnos")
public class TurnoController {

    @Autowired
    ITurnoService turnoService;

    @PostMapping()
    public ResponseEntity<?> crearTurno(@RequestBody Turno turno){
        turnoService.crearTurno(turno);
        return ResponseEntity.status(HttpStatus.OK).body("Turno creado");
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarTurno(@PathVariable("id") Long id){
        turnoService.eliminarTurno(id);
        return ResponseEntity.status(HttpStatus.OK).body("Turno eliminado");
    }

}
