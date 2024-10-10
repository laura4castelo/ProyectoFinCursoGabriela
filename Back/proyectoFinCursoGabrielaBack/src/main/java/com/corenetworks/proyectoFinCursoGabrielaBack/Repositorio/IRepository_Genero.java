package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import jdk.jfr.Registered;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository_Genero extends IRepository<Genero, Integer> {
 Genero findByTipoGenero(String tipoDeGenero);
}
