package com.dh.clinicaOdontologica.service.Impl;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.dh.clinicaOdontologica.entity.dto.OdontologoDTO;
import com.dh.clinicaOdontologica.repository.IOdontologoRepository;
import com.dh.clinicaOdontologica.service.IOdontologoService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Autowired
    ObjectMapper mapper;

    @Override
    public OdontologoDTO listarOdontologo(Long id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        return mapper.convertValue(odontologo, OdontologoDTO.class);
    };
    @Override
    public Set<OdontologoDTO> listarTodos(){
        List<Odontologo> odontologos = odontologoRepository.findAll();
        Set<OdontologoDTO> odontologosDTO = new HashSet<>();

        for (Odontologo odontologo: odontologos) {
            odontologosDTO.add(mapper.convertValue(odontologo, OdontologoDTO.class));
        }
        return odontologosDTO;
    };

    @Override
    public void agregarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologoAux(odontologoDTO);
    }

    @Override
    public void modificarOdontologo(OdontologoDTO odontologoDTO) {
        guardarOdontologoAux(odontologoDTO);
    };

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
    };

    public void guardarOdontologoAux(OdontologoDTO odontologoDTO){
        Odontologo odontologo = mapper.convertValue(odontologoDTO, Odontologo.class);
        odontologoRepository.save(odontologo);
    }
};