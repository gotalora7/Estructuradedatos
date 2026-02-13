public class Main {
    public static void main(String[] args) {
        Estacionclimatica estacion = new Estacionclimatica();

        estacion.simularDatos();

        System.out.println("REPORTE METEOROLÓGICO IOT");

        double mediodia = estacion.getTemperaturaHora(12);
        System.out.printf("Lectura puntual (12:00): %.2f°C%n", mediodia);

        estacion.registrarHoraExtraordinaria();
    }
}