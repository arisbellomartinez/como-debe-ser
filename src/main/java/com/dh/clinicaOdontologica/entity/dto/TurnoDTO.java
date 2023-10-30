package com.dh.clinicaOdontologica.entity.dto;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TurnoDTO {

    private Long id;
    private Odontologo odontologo;

}
