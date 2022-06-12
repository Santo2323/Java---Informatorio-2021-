import java.util.*;

public class Ej3_l2 {
    public static void main(String[] args) {
        List<Integer> BarajaFrancesa = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            BarajaFrancesa.add(i);
        }
        for (Integer integer : BarajaFrancesa) {
            System.out.print(integer + " ");
        }
        System.out.println(" ");
        Collections.reverse(BarajaFrancesa);
        for (Integer integer : BarajaFrancesa) {
            System.out.print(integer + " ");
        }
        Collections.shuffle(BarajaFrancesa);
        System.out.println("");
        for (Integer integer : BarajaFrancesa) {
            System.out.print(integer + " ");
        }
    }
}
