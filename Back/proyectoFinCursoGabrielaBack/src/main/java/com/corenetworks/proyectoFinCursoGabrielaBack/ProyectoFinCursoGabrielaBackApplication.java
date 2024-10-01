package com.corenetworks.proyectoFinCursoGabrielaBack;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_Interprete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class ProyectoFinCursoGabrielaBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinCursoGabrielaBackApplication.class, args);
	}
	@Autowired
	private Servicio_Interprete servicioInterprete;
	@Autowired
	private Servicio_genero servicioGenero;
	@Autowired
	private Servicio_cancion servicioCancion;
	@Override
	public void run(String... args) throws Exception {
		altaCancion();

	}
	public void altaCancion()
	{
		Interprete interprete=new Interprete("Oasis",new Date(1970,5,25),"Inglaterra");

		List<Interprete> interpretes=new ArrayList<>();
		interpretes.add(interprete);

		Genero genero=new Genero("rock");

		Cancion cancion=new Cancion("Wonderfull"
				, new Date(1980,4,17)
				,LocalTime.of(0,3,56)
				,0,0,0,true
				,interpretes
				,genero);
		Cancion cancion2=new Cancion("Wonderfull2"
				, new Date(1985,7,25)
				,LocalTime.of(0,4,56)
				,0,0,0,true
				,interpretes
				,genero);

		List<Cancion>canciones=new ArrayList<>();
		canciones.add(cancion);
		canciones.add(cancion2);
		genero.setCanciones(canciones);
		interprete.setCanciones(canciones);

        try {
            servicioGenero.registrar(genero);
			servicioInterprete.registrar(interprete);
			servicioCancion.registrar(cancion);
			servicioCancion.registrar(cancion2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

	}
}
