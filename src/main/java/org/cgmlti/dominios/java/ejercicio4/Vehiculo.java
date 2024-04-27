package org.cgmlti.dominios.java.ejercicio4;

public class Vehiculo {
    
    Long codigo;
    Boolean estaDisponible;
    Integer capacidadCarga;
    
    //contructor es aquel que por defecto no tiene parametros

    public Vehiculo() {
        System.out.println("ingreso al constructor" + " por defecto");
    }

    public Vehiculo(Long codigo, Boolean estaDisponible, Integer capacidadCarga) {
        this.codigo = codigo;
        this.estaDisponible = estaDisponible;
        this.capacidadCarga = capacidadCarga;
    }
    
}
