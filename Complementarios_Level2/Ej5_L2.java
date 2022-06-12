import java.util.*;

public class Ej5_L2 {
    public static void main(String[] args) {
        int total_final = 0;
        List<Integer> HorasTrabajadasSemana = new ArrayList<>();
        HorasTrabajadasSemana.add(6);
        HorasTrabajadasSemana.add(7);
        HorasTrabajadasSemana.add(8);
        HorasTrabajadasSemana.add(4);
        HorasTrabajadasSemana.add(5);
        List<Integer> ValorPorHora = new ArrayList<>();
        ValorPorHora.add(350);
        ValorPorHora.add(345);
        ValorPorHora.add(550);
        ValorPorHora.add(600);
        ValorPorHora.add(320);

        List<Integer> ListaTotalesPorSemana = new ArrayList<>();

        for (int i = 0; i < HorasTrabajadasSemana.size() && i < ValorPorHora.size(); i++) {
            ListaTotalesPorSemana.add(HorasTrabajadasSemana.get(i) * ValorPorHora.get(i));
            total_final = total_final + (HorasTrabajadasSemana.get(i) * ValorPorHora.get(i));
        }
        System.out.println(ListaTotalesPorSemana);
        System.out.println("Total Final: $ " + total_final);
    }
}
