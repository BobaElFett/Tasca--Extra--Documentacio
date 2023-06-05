import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculMentalTest {


    // en test separados

    @org.junit.jupiter.api.Test
    void calcula1() {
        CalculMental calculMental = new CalculMental("15 + 8 − 7 + 10 − 3");
        List resultados = calculMental.calcula();
        assertEquals(23, resultados.get(resultados.size() - 1));
    }

    @org.junit.jupiter.api.Test
    void calcula2() {
        CalculMental calculMental = new CalculMental("0 + 8 - 7 + 10 - 3");
        List<Integer> resultados = calculMental.calcula();
        assertEquals(8, resultados.get(resultados.size() - 1));
    }

    @org.junit.jupiter.api.Test
    void calcula3() {
        CalculMental calculMental = new CalculMental("0 + 8 - 2 + 0 - 3");
        List<Integer> resultados = calculMental.calcula();
        assertEquals(3, resultados.get(resultados.size() - 1));
    }

}