package org.example.ejercicio1;

class Ave {

    public void caminar() {
        System.out.println("Caminando...");
    }

    public void volar() {
        System.out.println("Volando...");
    }
}


class Pinguino extends Ave {
    @Override
    public void volar() {
        throw new RuntimeException("Los pingüinos no vuelan");
    }
}


public class Ejercicio1 {
    public static void main(String[] args){

    }
}
