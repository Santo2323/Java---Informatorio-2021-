import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ejercicio4_L3 {
    static long calcularFactorial(int n) {
        return LongStream.rangeClosed(1, n).reduce(1, (long num1, long num2) -> num1 * num2);
    }

    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Long> filtradoDePalabras = palabras.stream()
                .distinct()
                .map(p -> (Long) calcularFactorial(p))
                .collect(Collectors.toList());
        System.out.println(filtradoDePalabras);
    }
}
