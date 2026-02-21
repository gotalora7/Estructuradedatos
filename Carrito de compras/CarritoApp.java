import java.util.ArrayList;
import java.util.List;

// Clase principal
public class CarritoApp {
    public static void main(String[] args) {
        List<Producto> carrito = new ArrayList<>();

        Producto p1 = new Producto(101, "Laptop", 800.0);
        Producto p2 = new Producto(102, "Mouse", 20.0);
        Producto p3 = new Producto(101, "Laptop", 800.0);

        System.out.println("Agregando Productos");

        if (!carrito.contains(p1)) {
            carrito.add(p1);
            System.out.println("Agregado: " + p1);
        }

        if (!carrito.contains(p2)) {
            carrito.add(p2);
            System.out.println("Agregado: " + p2);
        }

        if (!carrito.contains(p3)) {
            carrito.add(p3);
        } else {
            System.out.println("No se agrego porque el ID 101 ya existe.");
        }

        System.out.println("Carrito Final");
        for (Producto p : carrito) {
            System.out.println("- " + p);
        }
    }
}

class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Producto p = (Producto) o;
        return id == p.id;
    }

    public String toString() {
        return nombre + " ($" + precio + ")";
    }
}