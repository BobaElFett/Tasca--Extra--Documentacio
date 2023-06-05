import java.util.ArrayList;
import java.util.List;

/**
 * Classe CalculMental per a realitzar operacions aritmètiques
 */
public class CalculMental {

    private final String input;

    /**
     * Constructor de la classe
     * @param input La cadena d'entrada que conté les operacions a realitzar
     */
    public CalculMental(String input) {
        this.input = input;
    }

    /**
     * Mètode calcula
     * @return una llista amb els resultats de les operacions
     */
    public List<Integer> calcula() {
        List<Integer> results = new ArrayList<>();
        String[] parts = this.input.split(" ");
        int result = Integer.parseInt(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            if (parts[i].equals("+")) {
                result += Integer.parseInt(parts[i + 1]);
            } else {
                result -= Integer.parseInt(parts[i + 1]);
            }
            results.add(result);
        }

        return results;
    }

    /**
     * Método principal que muestra el uso de la clase CalculMental.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        String secuencia = "15 + 8 - 7 + 10 - 3";
        CalculMental calculMental = new CalculMental(secuencia);

        System.out.println(calculMental.calcula());
    }
}
