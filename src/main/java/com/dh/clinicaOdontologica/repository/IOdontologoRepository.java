package com.dh.clinicaOdontologica.repository;

import com.dh.clinicaOdontologica.entity.Odontologo;
import org.springframework.data.repository.CrudRepository;

public interface IOdontologoRepository<O> extends CrudRepository<Odontologo, Long> {
}
