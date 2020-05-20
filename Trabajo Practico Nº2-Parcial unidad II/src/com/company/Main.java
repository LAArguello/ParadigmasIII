package com.company;
import Clases.Piloto;
import Clases.Aerolinea;
import Clases.Aeropuerto;
import Clases.Vuelos;
import Clases.Avion;

public class Main {
    public static void main(String[] args) {
     Aeropuerto aerojfk;
     Aerolinea  aerolineasargentinas;
     Avion a380;
     Vuelos v666;
     Piloto josehernandez;


     aerojfk= new Aeropuerto(7789, 10,"3");
     aerolineasargentinas=new Aerolinea("Aerolineas Argentinas",8787, 10,10,"4");
     a380= new Avion(666,"comercial","Reparacion","Aire",2);
     v666= new Vuelos(666,0300,1500,"JFK","Orona Marcos","a360");
     josehernandez=new Piloto("Jose Hernandez","Profesional","Aerolineas Argentinas");
     System.out.println(aerojfk.toString());
     System.out.println(aerolineasargentinas.toString());
     System.out.println(a380.toString());
     System.out.println(v666.toString());
     System.out.println(josehernandez.toString());

     
    }

}
