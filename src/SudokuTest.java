import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SudokuTest {

    @Test
    public void testSudokuCorrecteFacil() {
        int[][] graella = {
                {5, 6, 3, 7, 8, 1, 4, 9, 2},
                {8, 9, 2, 3, 5, 4, 6, 1, 7},
                {4, 7, 1, 6, 2, 9, 5, 8, 3},
                {9, 4, 7, 2, 6, 3, 1, 5, 8},
                {2, 5, 6, 1, 4, 8, 3, 7, 9},
                {3, 1, 8, 5, 9, 7, 2, 6, 4},
                {6, 8, 9, 4, 1, 2, 7, 3, 5},
                {7, 2, 5, 9, 3, 6, 8, 4, 1},
                {1, 3, 4, 8, 7, 5, 9, 2, 6}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertTrue(sudoku.esCorrecte());
    }

    @Test
    public void testSudokuInCorrecteFacil() {
        int[][] graella = {
                {5, 6, 3, 7, 8, 2, 4, 9, 2},
                {8, 9, 2, 3, 5, 4, 6, 1, 7},
                {4, 7, 1, 6, 2, 9, 5, 8, 3},
                {9, 4, 7, 2, 6, 3, 1, 5, 8},
                {2, 5, 6, 1, 4, 8, 3, 7, 9},
                {3, 1, 8, 4, 9, 7, 2, 6, 4},
                {6, 8, 9, 4, 1, 2, 7, 3, 5},
                {7, 2, 5, 9, 3, 6, 8, 4, 1},
                {1, 3, 4, 9, 7, 5, 9, 2, 6}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertFalse(sudoku.esCorrecte());
    }

    @Test
    public void testSudokuCorrecteNormal() {
        int[][] graella = {
                {7, 9, 2, 6, 1, 5, 3, 8, 4},
                {5, 8, 3, 7, 4, 2, 6, 9, 1},
                {1, 6, 4, 3, 9, 8, 5, 2, 7},
                {9, 4, 8, 2, 6, 3, 7, 1, 5},
                {2, 7, 5, 4, 8, 1, 9, 6, 3},
                {6, 3, 1, 9, 5, 7, 2, 4, 8},
                {8, 5, 7, 1, 2, 9, 4, 3, 6},
                {3, 2, 6, 8, 7, 4, 1, 5, 9},
                {4, 1, 9, 5, 3, 6, 8, 7, 2}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertTrue(sudoku.esCorrecte());
    }

    @Test
    public void testSudokuInCorrecteNormal() {
        int[][] graella = {
                {7, 9, 2, 6, 1, 5, 3, 8, 4},
                {5, 8, 3, 7, 4, 2, 6, 9, 1},
                {1, 6, 4, 3, 9, 8, 5, 2, 7},
                {5, 4, 8, 2, 6, 3, 7, 1, 5},
                {2, 7, 5, 4, 8, 1, 9, 6, 4  },
                {6, 3, 1, 9, 5, 7, 2, 4, 8},
                {8, 5, 7, 3, 2, 9, 4, 3, 6},
                {3, 2, 6, 8, 7, 4, 1, 5, 9},
                {2, 1, 9, 5, 3, 6, 8, 7, 2}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertFalse(sudoku.esCorrecte());
    }

    @Test
    public void testSudokuCorrecteDificil() {
        int[][] graella = {
                {9, 8, 4, 5, 7, 6, 2, 1, 3},
                {5, 1, 3, 4, 8, 2, 9, 6, 7},
                {7, 2, 6, 1, 3, 9, 5, 4, 8},
                {6, 3, 1, 9, 4, 7, 8, 5, 2},
                {4, 9, 5, 2, 6, 8, 3, 7, 1},
                {8, 7, 2, 3, 5, 1, 6, 9, 4},
                {2, 5, 7, 6, 1, 3, 4, 8, 9},
                {3, 6, 8, 7, 9, 4, 1, 2, 5},
                {1, 4, 9, 8, 2, 5, 7, 3, 6}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertTrue(sudoku.esCorrecte());
    }

    @Test
    public void testSudokuInCorrecteDificil() {
        int[][] graella = {
                {1, 8, 4, 5, 7, 6, 2, 1, 3},
                {5, 1, 3, 4, 8, 2, 9, 6, 7},
                {7, 2, 6, 1, 3, 9, 5, 4, 8},
                {6, 3, 1, 9, 4, 7, 8, 5, 2},
                {4, 9, 5, 2, 6, 8, 3, 7, 1},
                {2, 7, 2, 3, 5, 1, 6, 9, 4},
                {2, 5, 7, 6, 1, 3, 4, 1, 9},
                {3, 6, 8, 7, 9, 4, 1, 2, 5},
                {2, 4, 9, 8, 2, 5, 7, 3, 6}
        };
        Sudoku sudoku = new Sudoku(graella);
        assertFalse(sudoku.esCorrecte());
    }
}
