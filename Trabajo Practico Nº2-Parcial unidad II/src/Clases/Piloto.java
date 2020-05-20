package Clases;

public class Piloto {
    private String nombreYApellido;
    private String experiencia;
    private String aerolinea;

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public void setNombreYApellido(String nombreYApellido) {
        this.nombreYApellido = nombreYApellido;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Piloto(String nombreYApellido, String experiencia, String aerolinea) {
        this.nombreYApellido = nombreYApellido;
        this.experiencia = experiencia;
        this.aerolinea = aerolinea;
    }



    public void vuelo(){}

    @Override
    public String toString() {
        return "Piloto{" +
                "nombreYApellido='" + nombreYApellido + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", aerolinea='" + aerolinea + '\'' +
                '}';
    }
}


