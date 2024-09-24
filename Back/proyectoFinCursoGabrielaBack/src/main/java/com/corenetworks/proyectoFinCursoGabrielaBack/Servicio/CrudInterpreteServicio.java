package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.ICrudInterpreteRepositorio;
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
public class CrudInterpreteServicio implements ICrudInterpreteServicio {

    @Autowired
    private ICrudInterpreteRepositorio iCrudInterpreteRepositorio;


    @Override
    public Interprete alta(Interprete interprete) {
        return iCrudInterpreteRepositorio.save(interprete);
    }

    @Override
    public void baja(Interprete interprete) {
         iCrudInterpreteRepositorio.delete(interprete);
    }

    @Override
    public Interprete consulta(int idInterprete) {
        return iCrudInterpreteRepositorio.findById(idInterprete).orElse(new Interprete());
    }

    @Override
    public List<Interprete> listado() {
        return iCrudInterpreteRepositorio.findAll();
    }

    @Override
    public Interprete modificar(Interprete interprete) {
        return iCrudInterpreteRepositorio.save(interprete);
    }
}
