package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicio_interprete;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Service
public class Servicio_Interprete extends Servicio_impl<Interprete,Integer> implements IServicio_interprete {

    @Autowired
    private IRepository_Interprete iRepositoryInterprete;


    @Override
    protected IRepository<Interprete, Integer> getRepo() {
        return iRepositoryInterprete;
    }
}
