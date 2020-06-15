package com.company;
import Clases.Cliente;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        //Queue o colas es una estructura de datos del tipo FIFO, java provee una interfaz de colas en su coleccion
        //En java una cola es solo una interfaz, se necesita una implementacion concreta de la misma para poder
        //usarlas en nuestros programas, por ejemplo una linkedlist puede implementarse como una cola.


        //Creando los elementos para la cola

        Cliente cliente1 = new Cliente("Arguello Leonel Alejandro", "Nueva Esperanza", 775202);
        Cliente cliente2 = new Cliente("Orona Marcos Rodrigo", "BArgentino", 989898);
        Cliente cliente3 = new Cliente("Galimberti Agustin Alejandro", "Zsur", 45978);
        Cliente cliente4 = new Cliente("Vega Yair Herman", "DangerZone", 7597425);
        Cliente cliente5 = new Cliente("Ortiz Dario", "Lejos", 485692);

// se va a crear una cola a partir de una linkedlist.
        Queue<Cliente> clientes= new LinkedList<>();
        //se añaden los elementos a la cola
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
        clientes.add(cliente4);
        System.out.println("primer cola: " + clientes);
        clientes.add(cliente5);
        System.out.println("clientes + cliente 5: " + clientes);
        //se va a eliminar uno los elementos de la cola.
        clientes.remove(cliente3);
        System.out.println("la nueva cola es : " + clientes);
        System.out.println("el cliente eliminado fue: " + cliente3);

        //recorriendo la cola con un foreach!! :D
        clientes.forEach((cliente) -> {
            System.out.println(cliente);
        });
        //La naturaleza de las colas no es ordenarse, es decir no es lo ideal ya que su uso es para conseguir
        //una forma FIFO es decir que el primer elemento que ingrese, sea el primero en ser mostrado
        // para implementaciones de orden, lo ideal es usar Listas!
    }
}





