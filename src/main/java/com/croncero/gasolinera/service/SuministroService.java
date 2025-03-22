package com.croncero.gasolinera.service;

import com.croncero.gasolinera.model.Producto;
import com.croncero.gasolinera.model.Suministro;
import com.croncero.gasolinera.repository.ProductoRepository;
import com.croncero.gasolinera.repository.SuministroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SuministroService {

    @Autowired
    private SuministroRepository suministroRepository;

    @Autowired
    private ProductoRepository productoRepository;

    public List<Suministro> getAll() {
        return suministroRepository.findAll();
    }

    public Suministro getById(Long id) {
        return suministroRepository.findById(id).orElseThrow();
    }

    public Suministro create(Suministro suministro) {
        // Calculamos el importe del suministro a partir del volumen suminsitrado
        Producto producto = productoRepository.findById(suministro.getProducto().getId()).orElseThrow();
        Double importe = producto.getPrecio() * suministro.getVolumen();
        suministro.setImporte(importe);
        
        return suministroRepository.save(suministro);
    }

    public Suministro update(Suministro suministroActualizado) {
        // Comprobamos que el suministro existe
        Suministro suministro = suministroRepository.findById(suministroActualizado.getId()).orElseThrow();

        // Actualizamos sus campos
        suministro.setFecha(suministroActualizado.getFecha());
        suministro.setVolumen(suministroActualizado.getVolumen());
        suministro.setImporte(suministroActualizado.getImporte());

        return suministroRepository.save(suministro);
    }

    public void delete(Long id) {
        suministroRepository.deleteById(id);
    }

}
