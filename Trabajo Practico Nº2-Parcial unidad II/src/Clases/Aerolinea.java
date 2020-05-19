package Clases;

public class Aerolinea {
    private String nombre;
    private Integer id;
    private Integer cantidadPilotos;
    private Integer cantidadAviones;
    private String destinos;


    public void venderVuelos(){}
    public void contratarPilotos(){}
    public void despedirPilotos(){}
    public void agregarDestinos(){}

    public Aerolinea(String nombre, Integer id, Integer cantidadPilotos, Integer cantidadAviones, String destinos) {
        this.nombre = nombre;
        this.id = id;
        this.cantidadPilotos = cantidadPilotos;
        this.cantidadAviones = cantidadAviones;
        this.destinos = destinos;
    }
}
