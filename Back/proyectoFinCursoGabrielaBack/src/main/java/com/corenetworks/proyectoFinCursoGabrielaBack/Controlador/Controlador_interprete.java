package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.DTO.DTO_Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.DTO.DTO_cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Repositorio.IRepository_Interprete;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/interpretes")

public class Controlador_interprete {

    @Autowired
    private ModelMapper mapper;
    @Autowired
    private IRepository_Interprete iRepositoryInterprete;
    @Autowired
    private IRepository_Cancion iRepositoryCancion;

    @GetMapping("/{nombreInterprete}")
    public ResponseEntity<List<DTO_cancion>> consultaCanciones(@PathVariable("nombreInterprete")String nombreInterprete) throws Exception{

        Interprete interprete=iRepositoryInterprete.findByNombre(nombreInterprete); //Obtengo Interprete por nombre
        if (interprete==null){
            return new ResponseEntity<>(null);
        }
        else {
            //Obtengo todas las idCanciones por idinterprete de la tabla cancion_interprete
            List<Integer> idCanciones= iRepositoryInterprete.findByIdInterpreteNative(interprete.getIdInterprete());

            List<DTO_cancion>canciones=new ArrayList<>();

            for (int a=0;a<idCanciones.size();a++){
                //Busco la cancion por el id
                Cancion cancionBucle=iRepositoryCancion.findById(idCanciones.get(a)).orElse(null);
                //Agrego la cancion mapeada
                canciones.add(mapper.map(cancionBucle,DTO_cancion.class));
            }
            return new ResponseEntity<>(canciones, HttpStatus.OK);
        }

    }
    @PostMapping
    public ResponseEntity<DTO_Interprete> altaInterprete(@Validated @RequestBody DTO_Interprete dto_Interprete){
        Interprete interprete=mapper.map(dto_Interprete, Interprete.class);
        if (iRepositoryInterprete.findByNombre(interprete.getNombre())!=null){
            return new ResponseEntity<>(mapper.map(null, DTO_Interprete.class),HttpStatus.NO_CONTENT);
        }
        else {
            iRepositoryInterprete.save(interprete);
            return new ResponseEntity<>(mapper.map(interprete,DTO_Interprete.class),HttpStatus.OK);
        }
    }
    @PutMapping
    public ResponseEntity<DTO_Interprete> modificarInterprete(@Validated @RequestBody DTO_Interprete dto_interprete){
        Interprete interprete=mapper.map(dto_interprete, Interprete.class);
        if (iRepositoryInterprete.findByNombre(interprete.getNombre())!=null){
            return new ResponseEntity<>(mapper.map(null, DTO_Interprete.class),HttpStatus.NO_CONTENT);
        }
        else {
            iRepositoryInterprete.save(interprete);
            return new ResponseEntity<>(mapper.map(interprete,DTO_Interprete.class),HttpStatus.OK);
        }
    }
}
