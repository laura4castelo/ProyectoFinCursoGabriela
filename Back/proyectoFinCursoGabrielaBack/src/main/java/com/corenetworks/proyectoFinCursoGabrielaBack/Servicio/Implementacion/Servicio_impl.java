package com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public abstract class Servicio_impl<T,ID> implements IServicio<T,ID> {


    protected abstract IRepository<T, ID> getRepo();
    @Autowired
    private EntityManager entityManager;

    @Autowired
    private IRepository_Interprete iRepositoryInterprete;

    public T registrar(T t) throws Exception{
        // TODO Auto-generated method stub
        return getRepo().save(t);
    }

    public T modificar(T t) throws Exception{
        // TODO Auto-generated method stub
        return getRepo().save(t);
    }

    public List<T> listar() throws Exception{
        // TODO Auto-generated method stub
        return getRepo().findAll();
    }

    public T listarPorId(ID id) throws Exception {
        // TODO Auto-generated method stub
        Optional<T> t1 = getRepo().findById(id);
        return t1.isPresent() ? t1.get() : null;
    }

    public void eliminar(ID id) throws Exception{
        // TODO Auto-generated method stub
        getRepo().deleteById(id);

    }
    public List<Cancion> porInterprete(String nombre) {

       Interprete interprete=iRepositoryInterprete.findByNombre(nombre);
       String sql="Select * from cancion_interpete where id_interprete ="+interprete.getIdInterprete();
       Query query = entityManager.createNativeQuery(sql);
       List<Cancion> canciones=query.getResultList();
       return canciones;
    }
}
