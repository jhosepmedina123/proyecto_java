package org.cgmlti.dominios.java.ejercicio5;

import java.util.ArrayList;
import java.util.List;


public class Pais {

    String nombre;

    //lista de ciudades

    List<Ciudad> listaCiudad = 
        new ArrayList<Ciudad>();

    //contructor es aquel que por defecto no tiene parametros

    public Pais() {
        System.out.println("ingreso al constructor" + " por defecto");
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    


}
