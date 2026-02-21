import java.util.Stack;
import java.util.EmptyStackException;

public class Navegador {
    private Stack<String> historial = new Stack<>();

    public void visitarPagina(String url) {
        historial.push(url);
        System.out.println("Navegando a: " + url);
    }

    public void verPaginaActual() {
        if (!historial.empty()) {
            System.out.println("URL actual (peek): " + historial.peek());
        }
    }

    public void botonAtras() {
        try {
            if (!historial.empty()) {
                String paginaRecuperada = historial.pop();
                System.out.println("Botón Atrás: Volviendo desde " + paginaRecuperada);
                
                if (!historial.empty()) {
                    System.out.println("Ahora estás en: " + historial.peek());
                } else {
                    System.out.println("Historial vacío. Estás en la página de inicio.");
                }
            } else {
                System.out.println("No hay más páginas en el historial.");
            }
        } catch (EmptyStackException e) {
            System.out.println("Error: La pila está vacía, no puedes retroceder.");
        }
    }
}