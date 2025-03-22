package com.croncero.gasolinera.repository;

import com.croncero.gasolinera.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

   List<Producto> findByTipo(String tipo);
}
