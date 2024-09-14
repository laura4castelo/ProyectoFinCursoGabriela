package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Cancion {
    private int id;
    private String nombre;
    private Interprete interprete;
    private Genero genero;
    private String año;
}
