package com.corenetworks.proyectoFinCursoGabrielaBack.Excepciones;

public class ExceptionNoEncontradoModelo extends RuntimeException {
    private static final long serialVersionID=1L;

    public ExceptionNoEncontradoModelo(String mensaje){
        super(mensaje);
    }
}
