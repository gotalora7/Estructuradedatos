public class MainSoporte {
    public static void main(String[] args) {
        CentroAtencion soporte = new CentroAtencion();

        System.out.println("Apertura del Sistema de Tickets");
        
        soporte.registrarCliente("Cliente A (Problema de Internet)");
        soporte.registrarCliente("Cliente B (Falla de Software)");
        soporte.registrarCliente("Cliente C (Duda de Facturación)");

        System.out.println();
        soporte.verSiguiente();

        System.out.println();
        soporte.atenderCliente();
        soporte.atenderCliente();
        
        System.out.println("Estado después de atender");
        soporte.verSiguiente();
        
        soporte.atenderCliente();
        soporte.atenderCliente();
    }
}