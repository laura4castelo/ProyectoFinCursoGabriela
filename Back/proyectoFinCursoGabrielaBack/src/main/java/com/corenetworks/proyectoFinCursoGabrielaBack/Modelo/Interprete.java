package com.corenetworks.proyectoFinCursoGabrielaBack.Modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Interprete {
    private int id;
    private String nombre;
    private Date añoNacimiento;
    private String paisOrigen;
}
