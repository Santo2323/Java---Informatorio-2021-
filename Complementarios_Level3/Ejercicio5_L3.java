import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio5_L3 {
    private static int calcularEdad(LocalDate fechaDeNacimiento) {
        LocalDate now = LocalDate.now();
        int edad = Period.between(fechaDeNacimiento, now).getYears();
        return edad;
    }

    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Homero", "Simpson", LocalDate.parse("1992-06-17")),
                new Alumno("Julian", "Sotelo", LocalDate.parse("2002-07-17")),
                new Alumno("Juan Cruz", "Sosa", LocalDate.parse("2004-05-29")),
                new Alumno("Luciano", "Ertle", LocalDate.parse("2002-02-19")),
                new Alumno("Lionel Alejandro", "Cuccitini", LocalDate.parse("1987-09-05")));
        Map<String, Integer> alumnosFiltradoPorEdad = alumnos.stream().collect(
                Collectors.toMap(p -> p.getApellido().concat(" ").concat(p.getNombre()),
                        p -> calcularEdad(p.getFechaDeNacimiento())));
        System.out.println(alumnosFiltradoPorEdad);
    }
}
