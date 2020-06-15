package Clases;

public class Cliente {
    private String NYA;
    private String direccion;
    private Integer numcuenta;


    public void gestionarCuenta() {
    }

    public void comprarAcciones() {
    }

    public void venderAcciones() {
    }

    public void ahorrar() {
    }

    public Cliente(String NYA, String direccion, Integer numcuenta) {
        this.NYA = NYA;
        this.direccion = direccion;
        this.numcuenta = numcuenta;


    }

    @Override
    public String toString() {
        return "Cliente{" +
                "NYA='" + NYA + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numcuenta=" + numcuenta +
                '}';
    }
}

