/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculoestadisticascurso;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class CalculoEstadisticasCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese el nombre del curso: ");
        String nombre = leer.nextLine();

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidadEst = leer.nextInt();

        Curso curso = new Curso(nombre, cantidadEst);

        double[] notas = new double[cantidadEst];
        int[] semestres = new int[cantidadEst];

     
        System.out.println("Ingrese las notas y semestres de los estudiantes:");
        for (int i = 0; i < cantidadEst; i++) {
            System.out.print("Ingrese la nota del estudiante " + (i + 1) + ": ");
            notas[i] = leer.nextDouble();

            System.out.print("Ingrese el semestre del estudiante " + (i + 1) + ": ");
            semestres[i] = leer.nextInt();
        }

       
        curso.calcularEstadisticas(notas, semestres);

    
        System.out.println("\nEstadísticas del curso:");
        System.out.println("Nota promedio: " + curso.getNotaPromedio());
        System.out.println("Estudiantes aprobados: " + curso.getEstudiantesAprobados());
        System.out.println("Estudiantes reprobados: " + curso.getEstudiantesReprobados());
        System.out.println("Semestre promedio: " + curso.getSemestrePromedio());

        leer.close();
    }
}
