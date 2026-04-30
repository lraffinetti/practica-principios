package org.example.ejercicio1;
import java.util.ArrayList;
import java.util.List;

abstract class Ave {

    public void caminar() {
        System.out.println("Caminando...");
    }

    public void volar() {
        System.out.println("Volando...");
    }
}

class Pajaro extends Ave {

}



class Pinguino extends Ave {
    @Override
    public void volar() {
        throw new RuntimeException("Los pingüinos no vuelan");
    }
}


public class Ejercicio1 {
    public static void main(String[] args){
        List<Ave> aves = new ArrayList<>();
        aves.add(new Pinguino());
        aves.add(new Pajaro());

        for (Ave ave: aves){
            ave.caminar();
        }

        /*
        for (Ave ave: aves){
            ave.volar();
        }
        */
        
        
    }
}
