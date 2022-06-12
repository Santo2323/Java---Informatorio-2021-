import java.util.*;

public class Ej2_L2 {
    public static void main(String[] args) {
        List<Integer> ListaEnteros = new ArrayList<>();
        ListaEnteros.add(1);
        ListaEnteros.add(2);
        ListaEnteros.add(3);
        ListaEnteros.add(4);
        ListaEnteros.add(5);
        for (Integer integer : ListaEnteros) {
            System.out.print(integer + " ");
        }
        System.out.println("El tamaño de la lista es " + ListaEnteros.size());
        ListaEnteros.add(0, 0);
        ListaEnteros.add(6);

        for (Integer integer : ListaEnteros) {
            System.out.print(integer + " ");
        }
        System.out.println("El tamaño de la lista es " + ListaEnteros.size());

    }
}