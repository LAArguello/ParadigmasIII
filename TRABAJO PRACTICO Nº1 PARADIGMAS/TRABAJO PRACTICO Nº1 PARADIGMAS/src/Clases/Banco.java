package Clases;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                ", cuentas=" + cuentas +
                '}';
    }

    public void crearCliente(){}
    public void crearCuenta(){}
    public void eliminarCuenta() {}
    public void eliminarCliente(){}
}
