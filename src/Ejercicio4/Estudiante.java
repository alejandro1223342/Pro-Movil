/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author alejo
 */
class Estudiante extends Persona {
    private int idEstudiante;
    
    public Estudiante(String nombre, String apellidos, String nif, Direccion direccion, int idEstudiante) {
        super(nombre, apellidos, nif, direccion);
        this.idEstudiante = idEstudiante;
    }
    
    public int getIdEstudiante() {
        return this.idEstudiante;
    }
    
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
    
    public void identificate() {
        System.out.println("Soy un estudiante.");
    }
    
    public String toString() {
        return "Estudiante " + getNombre() + " " + getApellidos();
    }
}
