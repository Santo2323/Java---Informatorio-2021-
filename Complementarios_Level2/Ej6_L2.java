import java.util.*;

public class Ej6_L2 {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Santiago Beron", "43932162", 7, 800);
        Empleado empleado2 = new Empleado("Lautaro Cardozo", "43697754", 10, 700);
        Empleado empleado3 = new Empleado("Lautaro Cardozo", "44331750", 6, 750);
        int sueldo = 0;
        Set<Empleado> HashSetDeEmpleados = new HashSet<Empleado>();
        HashSetDeEmpleados.add(empleado1);
        HashSetDeEmpleados.add(empleado2);
        HashSetDeEmpleados.add(empleado3);

        for (Empleado empleados : HashSetDeEmpleados) {
            sueldo = (empleados.getValorPorHora() * empleados.getHorasTrabajadas());
            Map<String, Integer> mapaDniSueldo = new HashMap<>();
            mapaDniSueldo.put(empleados.getDni(), sueldo);
            System.out.println(empleados);
            System.out.println(mapaDniSueldo);
        }

    }

}
