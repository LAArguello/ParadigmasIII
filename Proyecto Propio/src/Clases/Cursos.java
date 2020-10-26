package Clases;

import java.util.ArrayList;

public class Cursos {
    private String id;
    private ArrayList<Alumnos> alumnos= new ArrayList();

    @Override
    public String toString() {
        return "Cursos{" +
                "id='" + id + '\'' +
                ", alumnos=" + alumnos +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }
}
