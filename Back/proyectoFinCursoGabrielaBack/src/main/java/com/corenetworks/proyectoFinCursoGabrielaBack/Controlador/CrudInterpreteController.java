package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.ICrudInterpreteServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CrudInterpreteController implements ICrudInterpreteController{

    private ICrudInterpreteServicio iCrudInterpreteServicio;

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
