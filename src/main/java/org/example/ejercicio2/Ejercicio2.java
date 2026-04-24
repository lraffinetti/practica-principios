package org.example.ejercicio2;

class Usuario {
    private String nombre;
    private String email;
    private BaseDeDatos db;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.db = new BaseDeDatos();
    }

    public void presentarseConElEquipo() {
        System.out.println("Mi nombre es: " + nombre);
    }

    public void guardar() {
        this.db.guardar(this);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail()  {
        return email;
    }
}


class BaseDeDatos {

    public void guardar(Usuario usuario) {
    }
}


public class Ejercicio2 {
    public static void main(String[] args){

    }
}
