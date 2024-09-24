package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ICrudInterpreteRepositorio extends JpaRepository<Interprete, Integer> {

}
