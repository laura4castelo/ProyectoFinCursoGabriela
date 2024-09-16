package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICrudCancionRepositorio extends JpaRepository<Cancion, Integer> {

}
