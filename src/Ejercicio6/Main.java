/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alejo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Planeta tierra = new Planeta(5.9724, 12742, 24, 365.24, 149.66, 0.0167);
        //Satelite luna = new Satelite( 7.34222, 3474, 27.3, 27.3, 3800, 0.0549);

        System.out.println("Información sobre la Tierra:");
        tierra.imprimirInformacion();

        System.out.println("\nInformación sobre la Luna:");
       // luna.imprimirInformacion();
    }

}
