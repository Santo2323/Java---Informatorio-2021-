import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1_L3 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");
        List<String> filtradoDePalabras = palabras.stream()
                .filter(p -> p != null)
                .filter(p -> !p.isEmpty())
                .collect(Collectors.toList());
        System.out.println(filtradoDePalabras);
    }
}
