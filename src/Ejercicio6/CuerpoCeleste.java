/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alejo
 */
public class CuerpoCeleste {

    private double masa;
    private double diametroMedio;
    private double excentricidad;
    private double distanciaMediaAlOrbitado;

    public CuerpoCeleste(double masa, double diametroMedio, double excentricidad, double distanciaMediaAlOrbitado) {
        this.masa = masa;
        this.diametroMedio = diametroMedio;
        this.excentricidad = excentricidad;
        this.distanciaMediaAlOrbitado = distanciaMediaAlOrbitado;
    }

    public double getMasa() {
        return masa;
    }

    public double getDiametroMedio() {
        return diametroMedio;
    }

    public double getExcentricidad() {
        return excentricidad;
    }

    public double getDistanciaMediaAlOrbitado() {
        return distanciaMediaAlOrbitado;
    }

    public void imprimirInformacion() {
        System.out.println("Masa: " + masa);
        System.out.println("Diámetro medio: " + diametroMedio);
        System.out.println("Excentricidad de la órbita: " + excentricidad);
        System.out.println("Distancia media al cuerpo orbitado: " + distanciaMediaAlOrbitado);
    }
}
