/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyCuenta;

/**
 *
 * @author alejo
 */
public class CuentaCorriente extends Cuenta {
    private static final double INTERES_FIJO = 0.015;
    
    public CuentaCorriente(Persona cliente, long numeroCuenta) {
        super(cliente, numeroCuenta);
    }
    
    public String toString() {
        return "Cuenta Corriente - Número de cuenta: " + getNumeroCuenta() + ", Saldo: " + getSaldo();
    }
    
    public void actualizarSaldo() {
        double interes = getSaldo() * INTERES_FIJO;
        ingresar(interes);
    }
    
    public void retirar(double cantidad) {
        if (cantidad <= getSaldo()) {
            setSaldo(getSaldo() - cantidad);
        } else {
            System.out.println("No hay suficiente saldo en la cuenta");
        }
    }
}