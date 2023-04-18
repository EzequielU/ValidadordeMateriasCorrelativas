package entidades;

import java.util.Date;

public class Inscripcion {

    private Alumno alumno;
    private Materia materia;
    private Date fecha;

    public Inscripcion(){
        this.fecha = new Date();
    }


    public Inscripcion(Alumno alumno, Materia materia) {
        this.alumno = alumno;
        this.materia = materia;
        this.fecha = new Date();
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public boolean aprobada() {
        return materia.puedeCursar(alumno);
    }




}
