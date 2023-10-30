package com.dh.clinicaOdontologica.service.implement;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.dh.clinicaOdontologica.repository.IOdontologoRepository;
import com.dh.clinicaOdontologica.service.IOdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OdontologoService implements IOdontologoService {

    @Autowired
    IOdontologoRepository odontologoRepository;

    @Override
    public Optional<Odontologo> listarOdontologo(Long id) {
        Optional<Odontologo> odontologo = odontologoRepository.findById(id);
        return odontologo;
    };
    @Override
    public List<Odontologo> listarTodos(){
        return odontologoRepository.findAll();
    };

    @Override
    public void agregarOdontologo(Odontologo odontologo) {
        guardarOdontologoAux(odontologo);
    }

    @Override
    public void modificarOdontologo(Odontologo odontologo) {
        guardarOdontologoAux(odontologo);
    };

    @Override
    public void eliminarOdontologo(Long id) {
        odontologoRepository.deleteById(id);
    };

    public void guardarOdontologoAux(Odontologo odontologo){
        odontologoRepository.save(odontologo);
    }
};