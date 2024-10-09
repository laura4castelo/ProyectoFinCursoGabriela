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
    private float duracion;
    @Column(nullable = false)
    private int ventas;
    @Column(nullable = false)
    private int busquedas;
    @Column(name = "novedades",nullable = false)
    private boolean nueva =true;

    @ManyToMany
    @JoinTable(
            name = "cancion_interprete",
            joinColumns = @JoinColumn(name = "id_cancion",nullable = false),
            inverseJoinColumns = @JoinColumn(name = "id_Interprete")
    )
    private List<Interprete>interpretes;

    @ManyToOne
    @JoinColumn(name="id_genero")
    private Genero genero;

    public Cancion(String nombre, Date fechaCreacion, float duracion, int ventas, int busquedas, boolean nueva, List<Interprete> interpretes, Genero genero) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.duracion = duracion;
        this.ventas = ventas;
        this.busquedas = busquedas;
        this.nueva = nueva;
        this.interpretes = interpretes;
        this.genero = genero;
    }
    public Cancion(String nombre,float duracion){
        this.nombre=nombre;
        this.duracion=duracion;
    }

}
