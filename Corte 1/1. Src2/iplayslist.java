public interface iplayslist {
    void agregarCancion(cancion c);
    void eliminarCancion(cancion c);
    cancion reproducirSiguiente();
    void vaciarLista();
    void mostrarLista();
    int obtenerCantidadCanciones();
}