package com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRepository_Interprete extends IRepository<Interprete, Integer> {

    Interprete findByNombre(String nombre);

//    @Query(value = "SELECT id_cancion from cancion_inteprete where id_interprete = :idinterprete",nativeQuery = true)
//    List<Cancion> findAllBy
    @Query(value = "SELECT idCancion " +
                   "FROM cancion_interprete " +
                   "WHERE idInterprete= :name",nativeQuery = true)
    List<Integer> findByIdInterpreteNative(@Param("name")int idInterprete);



}
