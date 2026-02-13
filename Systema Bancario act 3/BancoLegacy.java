import java.util.Vector;
import java.util.ArrayList;

public class BancoLegacy {

    private Vector<String> logTransacciones = new Vector<>();

    public void ejecutarLogSimulado() {
        logTransacciones.add("Transacción 001: Depósito de $500");
        logTransacciones.add("Transacción 002: Retiro de $200");
        logTransacciones.add("Transacción 003: Transferencia interna");
        logTransacciones.add("Transacción 004: Pago de servicio");
        logTransacciones.add("Transacción 005: Auditoría mensual");

        System.out.println("--- Logs del Sistema Legacy ---");
        for (String log : logTransacciones) {
            System.out.println("[LOG]: " + log);
        }
    } 

    public void compararRendimiento() {
        int limite = 1_000_000;

        long inicioVector = System.currentTimeMillis();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < limite; i++) { v.add(i); }
        long finVector = System.currentTimeMillis();

        long inicioArrayList = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < limite; i++) { al.add(i); }
        long finArrayList = System.currentTimeMillis();

        System.out.println("\n--- Comparativa de Rendimiento (1 Millón de Inserciones) ---");
        System.out.println("Tiempo Vector (Synchronized): " + (finVector - inicioVector) + " ms");
        System.out.println("Tiempo ArrayList (No-Synchronized): " + (finArrayList - inicioArrayList) + " ms");
        System.out.println("Nota: ArrayList es más rápido porque no tiene el overhead de los locks.");
    }