public class GestionCine {
    private int[][] sala = new int[8][10];
 
    public void inicializarSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                sala[i][j] = 0;
            }
        }
    }

    public void reservarAsiento(int fila, int col) {
        if (fila >= 0 && fila < 8 && col >= 0 && col < 10) {
            if (sala[fila][col] == 0) {
                sala[fila][col] = 1;
                System.out.println("Asiento [" + fila + "," + col + "] reservado con éxito.");
            } else {
                System.out.println("El asiento [" + fila + "," + col + "] ya está ocupado.");
            }
        } else {
            System.out.println("Error: Coordenadas fuera de la sala.");
        }
    }
    
}
