/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alejo
 */
public class Planeta extends CuerpoCeleste {
    private double periodoDeRotacion;
    private double periodoDeTraslacionAlrededorDelSol;

    public Planeta(double masa, double diametroMedio, double excentricidad, double distanciaMediaAlOrbitado,
                   double periodoDeRotacion, double periodoDeTraslacionAlrededorDelSol) {
        super(masa, diametroMedio, excentricidad, distanciaMediaAlOrbitado);
        this.periodoDeRotacion = periodoDeRotacion;
        this.periodoDeTraslacionAlrededorDelSol = periodoDeTraslacionAlrededorDelSol;
    }

    public double getPeriodoDeRotacion() {
        return periodoDeRotacion;
    }

    public double getPeriodoDeTraslacionAlrededorDelSol() {
        return periodoDeTraslacionAlrededorDelSol;
    }
    
     @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("Período de rotación: " + periodoDeRotacion);
        System.out.println("Período de traslación alrededor del sol: " + periodoDeTraslacionAlrededorDelSol);
    }
}
