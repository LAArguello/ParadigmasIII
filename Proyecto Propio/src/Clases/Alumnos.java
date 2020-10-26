package Clases;

import java.util.Date;

public class Alumnos {
    private String nya;
    private String nac;
    private String dni;
    private String matricula;
    private String carrera;
    private String año;
    private String beneficios="0";

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public String getNya() {
        return nya;
    }

    public void setNya(String nya) {
        this.nya = nya;
    }

    public String getNac() {
        return nac;
    }

    public void setNac(String nac) {
        this.nac = nac;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }


    @Override
    public String toString() {
        return "Alumnos{" +
                "nya='" + nya + '\'' +
                ", nac='" + nac + '\'' +
                ", dni='" + dni + '\'' +
                ", matricula='" + matricula + '\'' +
                ", carrera='" + carrera + '\'' +
                ", año='" + año + '\'' +
                ", beneficios='" + beneficios + '\'' +
                '}';
    }
}
