package Clases;

public class Cliente {
    private String NYA;
    private String direccion;
    private Integer numcuenta;

    public String getNYA() {
        return NYA;
    }

    public void setNYA(String NYA) {
        this.NYA = NYA;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumcuenta() {
        return numcuenta;
    }

    public void setNumcuenta(Integer numcuenta) {
        this.numcuenta = numcuenta;
    }

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

