package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.Turno;

public interface ITurnoService {

    void crearTurno(Turno turno);
    void eliminarTurno(Long id);

}
