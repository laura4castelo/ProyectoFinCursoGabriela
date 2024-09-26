package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicio_cancion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@NoArgsConstructor
@AllArgsConstructor
@Data

@Service
public class Servicio_cancion extends Servicio_impl<Cancion,Integer> implements IServicio_cancion {

    @Autowired
    private IRepository_Cancion iCrudCancionRepositorio;


    @Override
    protected IRepository getRepo() {
        return iCrudCancionRepositorio;
    }
}
