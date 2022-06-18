import java.util.List;

public class Ejercicio3_L3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        Long filtradoDePalabras = palabras.stream()
                .filter(p -> p.toUpperCase().startsWith("B"))
                .count();
        System.out.println(filtradoDePalabras);
    }
}
