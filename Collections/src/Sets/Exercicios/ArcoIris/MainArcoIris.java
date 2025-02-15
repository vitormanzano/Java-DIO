package Sets.Exercicios.ArcoIris;

import java.util.*;

public class MainArcoIris {
    public static void main(String[] args) {
        Set<String> arcoIrisSet = new HashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        for (String cor : arcoIrisSet) {
            System.out.println(cor); //A
        }

        int tamanhoArcoIris = arcoIrisSet.size();

        System.out.format("No arco iris tem %d cores\n", tamanhoArcoIris); //B

        Set<String> ArcoIrisOrdenado = new TreeSet<>(arcoIrisSet);

        System.out.println(ArcoIrisOrdenado); //C

        Set<String> ArcoIrisOrdemInformado = new LinkedHashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        System.out.println(ArcoIrisOrdemInformado); //D

        for (String cor : arcoIrisSet) {
            if (cor.startsWith("V")) {
                System.out.println(cor); //E
            }
        }

        Set<String> arcoIrisSetView = new HashSet<>(){{
            add("Vermelho");
            add("Laranja");
            add("Amarelo");
            add("Verde");
            add("Azul");
            add("Anil");
            add("Violeta");
        }};

        Iterator<String> iterator = arcoIrisSetView.iterator();

        while (iterator.hasNext()) {
            if (iterator.next().startsWith("V")) {
                iterator.remove();
            }
        }

        System.out.println(arcoIrisSetView); //F

        arcoIrisSetView.clear(); //G

        System.out.println("O Conjunto está vazio?: " + arcoIrisSetView.isEmpty()); //H

    }
}

