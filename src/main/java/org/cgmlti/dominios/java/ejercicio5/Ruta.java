package org.cgmlti.dominios.java.ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Ruta {

    Integer numero;

    //lista de ciudades

    List<Ciudad> listaCiudad = 
        new ArrayList<Ciudad>();

    public Ruta() {
        System.out.println("ingreso al constructor" + " por defecto");
    }

    public Ruta(Integer numero, List<Ciudad> listaCiudad) {
        this.numero = numero;
        this.listaCiudad = listaCiudad;
    }
    

}
