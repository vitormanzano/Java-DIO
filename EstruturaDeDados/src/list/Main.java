package list;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<Carro>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Audi"));
        listCarros.add(new Carro("BMW"));
        listCarros.add(new Carro("Honda"));

        System.out.println(listCarros.contains(new Carro("Audi")));

        System.out.println(listCarros.get(2));

        System.out.println(listCarros.indexOf(new Carro("Audi")));

        System.out.println(listCarros.remove(2));

        System.out.println(listCarros);
    }
}
