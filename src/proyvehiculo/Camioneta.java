/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyvehiculo;

/**
 *
 * @author alejo
 */
public class Camioneta extends Vehiculo {
    private int carga;

    public Camioneta(String color, int ruedas, String marca, int carga) {
        super(color, ruedas, marca);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }
}
