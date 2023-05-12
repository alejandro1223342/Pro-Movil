/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author alejo
 */
public class Electrodomestico {

    private double consumo;
    private String modelo;

    public Electrodomestico(double c, String m) {
        consumo = c;
        modelo = m;
    }

    public String toString() {
        return "Modelo: " + modelo + " Consumo: " + consumo;
    }

  
}
