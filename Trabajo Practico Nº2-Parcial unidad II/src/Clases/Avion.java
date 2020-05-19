package Clases;

public class Avion {
    private Integer numeroAvion;
    private String tipo;
    private String estado;
    private String Lugar;
    private Integer cantidadDePilotos;


    public void vuelo(){}

    public Integer getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(Integer numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public Integer getCantidadDePilotos() {
        return cantidadDePilotos;
    }

    public void setCantidadDePilotos(Integer cantidadDePilotos) {
        this.cantidadDePilotos = cantidadDePilotos;
    }

    public Avion(Integer numeroAvion, String tipo, String estado, String lugar, Integer cantidadDePilotos) {
        this.numeroAvion = numeroAvion;
        this.tipo = tipo;
        this.estado = estado;
        Lugar = lugar;
        this.cantidadDePilotos = cantidadDePilotos;
    }
}
