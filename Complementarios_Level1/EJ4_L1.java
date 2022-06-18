package Complementarios_Level1;

import java.util.*;

public class EJ4_L1 {

    public static void main(String[] args) {
        System.out.println("Por favor ingrese el numero del cual desea su factorial");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        scan.close();
        int factorial = 1;
        for (int i = numero; i > 0; i--) {
            factorial = i * factorial;
        }
        System.out.println("El resultado factorial es " + factorial);
    }

}
