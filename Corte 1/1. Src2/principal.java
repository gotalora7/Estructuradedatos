class principal {
    public static void main(String[] args) {
        cancion inscancion = new cancion("Hasta la madre", "Jeison Jimenez", 349);
        System.out.println("Titulo: " + inscancion.getTitulo());
        System.out.println("Artista: " + inscancion.getArtista());
        System.out.println("Duracion: " + inscancion.getDuracion() + " segundos");

    }
}