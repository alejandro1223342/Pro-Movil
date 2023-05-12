/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author alejo
 */
class Profesor extends Persona {
    private String despacho;
    
    public Profesor(String nombre, String apellidos, String nif, Direccion direccion, String despacho) {
        super(nombre, apellidos, nif, direccion);
        this.despacho = despacho;
    }
    
    public String getDespacho() {
        return this.despacho;
    }
    
    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
    
    public void identificate() {
        System.out.println("Soy un profesor.");
    }
    
    public String toString() {
        return "Profesor " + getNombre() + " " + getApellidos();
    }
}
