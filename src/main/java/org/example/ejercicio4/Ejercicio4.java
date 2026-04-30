package org.example.ejercicio4;
import java.util.ArrayList;
import java.util.List;

class Jugador {
    String nombre;
    String posicion;

    public Jugador(String nombre, String posicion){
        this.nombre = nombre;
        this.posicion = posicion;
    }

    public int getSueldo(){

        if (posicion == "Delantero"){
            return 100000;
        }else if(posicion == "MedioCampista"){
            return 70000;
        }else if(posicion == "Defensor"){
            return 50000;
        }else if(posicion == "Arquero"){
            return 30000;
        }else{
            throw new RuntimeException("Posicion no encontrada.");
        }
        
    }
}
class FCBarcelona {
    List<Jugador> jugadores;

    public FCBarcelona(){
        jugadores = new ArrayList<>();
    }

    public void sueldosJugadores(){
        for(Jugador jugador : jugadores){
            System.out.println(jugador.getSueldo());
        }
    }

}

public class Ejercicio4 {
    public static void main(String[] args){
        FCBarcelona equipo = new FCBarcelona();

        equipo.jugadores.add(new Jugador("Lewandowski", "Delantero"));
        equipo.jugadores.add(new Jugador("Pedri", "MedioCampista"));
        equipo.jugadores.add(new Jugador("Gavi", "MedioCampista"));
        equipo.jugadores.add(new Jugador("Araujo", "Defensor"));
        equipo.jugadores.add(new Jugador("Kounde", "Defensor"));
        equipo.jugadores.add(new Jugador("Ter Stegen", "Arquero"));

        equipo.sueldosJugadores();
    }
}
