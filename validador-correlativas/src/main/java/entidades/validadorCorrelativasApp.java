package entidades;

import entidades.Inscripcion;
import entidades.Materia;
import entidades.Alumno;


public class validadorCorrelativasApp {
    public static void main(String[] args) {
        //crear materias
        Materia materia1 = new Materia("Matematica");

        Materia materia2 = new Materia("Fisica");

        Materia materia3 = new Materia("Biologia");

        //agregar correlatividad
        materia1.agregarCorrelativa(materia1);
        materia3.agregarCorrelativa(materia1);
        materia3.agregarCorrelativa(materia2);


        //Crear alumnos
        Alumno alumno1 = new Alumno("Juan","9227");
        Alumno alumno2 = new Alumno("Joaquin","13930");
        Alumno alumno3 = new Alumno("Sofia","1529");

        alumno2.agregarMateriaAprobada(materia1);
        alumno3.agregarMateriaAprobada(materia1);
        alumno3.agregarMateriaAprobada(materia2);


        //registrar inscripciones
        //inscripcion1: alumno = juan, 9227 - Física
        Inscripcion inscripcion1 = new Inscripcion(alumno1, materia2);
        Inscripcion inscripcion2 = new Inscripcion(alumno2, materia3);
        Inscripcion inscripcion3 = new Inscripcion(alumno3, materia3);

        System.out.println("INSCRIPCION 3");
        System.out.println(inscripcion3.aprobada());

    }
}



