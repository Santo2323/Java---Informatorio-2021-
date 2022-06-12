import java.util.*;

public class Ej7_L2 {

    public static List<String> FizzBuzzFuncion(int int1, int int2) {
        ArrayList<String> Buzz = new ArrayList<String>();
        for (int i = int1; i < int2; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0) {
                    Buzz.add("FizzBuzz");
                } else {
                    Buzz.add("Fizz");
                }
                continue;
            }
            if (i % 3 == 0) {
                Buzz.add("Buzz");
                continue;
            } else {
                String iconvert = Integer.toString(i);
                Buzz.add(iconvert);
                continue;
            }
        }
        return (Buzz);

    }

    public static void main(String[] args) {
        List<String> Buzz1 = new ArrayList<>();
        List<String> Buzz2 = new ArrayList<>();
        Buzz1 = FizzBuzzFuncion(1, 6);
        System.out.println(Buzz1);
        Buzz2 = FizzBuzzFuncion(1, 8);
        System.out.println(Buzz2);
    }

}
