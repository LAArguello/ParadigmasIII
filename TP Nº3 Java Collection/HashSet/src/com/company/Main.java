package com.company;
import Clases.Cliente;
import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Hashset es una de las colecciones de java, esta implementa la interfaz "set"  hashset es utilizada
        //para almacenar un conjunto de elementos unicos. alguna de sus caracteristicas son:
        // No puede contener elementos duplicados, admite elementos nulos, los hashset son colecciones desordenadas.
        //hashset internamente usa hashmap para almacenar sus elementos.

        //creando los objetos para el hashset

        Cliente cliente1 = new Cliente("Arguello Leonel Alejandro", "Nueva Esperanza", 775202);
        Cliente cliente2 = new Cliente("Orona Marcos Rodrigo", "BArgentino", 989898);
        Cliente cliente3 = new Cliente("Galimberti Agustin Alejandro", "Zsur", 45978);
        Cliente cliente4 = new Cliente("Vega Yair Herman", "DangerZone", 7597425);
        Cliente cliente5 = new Cliente("Ortiz Dario", "Lejos", 485692);

// se va a crear un hashset con la key y valores Cliente-Integer
        Set<Cliente> clientes = new HashSet<>();

        //se añaden los elementos al hashset que en este caso serian clientes del banco.
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        System.out.println("primer hashset: " + clientes);
        clientes.add(cliente5);
        System.out.println("clientes + cliente 5: " + clientes);
        //se va a eliminar uno los elementos.
        clientes.remove(cliente3);
        System.out.println("la nueva hashset es : " + clientes);
        System.out.println("el cliente eliminado fue: " + cliente3);

        //recorriendo el hashset con un foreach!! :o
        clientes.forEach((cliente) -> {
            System.out.println(cliente);
        });

        //no se puede ordenar un hashset por su naturaleza. la unica forma es convertir el hashset en una lista
        //para poder ordenarla. Lo mismo sucede con el hashmap! 
    }
}





