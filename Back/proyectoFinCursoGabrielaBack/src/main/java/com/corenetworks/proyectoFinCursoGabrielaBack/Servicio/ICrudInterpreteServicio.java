package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface ICrudInterpreteServicio {
    public Interprete alta(Interprete interprete);
    public Interprete baja(Interprete interprete);
    public Interprete consulta(long idInterprete);
    public List<Interprete> listado();
    public Interprete modificar(Interprete interprete);
}
