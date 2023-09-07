package com.dh.clinicaOdontologica.service.Impl;

import com.dh.clinicaOdontologica.entity.Turno;
import com.dh.clinicaOdontologica.entity.dto.TurnoDTO;
import com.dh.clinicaOdontologica.repository.ITurnoRepository;
import com.dh.clinicaOdontologica.service.ITurnoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TurnoService implements ITurnoService{

    @Autowired
    ITurnoRepository turnoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public void crearTurno(TurnoDTO turnoDTO) {
        Turno turno = mapper.convertValue(turnoDTO, Turno.class);
        turnoRepository.save(turno);
    }

    @Override
    public void eliminarTurno(Long id) {
        turnoRepository.deleteById(id);
    }


}
