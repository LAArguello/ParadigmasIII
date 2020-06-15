package Clases;

public class CuentaDeAhorro extends Cuenta {
    private String tipoDeAhorro;


    public void gestiondecuenta(){

    }

    public String getTipoDeAhorro() {
        return tipoDeAhorro;
    }

    public void setTipoDeAhorro(String tipoDeAhorro) {
        this.tipoDeAhorro = tipoDeAhorro;
    }

    @Override
    public String toString() {
        return "CuentaDeAhorro{" +
                "tipoDeAhorro='" + tipoDeAhorro + '\'' + "numeroCuenta=" + getNumeroCuenta() +
                ", tipoDeCuenta='" + getTipoDeCuenta() + '\'' +
                ", saldo=" + getSaldo() +
                '}';
    }
}
