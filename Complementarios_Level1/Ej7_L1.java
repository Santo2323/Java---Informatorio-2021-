package Complementarios_Level1;

import java.util.*;

public class Ej7_L1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la palabra que desea convertir a mayusculas");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        scan.close();
        String palabra_mayus = "";
        char ch = ' ';
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) >= 'a' && palabra.charAt(i) <= 'z') {
                ch = (char) (palabra.charAt(i) - 32);
            } else {
                ch = (char) (palabra.charAt(i));
            }
            palabra_mayus += ch;
        }
        System.out.println(palabra_mayus);
    }
}