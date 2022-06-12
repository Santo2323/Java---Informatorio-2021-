package Complementarios_Level1;

import java.util.*;

public class Ej9_L1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la palabra, frase o texto que desee");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println("Por favor ingrese la letra que desea sea contada");
        char ch = scan.next().charAt(0);
        scan.close();
        int cont = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                cont = cont + 1;
            }
        }
        System.out.println("La cantidad de veces que aparece la letra en el texto es " + cont);
    }

}
