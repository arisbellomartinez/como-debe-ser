package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.Odontologo;

import java.util.List;
import java.util.Optional;

public interface IOdontologoService {

    Optional<Odontologo> listarOdontologo(Long id);
    List<Odontologo> listarTodos();
    void agregarOdontologo(Odontologo odontologo);
    void modificarOdontologo(Odontologo odontologo);
    void eliminarOdontologo(Long id);

}
