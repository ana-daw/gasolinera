package com.croncero.gasolinera.repository;

import com.croncero.gasolinera.model.Suministro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SuministroRepository extends JpaRepository<Suministro, Long> {

}
