
import java.util.*;

public class Ej1_L2 {
    public static void main(String[] args) {
        List<String> CiudadesFavoritas = new ArrayList<>();
        int i = 1;
        System.out.println("Porfavor ingrese 'si', si desea ingresar sus ciudades favoritas en orden");
        Scanner scan = new Scanner(System.in);
        String respuesta = scan.nextLine();
        while (respuesta.equals("si")) {
            System.out.println("Ingrese una de sus ciudades favoritas");
            CiudadesFavoritas.add(scan.nextLine());
            System.out.println("Escriba si en caso de querer agregar otra ciudad, escriba no en caso");
            respuesta = scan.nextLine();
        }
        scan.close();
        for (String string : CiudadesFavoritas) {
            System.out.println("#" + i + " - " + string);
            i = i + 1;
        }
    }

}
