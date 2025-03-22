package com.croncero.gasolinera.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croncero.gasolinera.model.Producto;
import com.croncero.gasolinera.repository.ProductoRepository;

@Service
public class ProductoService {

   @Autowired
   private ProductoRepository productoRepository;

   public List<Producto> getAll() {
      return productoRepository.findAll();
   }

   public Producto getById(Long id) {
      return productoRepository.findById(id).orElseThrow();
   }

   public Producto create(Producto producto) {
      return productoRepository.save(producto);
   }

   public Producto update(Producto productoActualizado) {
      // Comprobamos que el producto existe
      Producto producto = productoRepository.findById(productoActualizado.getId()).orElseThrow();

      // Actualizamos sus campos
      producto.setPrecio(productoActualizado.getPrecio());

      return productoRepository.save(producto);
   }

   public void delete(Long id) {
      productoRepository.deleteById(id);
   }

}
