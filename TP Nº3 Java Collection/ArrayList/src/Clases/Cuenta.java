package Clases;

public class Cuenta {
    private Integer numCuenta;
    private String tipoCuenta;
    private Integer saldo;

    public Cuenta() {
    }

    public void verCuenta(){}

    public Cuenta(Integer numCuenta, String tipoCuenta, Integer saldo) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "numCuenta=" + numCuenta +
                ", tipoCuenta='" + tipoCuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
