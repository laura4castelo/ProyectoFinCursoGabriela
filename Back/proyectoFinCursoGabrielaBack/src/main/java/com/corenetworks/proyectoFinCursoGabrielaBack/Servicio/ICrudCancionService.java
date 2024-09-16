package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;

import java.util.List;

public interface ICrudCancionService {
    public Cancion alta(Cancion cancion);
    public void baja(Cancion cancion);
    public Cancion consulta(int idCancion);
    public List<Cancion> listado();
    public Cancion modificar(Cancion cancion);
}
