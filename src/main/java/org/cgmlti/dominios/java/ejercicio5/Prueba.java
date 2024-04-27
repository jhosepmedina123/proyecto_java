package org.cgmlti.dominios.java.ejercicio5;

public class Prueba {

    public static void main(String[] args) {

    //pais
    Pais pais = new Pais();
    Pais pais1 = new Pais("Rusia");

    System.out.println("Pais: " + pais1.nombre);    
    //ciudad
    Ciudad city1 = new Ciudad("Moscu");
    Ciudad city2 = new Ciudad("Vladivostok");
    Ciudad city3 = new Ciudad("Sochi");
    
    //lista ciudades del pais
    pais.listaCiudad.add(city1);
    pais.listaCiudad.add(city2);
    pais.listaCiudad.add(city3);

    System.out.println(" Lista de ciudades del pais: " + pais1.nombre);
    for (Ciudad ciudadRecorrer : pais.listaCiudad) {
        System.out.println(" Ciudad: " + ciudadRecorrer.nombre);
    }

    //ruta
     Ruta ruta = new Ruta();

     ruta.listaCiudad.add(city1);
     ruta.listaCiudad.add(city2);
     ruta.listaCiudad.add(city3);

    Ruta ruta1 = new Ruta(001, ruta.listaCiudad);

    System.out.println("Numero de ruta:" + ruta1.numero);
    for (Ciudad rutCiudad : ruta.listaCiudad) {
        System.out.println("ciudad: " + rutCiudad.nombre);
    }

    
    }
}
