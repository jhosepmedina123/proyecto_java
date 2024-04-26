package org.cgmlti.dominios.java.ejercicio2;

public class PruebaEjercicio2 {

    public static void main(String[] args) {

        //crear 2 instancias de cada entidad
        //instancear 2 veces cada entidad
        //crear 2 objetos de cada entidad
        //1. nombre de la clase a instanciar
        //2. nombre del objeto (indentificador)
        //3. operador de asignacion
        //4. palabra (referencia) new
        //5. otra vez, el nomnbre de la clase 
        //6. parentesis (contructor)
   
        //acceder a los atributos del objeto hospital:
        // operador . 
        //1. identificador del objeto
        //2. el punto
        //3. el atributo a trabajar
        //4. el operador de asignacion
        //5. el valor a asignar

        Hospital Hospital1 = new Hospital();
        Hospital1.direccion = "Caracas con 52";
        Hospital1.nombre = "San Jose"; 
        Hospital1.telefono = 3112434602L;

        Hospital Hospital2 = new Hospital();
        Hospital2.direccion = "Caracas con 15"; 
        Hospital2.nombre = "San Rafael";   
        Hospital2.telefono = 3122434612L; 

//acceder a los atributos del objeto medicos

        Medico Medico1 = new Medico();
        Medico1.nombre = "Alejandro";
        Medico1.Cedula = 1293732L;
        Medico1.especialidad = "Nutricionista";

        Medico Medico2 = new Medico();
        Medico2.nombre = "Samuel";
        Medico2.Cedula = 293763L;
        Medico2.especialidad = "Dentista";

        Medico Medico3 = new Medico();
        Medico3.nombre = "Sofia";
        Medico3.Cedula = 1276532L;
        Medico3.especialidad = "Pediatra";

        //añadir medico 

        Hospital1.listaMedicos.add(Medico1);
        Hospital1.listaMedicos.add(Medico2);
        Hospital1.listaMedicos.add(Medico3);

        //acceder a los atributos del objeto salas

        SalaHospital Sala1 = new SalaHospital();
        SalaHospital Sala2 = new SalaHospital();
        SalaHospital Sala3 = new SalaHospital();

        Hospital1.listaSalas.add(Sala1);
        Hospital1.listaSalas.add(Sala2);
        Hospital1.listaSalas.add(Sala3);

        Sala1.numero = 155;
        Sala1.cantidadCamas = 13;

        Sala2.numero = 154;
        Sala2.cantidadCamas = 12;

        Sala3.numero = 153;
        Sala3.cantidadCamas = 11;

        //recorrer la lista de medicos
        //del hospital 1

        for( Medico medicoRecorrer : Hospital1.listaMedicos ){

            System.out.println("Medico:" + 
                              medicoRecorrer.Cedula);

        }
        
    }
}


