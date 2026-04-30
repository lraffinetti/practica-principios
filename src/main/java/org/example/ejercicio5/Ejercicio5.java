package org.example.ejercicio5;
import java.util.HashMap;
import java.util.Map;

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

    private Map<Integer,CuentaBancaria> cuentas = new HashMap<>();
    private Integer idDisponible = 0;



    public Integer crearCuenta(){
        Integer idCuenta = idDisponible;
        CuentaBancaria cuentaNueva = new CuentaBancaria();

        idDisponible++;

        cuentas.put(idCuenta,cuentaNueva);
        return idCuenta;
    }

    public void depositarDinero(int cantidad, Integer idCuenta){

        CuentaBancaria cuenta = cuentas.get(idCuenta);
        cuenta.depositar(cantidad);
    }

    public int obtenerSaldo(Integer idCuenta){
        CuentaBancaria cuenta = cuentas.get(idCuenta);
        return cuenta.obtenerSaldo();
    }

    public void retirarDinero(int cantidad,Integer idCuenta) {

        CuentaBancaria cuenta = cuentas.get(idCuenta);

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
        CajeroAutomatico cajero = new CajeroAutomatico();
        Integer idCuenta = cajero.crearCuenta();

        cajero.depositarDinero(200, idCuenta);
        cajero.retirarDinero(150, idCuenta);
        System.out.println("Saldo cuenta " + idCuenta + " es: " + cajero.obtenerSaldo(idCuenta) );
        
    }
}
