/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author alejo
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        FiguraGeometrica fg = new Cuadrado(5);
        fg.calcularArea();
        System.out.println("Cuadrado " + fg.calcularArea());

        FiguraGeometrica fg2 = new Triangulo(3, 4, 5, 5, 5);
        fg2.calcularArea();
        System.out.println("Triangulo " + fg2.calcularArea());
        
        FiguraGeometrica fg3 = new Rombo(6, 8);
        fg3.calcularArea();
        System.out.println("Rombo "+fg3.calcularArea());
       
    }

}
