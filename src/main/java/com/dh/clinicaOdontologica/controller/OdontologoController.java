package com.dh.clinicaOdontologica.controller;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.dh.clinicaOdontologica.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {

    @Autowired
    IOdontologoService odontologoService;

    @PostMapping()
    public ResponseEntity<?> crearOdontologo(@RequestBody Odontologo odontologo){
        odontologoService.agregarOdontologo(odontologo);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo creado");
    }

    @GetMapping("/listarTodos")
    public List<Odontologo> listarOdontologos() {
        return odontologoService.listarTodos();
    }

    @GetMapping("/{id}")
    public Optional<Odontologo> listarOdontologoPorId(@PathVariable Long id){
        return odontologoService.listarOdontologo(id);
    }

    @PutMapping()
    public ResponseEntity<String> actualizarOdontologo(@RequestBody Odontologo odontologo){
        odontologoService.modificarOdontologo(odontologo);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo actualizado");
    }

    @DeleteMapping("eliminar/{id}")
    public ResponseEntity<?> eliminarOdontologo(@PathVariable("id") Long id){
        odontologoService.eliminarOdontologo(id);
        return ResponseEntity.status(HttpStatus.OK).body("Odontologo eliminado");
    }

}
