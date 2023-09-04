package com.dh.clinicaOdontologica.service;

import com.dh.clinicaOdontologica.entity.dto.OdontologoDTO;
import com.dh.clinicaOdontologica.entity.dto.PacienteDTO;

public interface ITurnoService {

    void asignarTurno(OdontologoDTO odontologoDTO, PacienteDTO pacienteDTO);

}
