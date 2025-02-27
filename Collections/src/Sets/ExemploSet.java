package Sets;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5.0));

        System.out.println("Exiba a menor nota:  " + Collections.min(notas));

        System.out.println("Exiba a maior nota:  " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;

        while (iterator.hasNext()) {
            soma += iterator.next();
        }

        System.out.println("Exiba a soma dos valores: " + soma);

        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista");

        Iterator<Double> iterator2 = notas.iterator();

        while (iterator2.hasNext()) {
            if (iterator2.next() < 7d) {
                iterator2.remove();
            }
        }
        System.out.println(notas);

        Set<Double> notas2 = new LinkedHashSet<>();

        notas2.add(7d);
        notas2.add(8d);
        notas2.add(9d);
        notas2.add(5d);
        notas2.add(3.6);

        System.out.println(notas2);

        System.out.println("Exita todas as notas na ordem crescente: ");

        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        notas.clear();

        System.out.println("Está vazio?: " + notas.isEmpty());
    }
}
