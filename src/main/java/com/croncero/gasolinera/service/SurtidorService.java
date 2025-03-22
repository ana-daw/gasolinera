package com.croncero.gasolinera.service;

import com.croncero.gasolinera.model.Surtidor;
import com.croncero.gasolinera.repository.SurtidorRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SurtidorService {

    @Autowired
    private SurtidorRepository surtidorRepository;

    public List<Surtidor> getAll() {
        return surtidorRepository.findAll();
    }

    public Surtidor getById(Long id) {
        return surtidorRepository.findById(id).orElseThrow();
    }

    public Surtidor create(Surtidor surtidor) {
        return surtidorRepository.save(surtidor);
    }

    public Surtidor update(Surtidor surtidorActualizado) {
        // Comprobamos que el surtidor existe
        Surtidor surtidor = surtidorRepository.findById(surtidorActualizado.getId()).orElseThrow();

        // Actualizamos sus campos
        surtidor.setNumero(surtidorActualizado.getNumero());
        surtidor.setActivo(surtidorActualizado.isActivo());

        return surtidorRepository.save(surtidor);
    }

    public void delete(Long id) {
        surtidorRepository.deleteById(id);
    }
}
