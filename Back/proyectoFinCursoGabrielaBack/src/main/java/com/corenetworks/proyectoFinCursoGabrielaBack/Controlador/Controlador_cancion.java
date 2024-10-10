package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.DTO.DTO_cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Genero;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/canciones")

public class Controlador_cancion {

    @Autowired
    private IRepository_Cancion iRepositoryCancion;
    @Autowired
    private IRepository_Genero iRepositoryGenero;

    @Autowired
    private ModelMapper mapper;


    @GetMapping
    public ResponseEntity<List<DTO_cancion>> consultarTodasLasCanciones()throws Exception{
        List<DTO_cancion> resultado=iRepositoryCancion.findAll()
                .stream().map(x-> mapper.map(x, DTO_cancion.class))
                .collect(Collectors.toList());
        return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

    @GetMapping("{nombreCancion}")
    public ResponseEntity<DTO_cancion> consultarUnaCancion(@PathVariable("nombreCancion") String nombreCancion) throws Exception{
        Cancion cancion=iRepositoryCancion.findByNombre(nombreCancion);
        if (cancion==null){
            //throw new ExceptionNoEncontradoModelo(nombreCancion+ "El id: " + nombreCancion +" no ha sido encontrado");
            return new ResponseEntity<>(mapper.map(null,DTO_cancion.class),HttpStatus.NO_CONTENT);
        }
        else {return new ResponseEntity<>(mapper.map(cancion,DTO_cancion.class),HttpStatus.OK);
            //return new ResponseEntity<>(mapper.map(iRepositoryCancion.findById(nombreCancion), DTO_cancion.class),HttpStatus.OK);"
        }
    }

    @GetMapping("idGenero")
    public ResponseEntity<List<DTO_cancion>> consyltaCancionesPorGenero(@PathVariable("idGenero")String tipoGenero){
       //Obtengo genero por nombre y compruebo que exista
        Genero genero=iRepositoryGenero.findByTipoGenero(tipoGenero);
        if (genero==null){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
        //Genero existe
        else {
            //Obtengo la lista de cancion por id genero
            List<DTO_cancion> canciones=iRepositoryCancion.findByIdGeneroNative(genero.getIdGenero())
                    .stream().map(x->mapper.map(x, DTO_cancion.class))
                    .collect(Collectors.toList());
            return new ResponseEntity<>(canciones,HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<DTO_cancion> insertar(@Validated @RequestBody DTO_cancion dtoCancion) throws Exception{
        //Mapeo la cancion nueva
        Cancion cancion = mapper.map(dtoCancion,Cancion.class);

        //Busco la cancion nueva en base de datos:
        if (iRepositoryCancion.findByNombre(cancion.getNombre())!=null){
            return new ResponseEntity<>(null,HttpStatus.NO_CONTENT);
        }
        else {
            DTO_cancion dtoCancion1=mapper.map(iRepositoryCancion.save(cancion), DTO_cancion.class);
            return new ResponseEntity<>(dtoCancion1,HttpStatus.CREATED);
        }
    }
    @PutMapping
    public ResponseEntity<DTO_cancion> modificar(@Validated @RequestBody DTO_cancion dtoCancion) throws Exception{

        Cancion cancion=mapper.map(dtoCancion,Cancion.class);
        Cancion cancion1=iRepositoryCancion.findById(cancion.getIdCancion()).orElse(null);
        if (cancion1==null){
           // throw new ExceptionNoEncontradoModelo("El id: " + dtoCancion.getNombreCancion() +" no ha sido encontrado");
            return new ResponseEntity<>(mapper.map(null, DTO_cancion.class),HttpStatus.NO_CONTENT);
        }
        else {
            return new ResponseEntity<>(mapper.map(iRepositoryCancion.save(cancion1), DTO_cancion.class),HttpStatus.OK);
            //return new ResponseEntity<>(dt,DTO_cancion.class),HttpStatus.OK);
        }

    }

    @DeleteMapping("{nombre}")
    public ResponseEntity<DTO_cancion> eliminar(@PathVariable("nombre") String nombreCancion) throws Exception{
        Cancion cancion=iRepositoryCancion.findByNombre(nombreCancion);
        if (cancion==null){
            //throw new ExceptionNoEncontradoModelo(nombreCancion+ "El id: " + nombreCancion +" no ha sido encontrado");
            return new ResponseEntity<>(mapper.map(null,DTO_cancion.class),HttpStatus.NO_CONTENT);
        }
        else {
            iRepositoryCancion.borrarCancionDeTablaOriginada(cancion.getIdCancion());
            iRepositoryCancion.deleteById(cancion.getIdCancion());
            return new ResponseEntity<>(mapper.map(cancion,DTO_cancion.class),HttpStatus.OK);
        }
    }

}
