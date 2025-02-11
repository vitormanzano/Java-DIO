package List.Exercicio.Temperatura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<MesTemperatura> temperaturas = new ArrayList<MesTemperatura>();

        List<String> meses = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < meses.size(); i++) {
            System.out.format("Temperatura do mês %d: ", i + 1);
            double temperatura = scanner.nextDouble();
            temperaturas.add(new MesTemperatura(temperatura, meses.get(i)));
        }

        System.out.println("\nTemperaturas: " + temperaturas);
    }
}

