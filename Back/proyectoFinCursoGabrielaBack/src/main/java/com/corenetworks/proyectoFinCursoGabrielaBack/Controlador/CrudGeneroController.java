package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.ICrudGeneroServicio;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class CrudGeneroController implements ICrudGeneroController{

    private ICrudGeneroServicio iCrudGeneroServicio;

    @Override
    public Genero alta(Genero genero) {
        return null;
    }

    @Override
    public Genero baja(Genero genero) {
        return null;
    }

    @Override
    public Genero consulta(long idGenero) {
        return null;
    }

    @Override
    public List<Genero> listado() {
        return List.of();
    }

    @Override
    public Genero modificar(Genero Genero) {
        return null;
    }
}
