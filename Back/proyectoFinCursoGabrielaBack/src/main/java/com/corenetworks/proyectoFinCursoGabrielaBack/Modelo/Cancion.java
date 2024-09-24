package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Entity
@Table(name="canciones")

public class Cancion  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCancion;

    @Column(length = 120, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Date fechaCreacion;
    @Column(nullable = false)
    private LocalTime duracion;

    @ManyToOne
    @JoinColumn(name="id_interprete", nullable = false,
            foreignKey = @ForeignKey(name = "FK_cancion_interprete"))
    private Interprete interprete;

    @ManyToOne
    @JoinColumn(name="id_genero", nullable = false,
            foreignKey = @ForeignKey(name = "FK_cancion_genero"))
    private Genero genero;



}
