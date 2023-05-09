/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyvehiculo;

/**
 *
 * @author alejo
 */
public class Coche extends Vehiculo {
    private int velocidad;
    private int cilindraje;

    public Coche(String color, int ruedas, String marca, int velocidad, int cilindraje) {
        super(color, ruedas, marca);
        this.velocidad = velocidad;
        this.cilindraje = cilindraje;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getCilindraje() {
        return cilindraje;
    }
}
