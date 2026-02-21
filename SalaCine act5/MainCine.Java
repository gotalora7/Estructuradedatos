public class MainCine {
    public static void main(String[] args) {
        SalaCine cine = new SalaCine();

        cine.inicializar();

        cine.reservarAsiento(0, 5);
        cine.reservarAsiento(3, 2);
        cine.reservarAsiento(3, 3);

        System.out.println("Buscando pareja en Fila 3:");
        cine.buscarParejaEnFila(3);

        System.out.println("Buscando pareja en Fila 0:");
        cine.buscarParejaEnFila(0);

        cine.mostrarMapa();
    }
}