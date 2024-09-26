package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicio_genero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Service
public class Servicio_genero extends Servicio_impl<Genero,Integer> implements IServicio_genero {

    @Autowired
    private IRepository_Genero iCrudGeneroRepositorio;


    @Override
    protected IRepository getRepo() {
        return null;
    }
}
