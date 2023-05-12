/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyCuenta;

/**
 *
 * @author alejo
 */
public class CuentaAhorro extends Cuenta {
    private double interesAnual;
    private double saldoMinimo;
    
    public CuentaAhorro(Persona cliente, long numeroCuenta, double interesAnual, double saldoMinimo) {
        super(cliente, numeroCuenta);
        this.interesAnual = interesAnual;
        this.saldoMinimo = saldoMinimo;
    }
    
    public String toString() {
        return "Cuenta Ahorro - Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo();
    }
    
    public void actualizarSaldo() {
        double interes = getSaldo() * (interesAnual / 12);
        ingresar(interes);
    }
    
    public void retirar(double cantidad) {
        if (getSaldo() - cantidad >= saldoMinimo) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No se puede retirar esa cantidad de dinero debido al saldo mínimo requerido.");
        }
    }
    
    public void cambiarInteres(double nuevoInteres) {
        interesAnual = nuevoInteres;
    }
}