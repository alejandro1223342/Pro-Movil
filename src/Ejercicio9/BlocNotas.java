/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio9;

/**
 *
 * @author alejo
 */
import java.util.ArrayList;
import java.util.List;

public class BlocNotas {
    private List<Nota> notas;

    public BlocNotas() {
        notas = new ArrayList<>();
    }

    public void agregarNota(Nota nota) {
        notas.add(nota);
    }

    public void eliminarNota(int posicion) {
        notas.remove(posicion);
    }

    public void listarNotas() {
        for (Nota nota : notas) {
            System.out.println(nota.toString());
        }
    }

    public int contarNotas() {
        return notas.size();
    }
}
