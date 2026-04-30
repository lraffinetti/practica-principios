package org.example.ejercicio2;
import java.util.ArrayList;
import java.util.List;

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

    List<Usuario> usuarios;
    
    public BaseDeDatos(){
        usuarios = new ArrayList<>();
    }

    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }
}


public class Ejercicio2 {
    public static void main(String[] args){
        Usuario usuario = new Usuario("Lucas", "lucas@fi.uba.ar");

        usuario.guardar();
    }
}
