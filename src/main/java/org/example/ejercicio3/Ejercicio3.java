package org.example.ejercicio3;

interface Vehiculo {
    void arrancarMotor();
    void pararMotor();
    void acelerar();
    void frenar();

}

class Auto implements Vehiculo {
    public void arrancarMotor() {
        // código para arrancar el motor
    }

    public void pararMotor() {
        // código para parar el motor
    }

    public void acelerar() {
        // código para acelerar el coche
    }

    public void frenar() {
        // código para aplicar los frenos
    }

}

class Bicicleta implements Vehiculo {
    public void arrancarMotor() {
        // lanzar una excepción, ya que las bicicletas no tienen motor
    }

    public void pararMotor() {
        // lanzar una excepción, ya que las bicicletas no tienen motor
    }

    public void acelerar() {
        // código para acelerar la bicicleta
    }

    public void frenar() {
        // código para aplicar los frenos
    }

}

public class Ejercicio3 {
    public static void main(String[] args){

    }
}
