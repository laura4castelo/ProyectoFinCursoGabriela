package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface ICrudCancionController {
    public Cancion alta(Cancion cancion);
    public Cancion baja(Cancion cancion);
    public Cancion consulta(long idCancion);
    public List<Cancion> listado();
    public Cancion modificar(Cancion cancion);

}
