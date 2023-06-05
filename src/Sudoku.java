public class Sudoku {
    private int[][] graella;

    /**
     * Constructor que accepta una graella 9x9 amb nombres de l’1 al 9.
     *
     * @param graella La graella 9x9 a verificar.
     */
    public Sudoku(int[][] graella) {
        this.graella = graella;
    }

    /**
     * Verifica si el Sudoku és correcte.
     *
     * Un Sudoku és correcte si cada fila, columna i quadre 3x3 contenen els nombres de l'1 al 9 exactament una vegada.
     *
     * @return true si el Sudoku és correcte, false en cas contrari.
     */
    public boolean esCorrecte() {
        // Verifiquem cada fila, columna i quadre 3x3
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int num = graella[i][j];

                // Comprovem la fila
                for (int col = 0; col < 9; col++) {
                    if (col != j && graella[i][col] == num) {
                        return false;
                    }
                }

                // Comprovem la columna
                for (int fila = 0; fila < 9; fila++) {
                    if (fila != i && graella[fila][j] == num) {
                        return false;
                    }
                }

                // Comprovem el quadre 3x3
                for (int fila = (i / 3) * 3; fila < (i / 3) * 3 + 3; fila++) {
                    for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                        if ((fila != i || col != j) && graella[fila][col] == num) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}

