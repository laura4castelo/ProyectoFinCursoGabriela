package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICrudGeneroRepositorio extends JpaRepository<Genero, Integer> {

}
