import java.util.Queue;
import java.util.LinkedList;

public class CentroAtencion {
    private Queue<String> clientes;
    
    public CentroAtencion() {
        clientes = new LinkedList<>();
    }
    
    public void registrarCliente(String nombre) {
        clientes.offer(nombre);
        System.out.println("Nuevo ticket: " + nombre + " se ha unido a la fila.");
    }

    public void verSiguiente() {
        String proximo = clientes.peek();
        if (proximo != null) {
            System.out.println("Próximo cliente en espera: " + proximo);
        } else {
            System.out.println("No hay nadie en la fila.");
        }
    }

    public void atenderCliente() {
        String clienteAtendido = clientes.poll();
        
        if (clienteAtendido != null) {
            System.out.println(">>> Atendiendo a: " + clienteAtendido);
        } else {
            System.out.println("Fila vacía. Todos los clientes han sido atendidos.");
        }
    }
}
    
