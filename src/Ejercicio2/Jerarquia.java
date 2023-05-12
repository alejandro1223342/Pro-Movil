/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

import java.util.Vector;

/**
 *
 * @author alejo
 */
public class Jerarquia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector<Figura> figuras = new Vector<Figura>();
        figuras.add(new Circulo(10)); 
        figuras.add(new Cuadrado(10)); 
        figuras.add(new Triangulo(10, 5));

        for (Figura f : figuras)
            System.out.println("Área: " + f.area());
    }
    
}
