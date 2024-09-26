package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface IRepository_Cancion extends IRepository<Cancion, Integer> {
    Cancion findByNombre (String nombre);
    List<Cancion> findAllByInterprete(Interprete interprete);


}
