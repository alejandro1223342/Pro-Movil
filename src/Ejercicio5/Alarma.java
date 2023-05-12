/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alejo
 */
class Alarma {
    private Sensor sensor;
    private Timbre timbre;
    private int umbral;

    public Alarma(Sensor sensor, Timbre timbre, int umbral) {
        this.sensor = sensor;
        this.timbre = timbre;
        this.umbral = umbral;
    }

    public void comprobar() {
        int valor = sensor.leer();
        if (valor > umbral) {
            timbre.sonar();
        }
    }
}
