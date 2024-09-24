package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.ICrudCancionRepositorio;
import jakarta.persistence.Entity;
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
public class CrudCancionServicio implements ICrudCancionService{

    @Autowired
    private ICrudCancionRepositorio iCrudCancionRepositorio;

    @Override
    public Cancion alta(Cancion cancion) {
        return iCrudCancionRepositorio.save(cancion);
    }

    @Override
    public void baja(Cancion cancion) {iCrudCancionRepositorio.deleteById(cancion.getIdCancion());
    }

    @Override
    public Cancion consulta(int idCancion) {

       return iCrudCancionRepositorio.findById(idCancion).orElse(new Cancion());
    }

    @Override
    public List<Cancion> listado() {
        return iCrudCancionRepositorio.findAll();
    }

    @Override
    public Cancion modificar(Cancion cancion) {
        return iCrudCancionRepositorio.save(cancion);
    }
}
