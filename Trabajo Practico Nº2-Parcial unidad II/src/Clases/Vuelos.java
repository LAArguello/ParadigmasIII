package Clases;

public class Vuelos {
    private Integer id;
    private Integer horaSalida;
    private Integer horaLlegada;
    private String aeropuerto;
    private String piloto;
    private String idAvion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Integer horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Integer getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Integer horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getAeropuerto() {
        return aeropuerto;
    }

    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    public String getPiloto() {
        return piloto;
    }

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    public String getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(String idAvion) {
        this.idAvion = idAvion;
    }

    public Vuelos(Integer id, Integer horaSalida, Integer horaLlegada, String aeropuerto, String piloto, String idAvion) {
        this.id = id;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.aeropuerto = aeropuerto;
        this.piloto = piloto;
        this.idAvion = idAvion;
    }

    public Vuelos() {}

    @Override
    public String toString() {
        return "Vuelos{" +
                "id=" + id +
                ", horaSalida=" + horaSalida +
                ", horaLlegada=" + horaLlegada +
                ", aeropuerto='" + aeropuerto + '\'' +
                ", piloto='" + piloto + '\'' +
                ", idAvion='" + idAvion + '\'' +
                '}';
    }
}
