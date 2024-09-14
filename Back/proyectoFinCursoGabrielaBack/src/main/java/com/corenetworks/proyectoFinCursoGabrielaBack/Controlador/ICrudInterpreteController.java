package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface ICrudInterpreteController {
    public Interprete alta(Interprete interprete);
    public Interprete baja(Interprete interprete);
    public Interprete consulta(long idInterprete);
    public List<Interprete> listado();
    public Interprete modificar(Interprete interprete);

}
