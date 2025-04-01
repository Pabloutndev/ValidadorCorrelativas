package org.example;
import java.util.List;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasAInscribirse;

    public Inscripcion(Alumno alumno, List<Materia> materiasAInscribirse) {
        this.alumno = alumno;
        this.materiasAInscribirse = materiasAInscribirse;
    }

    public boolean aprobada() {
        for (Materia materia : materiasAInscribirse) {
            if (!materia.cumpleCorrelativas(alumno.getMateriasAprobadas())) {
                return false;
            }
        }
        return true;
    }
}