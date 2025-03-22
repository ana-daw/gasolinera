package com.croncero.gasolinera.repository;

import com.croncero.gasolinera.model.Tanque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TanqueRepository extends JpaRepository<Tanque, Long> {
    
}

