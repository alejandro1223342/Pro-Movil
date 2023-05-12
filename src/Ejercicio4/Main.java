/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejo
 */
public class Main {
    public static void main(String[] args) {
        Direccion direccion1 = new Direccion("Calle 1", "Ciudad 1", "12345", "Pais 1");
        Direccion direccion2 = new Direccion("Calle 2", "Ciudad 2", "67890", "Pais 2");
        Direccion direccion3 = new Direccion("Calle 3", "Ciudad 3", "13579", "Pais 3");
        Direccion direccion4 = new Direccion("Calle 4", "Ciudad 4", "24680", "Pais 4");
        
        Estudiante estudiante1 = new Estudiante("Estudiante 1", "Apellidos 1", "11111111A", direccion1, 1);
        Estudiante estudiante2 = new Estudiante("Estudiante 2", "Apellidos 2", "22222222B", direccion2, 2);
        Estudiante estudiante3 = new Estudiante("Estudiante 3", "Apellidos 3", "33333333C", direccion3, 3);
        
        Profesor profesor1 = new Profesor("Profesor 1", "Apellidos 4", "44444444D", direccion1, "Despacho 1");
        Profesor profesor2 = new Profesor("Profesor 2", "Apellidos 5", "55555555E", direccion2, "Despacho 2");
        Profesor profesor3 = new Profesor("Profesor 3", "Apellidos 6", "66666666F", direccion4, "Despacho 3");
        
        List<Persona> listaPersonas = new ArrayList<Persona>();
        listaPersonas.add(estudiante1);
        listaPersonas.add(estudiante2);
        listaPersonas.add(estudiante3);
        listaPersonas.add(profesor1);
        listaPersonas.add(profesor2);
        listaPersonas.add(profesor3);
        
        System.out.println("Lista de personas:");
        for (Persona persona : listaPersonas) {
            persona.identificate();
            System.out.println(persona.toString());
        }
    }
}
