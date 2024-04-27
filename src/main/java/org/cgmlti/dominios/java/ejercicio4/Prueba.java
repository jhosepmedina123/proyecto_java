package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDate;

public class Prueba {

    public static void main(String[] args) {

        //crear una instancia de vehiculo
        Vehiculo vehiculo1 = new Vehiculo(5151L, true, 45);


        //crear un objeto viaje
        Viaje v = new Viaje();

        //invocacion llamado, ejecucion, utilizacion
        v.calcularDuracionViaje(LocalDate.of(2024, 4, 25) , LocalDate.of(2024, 4, 28));

        //invocacion de la sobrecarga

        System.out.println( "Duracion en dias del viaje: " + v.calcularDuracionViaje() + " dias");
        
        //establece el viaje
        //del camion:
        
        Camion Camion1 = new Camion();
        Camion1.estaDisponible = true;

        CamionConRemolque Remolque1 = new CamionConRemolque();
        Remolque1.capacidadCargaExtra = 90;
        Remolque1.capacidadCarga = 10;
        
        Camion1.elTalViajeQueHizoElCamion = v;

        //invocar el metodo creado

        Integer totalCarga = Remolque1.calcularTotalCarga();

            System.out.println("total carga: " + Remolque1.calcularTotalCarga());





        System.out.println("El viaje del camion" + " tiene fecha de inicio: " + Camion1.elTalViajeQueHizoElCamion.fechaInicio);
        System.out.println("El viaje del camion" + " tiene fecha de fin: " + Camion1.elTalViajeQueHizoElCamion.fechaFin);





    }
}
