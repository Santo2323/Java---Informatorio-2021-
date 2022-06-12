package Complementarios_Level1;

import java.util.*;

public class Ej1_L1 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese su nombre de usuario");
        Scanner scan = new Scanner(System.in);
        String username = scan.nextLine();
        scan.close();
        System.out.println("HOLA " + username + "!!!");
    };

}
