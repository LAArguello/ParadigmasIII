package Clases;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private String direccion;
    private Integer cantClientes;
    private Integer cantCuentas;


    public void agregarCliente(){}
    public void crearCuenta(){}
    public void eliminarCuenta(){}
    public void eliminarCliente(){}


    public Banco(String nombre, String direccion, Integer cantClientes, Integer cantCuentas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantClientes = cantClientes;
        this.cantCuentas = cantCuentas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", cantClientes=" + cantClientes +
                ", cantCuentas=" + cantCuentas +
                '}';
    }
}
