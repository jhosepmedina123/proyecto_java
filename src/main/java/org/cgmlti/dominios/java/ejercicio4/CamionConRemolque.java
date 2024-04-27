package org.cgmlti.dominios.java.ejercicio4;

public class CamionConRemolque extends Vehiculo{

    String descripcion;
    Integer capacidadCargaExtra;

    //crear un metodo que permita
    //calcular el total de carga maxima
    //soportado en un camion con remolque
    //declaracion de metodo

    public Integer calcularTotalCarga (){

        Integer totalCarga = capacidadCarga + capacidadCargaExtra ;
        return totalCarga;
        
    }

}
