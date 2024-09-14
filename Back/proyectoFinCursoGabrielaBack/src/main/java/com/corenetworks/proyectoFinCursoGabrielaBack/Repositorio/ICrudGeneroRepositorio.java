package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface ICrudGeneroRepositorio {
    public Genero alta(Genero genero);
    public Genero baja(Genero genero);
    public Genero consulta(long idGenero);
    public List<Genero> listado();
    public Genero modificar(Genero Genero);

}
