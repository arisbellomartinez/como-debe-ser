package com.dh.clinicaOdontologica.service.Impl;

import com.dh.clinicaOdontologica.entity.dto.OdontologoDTO;
import com.dh.clinicaOdontologica.service.IOdontologoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class OdontologoServiceTest {

    @Autowired
    OdontologoService odontologoService;

    @Test
    public void testOdontologosService(){

        OdontologoDTO odontologoDTO = new OdontologoDTO();
        odontologoDTO.setNombre("Manuel");
        odontologoDTO.setApellido("Gardon");

        odontologoService.agregarOdontologo(odontologoDTO);

        assertNotNull(odontologoService.listarTodos());


    }


}