package List;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(9.0);
        notas.add(3.6);

//        System.out.println(notas);
//
//        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5.0));
//
//        System.out.println("Adiciona na lista a nota 8.0 na posição 4: ");
//        notas.add(4, 8d);
//        System.out.println(notas);
//
//        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
//        notas.set(notas.indexOf(5d), 6.0);
//        System.out.println(notas);
//
//        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d));
//
//        System.out.println("Exiba a menor nota: " + Collections.min(notas));
//
//        System.out.println("Exiba a maior nota: " + Collections.max(notas));
//
//        Iterator<Double> iterator = notas.iterator();
//
//        Double soma = 0d;
//        while (iterator.hasNext()) {
//            Double next = iterator.next();
//            soma+=next;
//        }
//
//        System.out.println("Exiba a soma dos valores: " + soma);
//
//        System.out.println("Exiba a média das notas: " + (soma/notas.size()));
//
//        //notas.remove(0d) remove a nota 0
//
//        //notas.remove(0) remove a nota na posição 0
//
//        System.out.println("Remove as notas menores que 7 e exiba a lista: ");
//        Iterator<Double> iterator1 = notas.iterator();
//        while (iterator1.hasNext()) {
//            Double next = iterator1.next();
//            if (next < 7) {
//                iterator1.remove();
//            }
//        }
//        System.out.println(notas);
//
//        System.out.println("Apague toda a lista!");
//        notas.clear();
//
//        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

        List<Double> notas2 = new LinkedList<Double>();
        notas2.addAll(notas);

        System.out.println(notas2);

        System.out.println(notas2.getFirst());

        System.out.println(notas2.removeFirst());

        System.out.println(notas2);

    }
}
