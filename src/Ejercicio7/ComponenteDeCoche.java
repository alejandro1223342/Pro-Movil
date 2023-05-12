/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author alejo
 */
class ComponenteDeCoche {
    String descripcion;
    double peso;
    double coste;

    public ComponenteDeCoche(String descripcion, double peso, double coste) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.coste = coste;
    }

    public void mostrarAtributos() {
        System.out.println("Descripción: " + descripcion);
        System.out.println("Peso: " + peso);
        System.out.println("Coste: " + coste);
    }
}
