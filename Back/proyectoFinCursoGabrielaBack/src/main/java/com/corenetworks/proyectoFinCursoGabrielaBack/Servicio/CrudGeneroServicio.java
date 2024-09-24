package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.ICrudGeneroRepositorio;
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
public class CrudGeneroServicio implements ICrudGeneroServicio{

    @Autowired
    private ICrudGeneroRepositorio iCrudGeneroRepositorio;

    @Override
    public Genero alta(Genero genero) {
        return iCrudGeneroRepositorio.save(genero);
    }

    @Override
    public void baja(Genero genero) {
         iCrudGeneroRepositorio.delete(genero);
    }

    @Override
    public Genero consulta(int idGenero) {
        return iCrudGeneroRepositorio.findById(idGenero).orElse(new Genero());
    }

    @Override
    public List<Genero> listado() {
        return iCrudGeneroRepositorio.findAll();
    }

    @Override
    public Genero modificar(Genero genero) {
        return iCrudGeneroRepositorio.save(genero);
    }
}
