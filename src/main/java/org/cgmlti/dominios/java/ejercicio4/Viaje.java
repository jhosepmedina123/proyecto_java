package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;

public class Viaje {

    LocalDate fechaInicio;
    LocalDate fechaFin;

    //crear un metodo que imprima la duracion del viaje dada la fecha de inicio ingresadas como imputs
    
    public void calcularDuracionViaje(
        LocalDate fechaInicio , LocalDate fechaFin
    )
    {
        //asignar las fechas de parametro a los atributos del viaje//

        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        
        Period diferencia = Period.between(fechaInicio, fechaFin) ;
        
        System.out.println("Duracion del viaje: " + diferencia.getDays() + " dias");
    }

    //crear sobre carga del metodo calcularDuracion

    int calcularDuracionViaje(){

        Period diferencia = Period.between(fechaInicio, fechaFin) ;

        return diferencia.getDays();
    }
}
