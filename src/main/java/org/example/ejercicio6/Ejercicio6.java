package org.example.ejercicio6;

import java.util.List;

class Item {
    private String nombre;
    private int precio;

    public String getNombre(){
        return nombre;
    }
    public int getPrecio(){
        return precio;
    }
}

class CarritoDeCompras {
    private List<Item> items;

    public List<Item> getItems() {
        return items;
    }
}

class ServicioWeb {
    public void agregarAlCarrito(CarritoDeCompras carrito, Item item) {
        carrito.getItems().add(item);
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {

    }
}
