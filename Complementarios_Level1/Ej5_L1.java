package Complementarios_Level1;

import java.util.*;

public class Ej5_L1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese 2 numeros para realizar la multiplicacion por medio de sumas excesivas");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int resultado = 0;
        for (int i = 0; i < num1; i++) {
            resultado = (resultado + num2);
        }
        System.out.println(num1 + " x " + num2 + " = " + resultado);
    }

}
