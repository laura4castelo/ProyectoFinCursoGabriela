package com.corenetworks.proyectoFinCursoGabrielaBack;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.CrudCancionServicio;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.CrudGeneroServicio;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.CrudInterpreteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;
import java.util.Date;

@SpringBootApplication
public class ProyectoFinCursoGabrielaBackApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinCursoGabrielaBackApplication.class, args);
	}
	@Autowired
	private CrudInterpreteServicio crudInterpreteServicio;
	@Autowired
	private CrudGeneroServicio crudGeneroServicio;
	@Autowired
	private CrudCancionServicio crudCancionServicio;
	@Override
	public void run(String... args) throws Exception {
		crudGeneroServicio.alta(new Genero(0,"rock"));
		crudGeneroServicio.alta(new Genero(0,"Pop"));
		crudGeneroServicio.alta(new Genero(0,"Reggeton"));
		crudInterpreteServicio.alta(new Interprete(0,"Javier",new Date(),"España"));
		crudInterpreteServicio.alta(new Interprete(0,"Fran",new Date(),"España"));
		crudInterpreteServicio.alta(new Interprete(0,"Fransell",new Date(),"Brasil"));
//		crudCancionServicio.alta(new Cancion(0,
//						"Fransell",
//						new Date(),
//						LocalTime.now(),
//						new Interprete(0,"Javier",new Date(),"España"),
//						new Genero(0,"Rock")));
		crudCancionServicio.listado().forEach(System.out::println);

	}
}
