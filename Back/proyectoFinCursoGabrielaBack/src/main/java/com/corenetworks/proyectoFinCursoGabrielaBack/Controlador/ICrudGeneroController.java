package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;

import java.util.List;

public interface ICrudGeneroController {
    public Genero alta(Genero genero);
    public Genero baja(Genero genero);
    public Genero consulta(long idGenero);
    public List<Genero> listado();
    public Genero modificar(Genero Genero);
}
