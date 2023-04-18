package entidades;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombre;
    private List<Materia> correlativas;


    public Materia() {
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.correlativas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getCorrelativas() {
        return correlativas;
    }

    public void setCorrelativas(List<Materia> correlativas) {
        this.correlativas = correlativas;
    }

    public void agregarCorrelativa(Materia correlativa) {
          this.correlativas.add(correlativa);
    }

    public boolean puedeCursar (Alumno alumno) {

        boolean puedeCursar = true;

        for (int i = 0; i < correlativas.size(); i++) {
            System.out.println("correlativa: " + correlativas.get(i));
            if ( !alumno.getMateriasAprobadas().contains(correlativas.get(i))) {
                puedeCursar = false;
            }
        }

        return puedeCursar;
    }

}
