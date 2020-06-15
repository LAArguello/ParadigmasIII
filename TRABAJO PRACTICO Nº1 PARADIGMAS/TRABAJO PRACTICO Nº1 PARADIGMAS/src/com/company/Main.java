package com.company;

import Clases.Banco;
import Clases.Cliente;
import Clases.Cuenta;
import Clases.CuentaDeAhorro;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Banco banconacion;
        Cliente cliente1;
        CuentaDeAhorro cuenta1;


        cliente1= new Cliente("Arguello Leonel Alejandro","Llamas Y Pucara",154896);

        cuenta1= new CuentaDeAhorro();
        cuenta1.setNumeroCuenta(475896);
        cuenta1.setSaldo(5000);
        cuenta1.setTipoDeCuenta("De Ahorro");
        cuenta1.setTipoDeAhorro("Pesos");



        banconacion= new Banco();
        banconacion.setNombre("Banco Nacion");
        ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>() ;
        cuentas.add(cuenta1);
        banconacion.setCuentas(cuentas);
        ArrayList<Cliente> clientes= new ArrayList<Cliente>();
        clientes.add(cliente1);
        banconacion.setClientes(clientes);



        System.out.println(cliente1.toString());
        System.out.println(cuenta1.toString());
        System.out.println(banconacion.toString());
    }

}
