public class MainHistorial {
    public static void main(String[] args) {
        Navegador miNav = Navegador new ();

        System.out.println("Iniciando Navegación");
        miNav.visitarPagina("google.com");
        miNav.visitarPagina("youtube.com");
        miNav.visitarPagina("github.com");

        System.out.println("Consultando Estado");
        miNav.verPaginaActual();

        System.out.println("Usando Botón Atrás");
        miNav.botonAtras();
        miNav.botonAtras();
        
        System.out.println("Vaciando la Pila");
        miNav.botonAtras();
        miNav.botonAtras();
    }
}