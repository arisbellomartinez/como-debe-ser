package com.dh.clinicaOdontologica.repository.impl;

import com.dh.clinicaOdontologica.entity.Odontologo;
import com.dh.clinicaOdontologica.repository.IOdontologoRepository;

import java.util.Optional;

public class ImplOdontologoRepositoryH2 implements IOdontologoRepository<Odontologo> {
    @Override
    public <S extends Odontologo> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Odontologo> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Odontologo> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Odontologo> findAll() {
        return null;
    }

    @Override
    public Iterable<Odontologo> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Odontologo entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Odontologo> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
