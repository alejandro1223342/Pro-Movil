/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alejo
 */
public class Main {
    public static void main(String[] args) {
        // Creamos los objetos necesarios
        Sensor sensor = new Sensor();
        Timbre timbre = new Timbre();
        Luz luz = new Luz();
        Alarma alarma = new Alarma(sensor, timbre, 70);
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa(sensor, timbre, 80, luz);

        // Comprobamos la alarma
        System.out.println("Comprobando la alarma:");
        alarma.comprobar();

        // Comprobamos la alarma luminosa
        System.out.println("\nComprobando la alarma luminosa:");
        alarmaLuminosa.comprobar();
    }
}
