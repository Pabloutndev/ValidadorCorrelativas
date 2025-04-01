package domain.validator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MainTest {
    @Test
    void testInscripcionExitosa() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseno = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseno.agregarCorrelativa(paradigmas);

        Alumno alumno = new Alumno("Estudiante");
        alumno.aprobarMateria(algoritmos);
        alumno.aprobarMateria(paradigmas);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(diseno);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasAInscribirse);
        assertTrue(inscripcion.aprobada());
    }

    @Test
    void testInscripcionFallida() {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseno = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseno.agregarCorrelativa(paradigmas);

        Alumno alumno = new Alumno("Estudiante");
        alumno.aprobarMateria(algoritmos);

        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(diseno);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasAInscribirse);
        assertFalse(inscripcion.aprobada());
    }
}