package com.corenetworks.proyectoFinCursoGabrielaBack;

import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Modelo.Interprete;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_cancion;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_genero;
import com.corenetworks.proyectoFinCursoGabrielaBack.Servicio.Implementacion.Servicio_Interprete;
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
	private Servicio_Interprete crudInterpreteServicio;
	@Autowired
	private Servicio_genero crudGeneroServicio;
	@Autowired
	private Servicio_cancion crudCancionServicio;
	@Override
	public void run(String... args) throws Exception {
		crudGeneroServicio.registrar(new Genero(0,"rock"));
		crudGeneroServicio.registrar(new Genero(0,"Pop"));
		crudGeneroServicio.registrar(new Genero(0,"Reggeton"));
		crudInterpreteServicio.registrar(new Interprete(0,"Javier",new Date(),"España"));
		crudInterpreteServicio.registrar(new Interprete(0,"Fran",new Date(),"España"));
		crudInterpreteServicio.registrar(new Interprete(0,"Fransell",new Date(),"Brasil"));
//		crudCancionServicio.alta(new Cancion(0,
//						"Fransell",
//						new Date(),
//						LocalTime.now(),
//						new Interprete(0,"Javier",new Date(),"España"),
//						new Genero(0,"Rock")));
		crudCancionServicio.listar().forEach(System.out::println);


	}
}
