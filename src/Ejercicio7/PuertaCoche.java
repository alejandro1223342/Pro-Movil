/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio7;

/**
 *
 * @author alejo
 */
class PuertaCoche extends ComponenteDeCoche implements PuertaBloqueable, Alarma {
    boolean estaBloqueada;
    boolean alarmaActivada;

    public PuertaCoche(String descripcion, double peso, double coste) {
        super(descripcion, peso, coste);
    }

    @Override
    public void abrir() {
        System.out.println("La puerta se ha abierto.");
    }

    @Override
    public void cerrar() {
        System.out.println("La puerta se ha cerrado.");
    }

    @Override
    public void bloquear() {
        System.out.println("La puerta se ha bloqueado.");
        estaBloqueada = true;
    }

    @Override
    public void desbloquear() {
        System.out.println("La puerta se ha desbloqueado.");
        estaBloqueada = false;
    }

    @Override
    public boolean alarmaActivada() {
        return alarmaActivada;
    }

    @Override
    public void activarAlarma() {
        System.out.println("La alarma se ha activado.");
        alarmaActivada = true;
    }

    @Override
    public void desactivarAlarma() {
        System.out.println("La alarma se ha desactivado.");
        alarmaActivada = false;
    }
}
