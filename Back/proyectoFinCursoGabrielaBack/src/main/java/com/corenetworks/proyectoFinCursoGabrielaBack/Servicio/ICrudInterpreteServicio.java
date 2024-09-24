package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;

import java.util.List;

public interface ICrudInterpreteServicio {
    public Interprete alta(Interprete interprete);
    public void baja(Interprete interprete);
    public Interprete consulta(int idInterprete);
    public List<Interprete> listado();
    public Interprete modificar(Interprete interprete);
}
