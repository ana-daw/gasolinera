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

import com.croncero.gasolinera.model.Surtidor;
import com.croncero.gasolinera.service.SurtidorService;

@RestController
@RequestMapping("/api/surtidores")
public class SurtidorController {

   @Autowired
   private SurtidorService surtidorService;

   @GetMapping()
   public List<Surtidor> getAll() {
      return surtidorService.getAll();
   }

   @GetMapping("/{id}")
   public Surtidor getById(@PathVariable Long id) {
      return surtidorService.getById(id);
   }

   @PostMapping()
   public Surtidor create(@RequestBody Surtidor surtidor) {
      return surtidorService.create(surtidor);
   }

   @DeleteMapping("/{id}")
   public String delete(@PathVariable Long id) {
      surtidorService.delete(id);

      return "Surtidor con id " + id + " elminado";
   }
}
