package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="interpretes")

public class Interprete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idInterprete;

    @Column(length = 120)
    private String nombre;
    @Column(nullable = false)
    private Date fechaCreacion;
    @Column(length = 60, nullable = false)
    private String paisOrigen;


    @ManyToMany(mappedBy = "interpretes",
            cascade = {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.REMOVE})
    List<Cancion> canciones=new ArrayList<>();

    public Interprete(int idInterprete,String nombre, Date fechaCreacion, String paisOrigen) {
        this.idInterprete=idInterprete;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.paisOrigen = paisOrigen;
    }
}
