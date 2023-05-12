/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alejo
 */
public class Satelite extends CuerpoCeleste {
    private CuerpoCeleste cuerpoOrbitado;
    private double periodoDeTraslacionAlrededorDelOrbitado;

    public Satelite(double masa, double diametroMedio, double excentricidad, double distanciaMediaAlOrbitado,
                    CuerpoCeleste cuerpoOrbitado, double periodoDeTraslacionAlrededorDelOrbitado) {
        super(masa, diametroMedio, excentricidad, distanciaMediaAlOrbitado);
        this.cuerpoOrbitado = cuerpoOrbitado;
        this.periodoDeTraslacionAlrededorDelOrbitado = periodoDeTraslacionAlrededorDelOrbitado;
    }

    public CuerpoCeleste getCuerpoOrbitado() {
        return cuerpoOrbitado;
    }

    public double getPeriodoDeTraslacionAlrededorDelOrbitado() {
        return periodoDeTraslacionAlrededorDelOrbitado;
    }
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Cuerpo orbitado: " + cuerpoOrbitado);
        System.out.println("Período de traslación alrededor del cuerpo orbitado: " + periodoDeTraslacionAlrededorDelOrbitado);
    }
}
