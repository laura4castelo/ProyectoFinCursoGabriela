package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;


public interface IRepository_Interprete extends IRepository<Interprete, Integer> {
    public List<Cancion> findAllByNombre(String nombre);

}
