import java.util.*;

public class Ej4_L2 {
    public static void main(String[] args) {
        List<String> alumnosList = new ArrayList<>();
        alumnosList.add("Juan");
        alumnosList.add("Roberto");
        alumnosList.add("Domingo");
        alumnosList.add("Jose");
        alumnosList.add("Julian");
        alumnosList.add("Luciano");
        alumnosList.add("Santi");
        alumnosList.add("Tiago");
        alumnosList.add("Lautaro");
        alumnosList.add("Emanuel");
        alumnosList.add("Maximiliano");
        alumnosList.add("Miguel");
        List<String> curso1 = alumnosList.subList(0, 4);
        List<String> curso2 = alumnosList.subList(4, 8);
        List<String> curso3 = alumnosList.subList(8, 12);
        System.out.println("Los integrantes del curso 1 son " + curso1);
        System.out.println("Los integrantes del curso 2 son " + curso2);
        System.out.println("Los integrantes del curso 3 son " + curso3);
    }

}
