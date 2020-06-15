package Clases;

public class CuentaDeAcciones extends Cuenta{
    private Integer acciones;

    public void gestionDeAcciones(){}

    public Integer getAcciones() {
        return acciones;
    }

    public void setAcciones(Integer acciones) {
        this.acciones = acciones;
    }

    @Override
    public String toString() {
        return "CuentaDeAcciones{" +
                "acciones=" + acciones + "numeroCuenta=" + getNumeroCuenta() +
                ", tipoDeCuenta='" + getTipoDeCuenta() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }
}
