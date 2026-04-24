package org.example.ejercicio5;

class CuentaBancaria {
    private int saldo;

    public void depositar(int cantidad) {
        saldo += cantidad;
    }

    public void retirar(int cantidad) {
        saldo -= cantidad;
    }

    public int obtenerSaldo() {
        return saldo;
    }
}

class CajeroAutomatico {
    private CuentaBancaria cuenta;

    public void retirarDinero(int cantidad) {
        if (cuenta.obtenerSaldo() >= cantidad) {
            cuenta.retirar(cantidad);
            System.out.println(cantidad + " retirados exitosamente.");
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

public class Ejercicio5 {
    public static void main(String[] args){

    }
}
