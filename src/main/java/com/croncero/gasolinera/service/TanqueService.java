package com.croncero.gasolinera.service;

import com.croncero.gasolinera.model.Tanque;
import com.croncero.gasolinera.repository.TanqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TanqueService {

    @Autowired
    private TanqueRepository tanqueRepository;

    public List<Tanque> getAll() {
        return tanqueRepository.findAll();
    }

    public Tanque getById(Long id) {
        return tanqueRepository.findById(id).orElseThrow();
    }

    public Tanque create(Tanque tanque) {
        return tanqueRepository.save(tanque);
    }

    public Tanque update(Tanque tanqueActualizado) {
        // Comprobamos que el tanque existe
        Tanque tanque = tanqueRepository.findById(tanqueActualizado.getId()).orElseThrow();

        // Actualizamos sus campos
        tanque.setCapacidad(tanqueActualizado.getCapacidad());
        tanque.setNivelActual(tanqueActualizado.getNivelActual());

        return tanqueRepository.save(tanque);
    }

    public void delete(Long id) {
        tanqueRepository.deleteById(id);
    }
}
