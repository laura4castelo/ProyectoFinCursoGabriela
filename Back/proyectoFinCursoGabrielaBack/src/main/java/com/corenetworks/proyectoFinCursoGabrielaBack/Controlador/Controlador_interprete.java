package com.corenetworks.proyectoFinCursoGabrielaBack.Controlador;

import com.corenetworks.proyectoFinCursoGabrielaBack.DTO.Dto_Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.IServicio_interprete;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/interpretes")

public class Controlador_interprete {

    @Autowired
    private ModelMapper mapper;
    @Autowired
    private IServicio_interprete iServicioInterprete;

    @GetMapping("/{nie}")
    public ResponseEntity<Dto_Interprete> consultaUno(@PathVariable("nie")String nie) throws Exception{
        Empresa resultadoBBDD=iServicioEmpresas.listerPorID(nie);
        if(resultadoBBDD==null)
        {
            throw new ExceptionNoencontradaModelo("Nie no encontrado "+nie);
        }
        Empresas_DTO empresasDto=mapper.map(resultadoBBDD, Empresas_DTO.class);
        return new ResponseEntity<>(empresasDto, HttpStatus.OK);
    }
}
