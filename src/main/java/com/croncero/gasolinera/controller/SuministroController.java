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

import com.croncero.gasolinera.model.Suministro;
import com.croncero.gasolinera.service.SuministroService;

@RestController
@RequestMapping("/api/suministros")
public class SuministroController {
   @Autowired
   private SuministroService suministroService;

   @GetMapping()
   public List<Suministro> getAll() {
      return suministroService.getAll();
   }

   @GetMapping("/{id}")
   public Suministro getById(@PathVariable Long id) {
      return suministroService.getById(id);
   }

   @PostMapping()
   public Suministro create(@RequestBody Suministro suministro) {
      return suministroService.create(suministro);
   }

   @DeleteMapping("/{id}")
   public String delete(@PathVariable Long id) {
      suministroService.delete(id);

      return "Suministro con id " + id + " elminado";
   }
}
