package com.croncero.gasolinera.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croncero.gasolinera.model.Tanque;
import com.croncero.gasolinera.service.TanqueService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/tanques")
public class TanqueController {

   @Autowired
   private TanqueService tanqueService;

   @GetMapping()
   public List<Tanque> getAll() {
      return tanqueService.getAll();
   }

   @GetMapping("/{id}")
   public Tanque getById(@PathVariable Long id) {
      return tanqueService.getById(id);
   }

   @PostMapping()
   public Tanque create(@RequestBody Tanque tanque) {
      return tanqueService.create(tanque);
   }

   @DeleteMapping("/{id}")
   public String delete(@PathVariable Long id) {
      tanqueService.delete(id);

      return "Tanque con id " + id + " elminado";
   }
}
