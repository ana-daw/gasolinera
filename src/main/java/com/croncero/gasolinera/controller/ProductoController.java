package com.croncero.gasolinera.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croncero.gasolinera.model.Producto;
import com.croncero.gasolinera.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

   @Autowired
   private ProductoService productoService;

   @GetMapping()
   public List<Producto> getAll() {
      return productoService.getAll();
   }

   @GetMapping("/{id}")
   public Producto getById(@PathVariable Long id) {
      return productoService.getById(id);
   }

   @PostMapping()
   public Producto create(@RequestBody Producto producto) {
      return productoService.create(producto);
   }

   @DeleteMapping("/{id}")
   public String delete(@PathVariable Long id) {
      productoService.delete(id);

      return "Producto con id " + id + " elminado";
   }
}
