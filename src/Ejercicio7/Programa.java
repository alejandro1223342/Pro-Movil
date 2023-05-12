/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author alejo
 */
public class Programa {
    public static void main(String[] args) {
        PuertaCoche puertaCoche = new PuertaCoche("Puerta delantera derecha", 20.0, 100.0);

        // Operaciones de la interfaz Puerta
        puertaCoche.abrir();
        puertaCoche.cerrar();

        // Operaciones de la interfaz PuertaBloqueable
        puertaCoche.bloquear();
        puertaCoche.desbloquear();

        // Operaciones de la interfaz Alarma
        puertaCoche.activarAlarma();
        System.out.println("¿Está la alarma activada? " + puertaCoche.alarmaActivada());
        puertaCoche.desactivarAlarma();
        System.out.println("¿Está la alarma activada? " + puertaCoche.alarmaActivada());

        // Mostrar atributos de la puerta
        puertaCoche.mostrarAtributos();
    }
}
