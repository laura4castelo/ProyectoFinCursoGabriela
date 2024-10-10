package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Column
    private Date fechaCreacion;
    @Column(nullable = false)
    private float duracion;
    @Column
    private long descargas=0;
    @Column
    private long busquedas=0;


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

    public Cancion(String nombre, Date fechaCreacion, float duracion, int ventas, int busquedas, List<Interprete> interpretes, Genero genero) {
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.duracion = duracion;
        this.descargas = ventas;
        this.busquedas = busquedas;
        this.interpretes = interpretes;
        this.genero = genero;
    }
    public Cancion(String nombre,float duracion){
        this.nombre=nombre;
        this.duracion=duracion;
    }

}
