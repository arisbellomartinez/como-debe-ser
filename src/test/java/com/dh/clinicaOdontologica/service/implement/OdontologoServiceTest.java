package com.dh.clinicaOdontologica.service.implement;

import com.dh.clinicaOdontologica.entity.Odontologo;
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

        Odontologo odontologo = new Odontologo();
        odontologo.setNombre("Manuel");
        odontologo.setApellido("Gardon");

        odontologoService.agregarOdontologo(odontologo);

        assertNotNull(odontologoService.listarTodos());


    }


}