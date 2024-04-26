package org.cgmlti.dominios.java.ejercicio4;

import java.time.LocalDateTime;

public class Prueba {

    public static void main(String[] args) {

        //instanciar un ejemplar de cada tipo de vehiculo

        //crear un objeto viaje
        Viaje v = new Viaje();
        v.fechaInicio= LocalDateTime.of(2024, 4, 25, 5, 30, 00);
        v.fechaFin= LocalDateTime.of(2024, 4, 28, 6, 30, 00);


        //establece el viaje
        //del camion:
        
        Camion Camion1 = new Camion();
        Camion1.estaDisponible = true;

        CamionConRemolque Remolque1 = new CamionConRemolque();
        Remolque1.capacidadCargaExtra = 9;

        Camion1.elTalViajeQueHizoElCamion = v;

        System.out.println("El viaje del camion" + "tiene fecha de inicio" + Camion1.elTalViajeQueHizoElCamion.fechaInicio);
        System.out.println("El viaje del camion" + "tiene fecha de fin" + Camion1.elTalViajeQueHizoElCamion.fechaFin);





    }
}
