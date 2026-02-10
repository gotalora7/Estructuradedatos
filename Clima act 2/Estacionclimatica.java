public class Estacionclimatica {
    
     private double[] temperaturas = new double[24];

    public Estacionclimatica() {
        for (int i = 0;i temperaturas.length;i++){
            temperaturas[i] = Math.random()*40;

        }
    } 
    public void mostrartemperaturamediodia() {
        System.out.println("temperatura medio dia" + temperaturas[12]+ "°c");
    }
    public void mostrartemperaturainvalidada() {
        try {
            temperaturas[24] = Math.random()*40;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error no se puede vertemperatura en 24 horas");
            System.out.println("java solo tiene memoria fija");

    }


    
}