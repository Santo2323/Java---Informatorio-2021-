package Complementarios_Level1;

import java.util.*;

public class Ej8_L1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre y apellido");
        String NyA = scan.nextLine();
        System.out.println("Por favor ingrese Edad");
        String edad = scan.nextLine();
        System.out.println("Por favor ingrese su Direccion");
        String direccion = scan.nextLine();
        System.out.println("Por favor ingrese su ciudad");
        String ciudad = scan.nextLine();
        scan.close();
        System.out.println(ciudad + " - " + direccion + " - " + edad + " - " + NyA);
    }

}
