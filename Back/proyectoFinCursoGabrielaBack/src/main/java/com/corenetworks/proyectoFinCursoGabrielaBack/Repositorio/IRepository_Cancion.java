package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepository_Cancion extends IRepository<Cancion, Integer> {
    Cancion findByNombre (String nombre);






}
