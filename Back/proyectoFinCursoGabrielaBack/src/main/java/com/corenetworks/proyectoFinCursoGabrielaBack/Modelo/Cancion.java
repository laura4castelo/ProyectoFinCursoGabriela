package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;

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


    @ManyToMany
    @JoinTable(
            name = "cancion_interprete",
            joinColumns = @JoinColumn(name = "id_cancion",nullable = false,foreignKey = @ForeignKey(name = "FK_temporada")),
            inverseJoinColumns = @JoinColumn(name = "id_Interprete",nullable = false,foreignKey = @ForeignKey(name = "FK_piloto"))
    )
    private List<Interprete>interpretes;

    @ManyToOne
    @JoinColumn(name="id_genero", nullable = false,
            foreignKey = @ForeignKey(name = "FK_piloto"))
    private Genero genero;



}
