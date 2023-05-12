/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author alejo
 */
public class Frigorifico extends Electrodomestico implements MuestraInformacion {

    double temperatura;

    public Frigorifico(double c, String m, double t) {

        super(c, m);
        temperatura = t;
    }

    public String toString() {

        return super.toString() + " Temperatura: " + temperatura;
    }

    public String muestra() {

        return "Temperatura: " + temperatura;
    }
}
