package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.dto.OdontologoDTO;

import java.util.Set;

public interface IOdontologoService {

    OdontologoDTO listarOdontologo(Long id);
    Set<OdontologoDTO> listarTodos();
    void agregarOdontologo(OdontologoDTO odontologoDTO);
    void modificarOdontologo(OdontologoDTO odontologoDTO);
    void eliminarOdontologo(Long id);

}
