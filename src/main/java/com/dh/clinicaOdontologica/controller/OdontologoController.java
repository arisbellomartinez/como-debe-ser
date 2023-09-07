package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.dto.OdontologoDTO;
import com.dh.clinicaOdontologica.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping()
    public ResponseEntity<?> crearOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.agregarOdontologo(odontologoDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo creado");
    }

    @GetMapping("/listarTodos")
    public Set<OdontologoDTO> listarOdontologos() {
        return odontologoService.listarTodos();
    }

    @GetMapping("/{id}")
    public OdontologoDTO listarOdontologoPorId(@PathVariable Long id){
        return odontologoService.listarOdontologo(id);
    }

    @PutMapping()
    public ResponseEntity<String> actualizarOdontologo(@RequestBody OdontologoDTO odontologoDTO){
        odontologoService.modificarOdontologo(odontologoDTO);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo actualizado");
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable("id") Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo eliminado");
    }

}
