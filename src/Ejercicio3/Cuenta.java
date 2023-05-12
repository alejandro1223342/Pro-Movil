/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author alejo
 */
public abstract class Cuenta {

    private long numeroCuenta;
    private double saldo;
    private Persona cliente;

    public Cuenta(Persona cliente, long numeroCuenta) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingresar(double cantidad) {
        saldo += cantidad;
    }

    public abstract void retirar(double cantidad);

    public abstract void actualizarSaldo();
}
