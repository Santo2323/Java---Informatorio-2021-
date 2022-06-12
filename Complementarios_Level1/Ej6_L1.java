package Complementarios_Level1;

import java.util.*;

public class Ej6_L1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese la base de la potencia");
        Scanner scan = new Scanner(System.in);
        int base = scan.nextInt();
        System.out.println("Por favor ingrese la potencia");
        int potencia = scan.nextInt();
        scan.close();
        int resultado = 1;
        for (int i = 0; i < potencia; i++) {
            resultado = (resultado * base);
        }
        System.out.println(base + " elevado a " + potencia + " = " + resultado);
    }
}
