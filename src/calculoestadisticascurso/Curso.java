/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculoestadisticascurso;

import java.util.Scanner;

/**
 *
 * @author labctr
 */
public class Curso {

    private String nom;
    private int cantidadEst;

    public Curso(String nom, int cantidadEst) {
        this.nom = nom;
        this.cantidadEst = cantidadEst;
    }

    public void calcularEstadisticas(double[] notas, int[] semestres) {
        double sumaNotas = 0;
        int ganadores = 0;
        int perdedores = 0;
        int sumaSemestres = 0;

        for (int i = 0; i < cantidadEst; i++) {
            sumaNotas += notas[i];

            if (notas[i] >= 14) {
                ganadores++;
            }

            if (notas[i] <= 13) {
                perdedores++;
            }

            sumaSemestres += semestres[i];
        }

        double promedioDecimal = (double) sumaSemestres / cantidadEst;
        int semestreProm = (int) Math.round(promedioDecimal);

        mostrarDatos(sumaNotas / cantidadEst, ganadores, perdedores, semestreProm);
    }

    private void mostrarDatos(double notaPromedio, int estudiantesAprobados, int estudiantesReprobados,
            int semestrePromedio) {
    
        this.notaPromedio = notaPromedio;
        this.estudiantesAprobados = estudiantesAprobados;
        this.estudiantesReprobados = estudiantesReprobados;
        this.semestrePromedio = semestrePromedio;
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public int getEstudiantesAprobados() {
        return estudiantesAprobados;
    }

    public int getEstudiantesReprobados() {
        return estudiantesReprobados;
    }

    public int getSemestrePromedio() {
        return semestrePromedio;
    }

    private double notaPromedio;
    private int estudiantesAprobados;
    private int estudiantesReprobados;
    private int semestrePromedio;
}
