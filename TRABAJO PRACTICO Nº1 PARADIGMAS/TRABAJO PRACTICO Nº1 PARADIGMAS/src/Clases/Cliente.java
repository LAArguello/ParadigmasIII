package Clases;

public class Cliente  {
    private String nombreYApellido;
    private String direccion;
    private Integer numeroDeCuenta;



    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(Integer numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Cliente(String nombreYApellido, String direccion, Integer numeroDeCuenta) {
        this.nombreYApellido = nombreYApellido;
        this.direccion = direccion;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreYApellido='" + nombreYApellido + '\'' +
                ", direccion='" + direccion + '\'' +
                ", numeroDeCuenta=" + numeroDeCuenta +
                '}';
    }

    public void gestionarCuenta(){}
    public void comprarAcciones(){}
    public void venderAcciones(){}
    public void iniciarahorro(){}


}

