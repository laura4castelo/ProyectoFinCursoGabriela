package com.corenetworks.proyectoFinCursoGabrielaBack.DTO;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Dto_cancion {

    @NotNull
    @Min(0)
    @Max(120)
    private String nombreCancion;
    @NotNull
    private float duracion;
}
