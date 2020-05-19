package Clases;

public class Aeropuerto {
    private Integer id;
    private Integer cantidadAviones;
    private String aerolineasdisponibles;

    public void recibirVuelos() {}

    public void EnviarVuelos() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCantidadAviones() {
        return cantidadAviones;
    }

    public void setCantidadAviones(Integer cantidadAviones) {
        this.cantidadAviones = cantidadAviones;
    }

    public String getAerolineasdisponibles() {
        return aerolineasdisponibles;
    }

    public void setAerolineasdisponibles(String aerolineasdisponibles) {
        this.aerolineasdisponibles = aerolineasdisponibles;
    }

    public Aeropuerto(Integer id, Integer cantidadAviones, String aerolineasdisponibles) {
        this.id = id;
        this.cantidadAviones = cantidadAviones;
        this.aerolineasdisponibles = aerolineasdisponibles;
    }
}

