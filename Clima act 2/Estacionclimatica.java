public class Estacionclimatica {
    
    private double[] temperaturas;

    public Estacionclimatica() {
        this.temperaturas = new double[24];
    }

    public void simularDatos() {
        for (int i = 0; i < temperaturas.length; i++) {
            this.temperaturas[i] = Math.random() * 40;
        }
    }

    public double getTemperaturaHora(int hora) {
        return this.temperaturas[hora];
    }

    public void registrarHoraExtraordinaria() {
        try {
            this.temperaturas[24] = 35.0; 
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede registrar la hora 25.");
            System.out.println("Detalle técnico: Índice fuera de límites.");
        }
    }
}