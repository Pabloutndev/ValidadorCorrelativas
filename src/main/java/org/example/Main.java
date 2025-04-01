package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos");
        Materia paradigmas = new Materia("Paradigmas de Programación");
        Materia diseno = new Materia("Diseño de Sistemas");

        paradigmas.agregarCorrelativa(algoritmos);
        diseno.agregarCorrelativa(paradigmas);

        Alumno alumno = new Alumno("Pepe Lopez");
        alumno.aprobarMateria(algoritmos);
        // alumno.aprobarMateria(paradigmas); // puede inscribirse a diseño

        // Intentar inscripción a Diseño de Sistemas
        List<Materia> materiasAInscribirse = new ArrayList<>();
        materiasAInscribirse.add(diseno);

        Inscripcion inscripcion = new Inscripcion(alumno, materiasAInscribirse);
        System.out.println("Inscripción aprobada: " + inscripcion.aprobada());
    }
}
