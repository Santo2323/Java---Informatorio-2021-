package Complementarios_Level1;

import java.util.*;

public class Ej3_L1 {
    public static void main(String[] args) {
        System.out.println("Ingrese el numero que desea convertir en incrementos de 1");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        for (int i = 1; i < (numero + 1); i++) {

            for (int j = 1; j < (i + 1); j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
