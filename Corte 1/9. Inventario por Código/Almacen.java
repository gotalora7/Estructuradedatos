import java.util.HashMap;
import java.util.Map;

public class Almacen {
    private Map<String, String> inventario = new HashMap<>();

    public void registrarProducto(String sku, String nombre) {
        inventario.put(sku, nombre);
        System.out.println("Registrado: [" + sku + "] -> " + nombre);
    }

    public void buscarPorCodigo(String sku) {
        String producto = inventario.get(sku);
        
        System.out.println("Buscando SKU: " + sku);
        if (producto != null) {
            System.out.println("Resultado: " + producto);
        } else {
            System.out.println("Resultado: Producto no encontrado (null)");
        }
    }

    public void mostrarTodo() {
        System.out.println("INVENTARIO COMPLETO");
        System.out.println(inventario);
    }
}