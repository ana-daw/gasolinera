package com.croncero.gasolinera.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tanques")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tanque {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, unique = true)
    private String codigo;

    @Column(nullable = false)
    private Integer capacidad;

    @Column(name = "nivel_actual", nullable = false)
    private Integer nivelActual;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;
}
