package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Carro> hashSetCarros = new HashSet();

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Audi"));
        hashSetCarros.add(new Carro("BMW"));
        hashSetCarros.add(new Carro("Honda"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros2 = new TreeSet<>();

        treeSetCarros2.add(new Carro("Ford"));
        treeSetCarros2.add(new Carro("Audi"));
        treeSetCarros2.add(new Carro("BMW"));
        treeSetCarros2.add(new Carro("Honda"));

        System.out.println(treeSetCarros2);
    }
}
