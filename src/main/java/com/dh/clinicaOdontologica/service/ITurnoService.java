package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.dto.TurnoDTO;

public interface ITurnoService {

    void crearTurno(TurnoDTO turnoDTO);
    void eliminarTurno(Long id);

}
