/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author alejo
 */
public class InvocacionMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        C obj = new D();
        obj.p(obj);         // output: CD
        ((D)obj).p(obj);    // output: DD
        obj.p((D) obj);     // output: DD
        
    }

}
