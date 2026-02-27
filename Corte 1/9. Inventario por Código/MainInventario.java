public class MainInventario {
    public static void main(String[] args) {
        Almacen miAlmacen = new Almacen();

        miAlmacen.registrarProducto("A001", "Laptop Dell");
        miAlmacen.registrarProducto("B002", "Monitor Samsung");

        System.out.println("Probando actualización de clave");
        miAlmacen.registrarProducto("A001", "Laptop HP"); 

        miAlmacen.buscarPorCodigo("A001");

        miAlmacen.buscarPorCodigo("Z999");

        miAlmacen.mostrarTodo();
    }
}