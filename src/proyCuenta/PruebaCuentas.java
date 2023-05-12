/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyCuenta;

/**
 *
 * @author alejo
 */
public class PruebaCuentas {
    public static void main(String[] args) {
        Persona cliente1 = new Persona("Juan", "García", "12345678A");
        Persona cliente2 = new Persona("María", "López", "87654321B");
        
        CuentaCorriente cuenta1 = new CuentaCorriente(cliente1, 123456789);
        CuentaAhorro cuenta2 = new CuentaAhorro(cliente2, 987654321, 0.02, 1000);
        
        cuenta1.ingresar(1000);
        cuenta1.retirar(500);
        cuenta1.actualizarSaldo();
        System.out.println(cuenta1);
        
        cuenta2.ingresar(5000);
        cuenta2.retirar(2000);
        cuenta2.actualizarSaldo();
        cuenta2.cambiarInteres(0.03);
        System.out.println(cuenta2);
    }
}