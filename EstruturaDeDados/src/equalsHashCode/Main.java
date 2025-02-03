package equalsHashCode;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<Carro>();

        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Audi"));
        listaCarros.add(new Carro("BMW"));

        System.out.println(listaCarros.contains(new Carro("Audi")));
        System.out.println(new Carro("Ford").hashCode());
        System.out.println(new Carro("Ford").hashCode());
    }
}
