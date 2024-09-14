package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.ICrudCancionRepositorio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CrudCancionServicio implements ICrudCancionService{
    private ICrudCancionRepositorio iCrudCancionRepositorio;

    @Override
    public Cancion alta(Cancion cancion) {
        return null;
    }

    @Override
    public Cancion baja(Cancion cancion) {
        return null;
    }

    @Override
    public Cancion consulta(long idCancion) {
        return null;
    }

    @Override
    public List<Cancion> listado() {
        return List.of();
    }

    @Override
    public Cancion modificar(Cancion cancion) {
        return null;
    }
}
