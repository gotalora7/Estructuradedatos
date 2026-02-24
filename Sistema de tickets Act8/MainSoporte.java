public class MainSoporte {
    public static void main(String[] args) {
        CentroAtencion soporte = new CentroAtencion();

        System.out.println("Apertura del Sistema de Tickets");
        
        // Paso 2: Llegan clientes
        soporte.registrarCliente("Cliente A (Problema de Internet)");
        soporte.registrarCliente("Cliente B (Falla de Software)");
        soporte.registrarCliente("Cliente C (Duda de Facturación)");

        // Paso 3: Consultamos quién es el primero
        System.out.println();
        soporte.verSiguiente();

        // Paso 4: Atendemos a los clientes en orden FIFO
        System.out.println();
        soporte.atenderCliente(); // Atiende al A
        soporte.atenderCliente(); // Atiende al B
        
        System.out.println("\n--- Estado después de atender ---");
        soporte.verSiguiente(); // Ahora el siguiente es el C
        
        soporte.atenderCliente(); // Atiende al C
        soporte.atenderCliente(); // Intenta atender con fila vacía (usa .poll)
    }
}