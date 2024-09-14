package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.ICrudInterpreteRepositorio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CrudInterpreteServicio implements ICrudInterpreteServicio {

    private ICrudInterpreteRepositorio iCrudInterpreteRepositorio;


    @Override
    public Interprete alta(Interprete interprete) {
        return null;
    }

    @Override
    public Interprete baja(Interprete interprete) {
        return null;
    }

    @Override
    public Interprete consulta(long idInterprete) {
        return null;
    }

    @Override
    public List<Interprete> listado() {
        return List.of();
    }

    @Override
    public Interprete modificar(Interprete interprete) {
        return null;
    }
}
