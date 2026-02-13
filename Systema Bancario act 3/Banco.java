import java.util.Vector;
import java.util.ArrayList;

public class Banco {
    Vector<String> listaLogs = new Vector<>();

    public void agregarMensajes() {
        listaLogs.add("Transacción 1: +$500");
        listaLogs.add("Transacción 2: -$200");
        listaLogs.add("Transacción 3: Transferencia");
        listaLogs.add("Transacción 4: Pago Luz");
        listaLogs.add("Transacción 5: Auditoría");

        System.out.println("LISTA DE TRANSACCIONES");
        for (String item : listaLogs) {
            System.out.println(item);
        }
    }

    public void probarVelocidad() {
        int cantidad = 1000000;

        long inicio1 = System.currentTimeMillis();
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < cantidad; i++) { v.add(i); }
        long final1 = System.currentTimeMillis();

        long inicio2 = System.currentTimeMillis();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) { al.add(i); }
        long final2 = System.currentTimeMillis();

        System.out.println("RESULTADOS");
        System.out.println("Vector tardó: " + (final1 - inicio1) + " ms");
        System.out.println("ArrayList tardó: " + (final2 - inicio2) + " ms");
    }
}