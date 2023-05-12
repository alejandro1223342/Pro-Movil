/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author alejo
 */
import java.time.LocalTime;

public class Prueba {
    public static void main(String[] args) {
        BlocNotas blocNotas = new BlocNotas();

        Nota nota1 = new Nota(1, "Recordar comprar pan");
        NotaAlarma nota2 = new NotaAlarma(2, "Llamar a María", LocalTime.of(10, 30));
        Nota nota3 = new Nota(3, "Hacer ejercicio a las 6 pm");

        blocNotas.agregarNota(nota1);
        blocNotas.agregarNota(nota2);
        blocNotas.agregarNota(nota3);

        blocNotas.listarNotas();
       

        blocNotas.eliminarNota(1);

        System.out.println("El bloc de notas contiene " + blocNotas.contarNotas() + " notas.");
    }
}