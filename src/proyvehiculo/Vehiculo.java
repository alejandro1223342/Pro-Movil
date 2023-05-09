/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyvehiculo;

/**
 *
 * @author alejo
 */
public class Vehiculo {
    private String color;
    private int ruedas;
    private String marca;

    public Vehiculo(String color, int ruedas, String marca) {
        this.color = color;
        this.ruedas = ruedas;
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public int getRuedas() {
        return ruedas;
    }

    public String getMarca() {
        return marca;
    }
}
