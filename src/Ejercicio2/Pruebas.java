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
        Cuadrado cuadrado = new Cuadrado(5);
        double areaCuadrado = cuadrado.calcularArea();
        System.out.println("El área del cuadrado es: " + areaCuadrado);
        System.out.println("");
        
        Triangulo triangulo = new Triangulo(3, 4, 5, 5, 5);
        double areaTriangulo = triangulo.calcularArea();
        double perimetroTriangulo = triangulo.calcularPerimetro();
        System.out.println("El área del triángulo es: " + areaTriangulo);
        System.out.println("El perímetro del triángulo es: " + perimetroTriangulo);

        Rombo rombo = new Rombo(6, 8);
        double areaRombo = rombo.calcularArea();
        System.out.println("El área del rombo es: " + areaRombo);
    }
    
}
