package com.company;
import Clases.Cliente;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	//Arraylist
        // Algunas caracteristicas son: es un array de tipo dinamico, este crece o achica a medida que le
        //agregamos alementos o si le quitamos los mismos. Un arraylist mantiene el orden segun la insercion
        //de elementos. no se puede crear arraylist de tipos de datos primitivos. Permite elementos duplicados
        // y elementos nulos.

        Cliente cliente1=new Cliente("Arguello Leonel Alejandro","Nueva Esperanza",775202);
        Cliente cliente2= new Cliente("Orona Marcos Rodrigo","BArgentino",989898);
        Cliente cliente3= new Cliente ("Galimberti Agustin Alejandro","Zsur",45978);
        Cliente cliente4= new Cliente ("Vega Yair Herman","DangerZone",7597425);
        Cliente cliente5= new Cliente ("Ortiz Dario","Lejos",485692);

// se va a crear una lista para objetos de tipo "Cliente"
        //se agrega los clientes, se imprime y luego se agrega un cliente mas en la posicion 0 por lo que
        //se imprimiria primero

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        System.out.println(clientes);
        clientes.add(0,cliente5);
        System.out.println(clientes);
        //se va a eliminar un elemento de la lista
        clientes.remove(cliente3);
        System.out.println(clientes);
       //recorriendo la lista
        for(int i=0; i<clientes.size();i++){
            System.out.println(clientes.get(i));

        }
        //ordenando objetos de la lista por nombre y apellido.
        Collections.sort(clientes,Comparator.comparing(Cliente::getNYA));
        System.out.println("Ordenados por NYA :"+ clientes);

    }
}
