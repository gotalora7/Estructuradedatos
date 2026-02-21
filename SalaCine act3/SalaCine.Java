public class SalaCine {
    private int[][] sala = new int[8][10];

    public void inicializar() {
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
                System.out.println("Éxito: Asiento [" + fila + "][" + col + "] reservado.");
            } else {
                System.out.println("Error: El asiento ya está ocupado.");
            }
        } else {
            System.out.println("Error: Coordenadas fuera de rango (Fila 0-7, Col 0-9).");
        }
    }

    public void buscarParejaEnFila(int fila) {
        boolean encontrado = false;
        for (int j = 0; j < 9; j++) {
            if (sala[fila][j] == 0 && sala[fila][j + 1] == 0) {
                System.out.println("Sugerencia en Fila " + fila + ": Columnas " + j + " y " + (j + 1) + " están libres.");
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("No hay dos asientos contiguos en la fila " + fila);
        }
    }

    public void mostrarMapa() {
        System.out.println("MAPA ACTUAL DE LA SALA");
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(sala[i][j] + " ");
            }
            System.out.println();
        }
    }
}