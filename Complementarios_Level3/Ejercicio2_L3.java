import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio2_L3 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 3, 4, 5);
        List<Integer> filtradoDePalabras = palabras.stream()
                .map(p -> (int) Math.pow(p, 2))
                .collect(Collectors.toList());
        System.out.println(filtradoDePalabras);
    }

}
