package com.company;
import Clases.Alumnos;
import Clases.Cursos;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {

    public static void main(String[] args) throws IOException {
    BufferedReader lector= new BufferedReader(new InputStreamReader(System.in));
    Cursos primero= new Cursos();
    Cursos segundo= new Cursos();
    Cursos tercero= new Cursos();
    Cursos cuarto= new Cursos();
    Cursos quinto= new Cursos();
    Cursos sexto= new Cursos();
	System.out.println("Bienvenido al sistema de beneficios de alumnos, Desea añadir alumnos nuevos? S/N");
	String yesno = lector.readLine();
	if(yesno.equals("s")){
		System.out.println("ingrese el curso al que pertenece el o los alumnos:");
		String Curso= (lector.readLine());
		if(Curso.equals("primero")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnosprimero= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
			Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnosprimero.add(alumno);
				primero.setId(Curso);
				primero.setAlumnos(alumnosprimero);

			}
			System.out.println("Los Alumnos del curso son: "+primero );
		}
		if(Curso.equals("segundo")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnossegundo= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
				Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnossegundo.add(alumno);
				segundo.setId(Curso);
				segundo.setAlumnos(alumnossegundo);

			}
			System.out.println("Los Alumnos del curso son: "+segundo );
		}
		if(Curso.equals("tercero")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnostercero= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
				Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnostercero.add(alumno);
				tercero.setId(Curso);
				tercero.setAlumnos(alumnostercero);

			}
			System.out.println("Los Alumnos del curso son: "+tercero );
		}
		if(Curso.equals("cuarto")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnoscuarto= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
				Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnoscuarto.add(alumno);
				cuarto.setId(Curso);
				cuarto.setAlumnos(alumnoscuarto);

			}
			System.out.println("Los Alumnos del curso son: "+cuarto );
		}
		if(Curso.equals("quinto")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnosquinto= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
				Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnosquinto.add(alumno);
				quinto.setId(Curso);
				quinto.setAlumnos(alumnosquinto);

			}
			System.out.println("Los Alumnos del curso son: "+ quinto );
		}
		if(Curso.equals("sexto")){
			System.out.println("Cuantos alumnos quiere ingresar?");
			String cantidad= (lector.readLine());
			int cantidadint= Integer.parseInt(cantidad);
			ArrayList<Alumnos> alumnossexto= new ArrayList<>();
			for(int i=0; i<cantidadint; i++){
				Alumnos alumno= new Alumnos();
				System.out.println("Inserte N Y A Del Alumno:");
				alumno.setNya(lector.readLine());
				System.out.println("Ingrese carrera a la que quiere ingresar : ");
				alumno.setCarrera(lector.readLine());
				System.out.println("Ingrese dni");
				alumno.setDni(lector.readLine());
				alumno.setAño(Curso);
				System.out.println("ingrese fecha de nacimiento con el patron: xx-xx-xxxx");
				alumno.setNac(lector.readLine());
				System.out.println("Ingrese La matricula del alumno: Formato XXXX-NNN");
				alumno.setMatricula(lector.readLine());
				System.out.println("El Alumno que acaba de añadir es:"+alumno);
				alumnossexto.add(alumno);
				sexto.setId(Curso);
				sexto.setAlumnos(alumnossexto);

			}
			System.out.println("Los Alumnos del curso son: "+sexto );
		}

    }else {
		System.out.println("Gracias vuelva pronto :D");
	}



    }
}
