package com.company;
import Clases.Cliente;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //HashMap es una implementación de la interfaz mapa de java basada en  tabla de hash .
        //un mapa es una coleccion de pares que esta compuesta por keys y sus valores. Algunas caracteristicas son:
        //un hashmap no puede contener keys duplicadas. pero si permite valores y keys nulas.
        //un hashmap es una coleccion que no se encuentra ordenada.

        //creando los objetos para el hashlist

        Cliente cliente1=new Cliente("Arguello Leonel Alejandro","Nueva Esperanza",775202);
        Cliente cliente2= new Cliente("Orona Marcos Rodrigo","BArgentino",989898);
        Cliente cliente3= new Cliente ("Galimberti Agustin Alejandro","Zsur",45978);
        Cliente cliente4= new Cliente ("Vega Yair Herman","DangerZone",7597425);
        Cliente cliente5= new Cliente ("Ortiz Dario","Lejos",485692);

// se va a crear un hashmap con la key y valores Cliente-Integer
        Map <String, Integer> clientes = new HashMap<>();
        //se añaden los keys y sus respectivos valores, en este caso clientes y sus numeros
        clientes.put(cliente1.getNYA(),cliente1.getNumcuenta());
        clientes.put(cliente2.getNYA(),cliente2.getNumcuenta());
        clientes.put(cliente3.getNYA(),cliente3.getNumcuenta());
        clientes.put(cliente4.getNYA(),cliente4.getNumcuenta());
        System.out.println("primer hashmap: " + clientes);
        clientes.put(cliente5.getNYA(),cliente5.getNumcuenta());
        System.out.println("clientes + cliente 5: " + clientes);
        //se va a eliminar uno de las keys, en este caso se elimina el cliente 3 : galimberti agustin
        clientes.remove(cliente3);
        System.out.println("la nueva hashlist es : " + clientes);
        System.out.println("el cliente eliminado fue: " + cliente3);



        //recorriendo el hashlist con un foreach!! :o
        clientes.forEach((NYA, NumCuenta) -> {
            System.out.println(NYA + " => " + NumCuenta);
        });
        //ordenando objetos del hashlist por nombre y apellido, en este caso el nombre es el "Key".
        //cabe aclarar que el hashlist no puede ordenarse por su naturaleza, pero si puede transformarse
        //en una lista para mostrar de manera ordenada una parte de sus elementos ya sea su key o su valor.

        List<String> clientesordenados = new ArrayList<>(clientes.keySet());
        Collections.sort(clientesordenados);
        System.out.println("Ordenados por NYA :"+ clientesordenados);
        //al mostrarlo de esta forma ya pierde la forma de mapa!
    }
}

