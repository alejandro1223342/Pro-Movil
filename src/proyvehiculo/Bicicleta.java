/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyvehiculo;

/**
 *
 * @author alejo
 */
public class Bicicleta extends Vehiculo {
    private String tipo;

    public Bicicleta(String color, int ruedas, String marca, String tipo) {
        super(color, ruedas, marca);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}
