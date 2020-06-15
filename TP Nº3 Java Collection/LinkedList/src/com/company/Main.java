package com.company;
import Clases.Cliente;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Linkedlist
        // Algunas caracteristicas son: Linkedlist mantiene el orden de insercion, puede tener objetos duplicados
        // y objetos nulos. La clase linkedlist implementa interfaces de colas pero puede usarse tanto como pila
        // o cola. linkedlist y arraylist son muy parecidos pero son diferentes en como almacenan y enlazan los
        // elementos de la lista. un arraylist almacena secuencialmente sus elementos en cambio la linkedlist
        //usa una lista doblemente enlazada para almacenarlos. una lista doblemente enlazada consiste en
        // en una coleccion de nodos donde cada nodo contiene 3 campos: la informacion del nodo, un apuntador
        // al proximo nodo de la lista, y un apuntador al nodo previo de la lista. Cabe destacar que la linkedlist
        // ocupada mas espacio de memoria que una arraylist. es mas rapido agregar y eliminar elementos de una
        //linkedlist .

        //creando los objetos para la linkedlist

        Cliente cliente1=new Cliente("Arguello Leonel Alejandro","Nueva Esperanza",775202);
        Cliente cliente2= new Cliente("Orona Marcos Rodrigo","BArgentino",989898);
        Cliente cliente3= new Cliente ("Galimberti Agustin Alejandro","Zsur",45978);
        Cliente cliente4= new Cliente ("Vega Yair Herman","DangerZone",7597425);
        Cliente cliente5= new Cliente ("Ortiz Dario","Lejos",485692);

// se va a crear una lista para objetos de tipo "Cliente"
        //se agrega los clientes, se imprime y luego se agrega un cliente mas en la posicion 0 por lo que
        //se imprimiria primero
        LinkedList<Cliente> clientes = new LinkedList<>();
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        System.out.println("primera linkedlist: " + clientes);
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
//Como se puede ver las acciones con la linkedlist son muy similares a la arraylist! 
