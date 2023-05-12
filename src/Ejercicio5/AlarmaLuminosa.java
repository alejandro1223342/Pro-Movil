/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio5;

/**
 *
 * @author alejo
 */
class AlarmaLuminosa extends Alarma {
    private Luz luz;

    public AlarmaLuminosa(Sensor sensor, Timbre timbre, int umbral, Luz luz) {
        super(sensor, timbre, umbral);
        this.luz = luz;
    }

    public void comprobar() {
        super.comprobar();
        luz.encender();
    }
}