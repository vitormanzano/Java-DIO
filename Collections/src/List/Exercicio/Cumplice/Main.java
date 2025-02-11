package List.Exercicio.Cumplice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> respostas = new ArrayList<>();

        System.out.println("Telefonou para a vítima?: ");
        respostas.add(sc.nextLine());

        System.out.println("Esteve no local do crime?: ");
        respostas.add(sc.nextLine());

        System.out.println("Mora perto da vítima?: ");
        respostas.add(sc.nextLine());

        System.out.println("Devia para a vítima?: ");
        respostas.add(sc.nextLine());

        System.out.println("Já trabalhou com a vítima?: ");
        respostas.add(sc.nextLine());

        String response = "s";
        int contador = Collections.frequency(respostas, response);

        switch (contador) {
            case 1:
                System.out.println("Inocente!");
                break;
            case 2:
                System.out.println("Suspeita");
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5: System.out.println("Assasina");
        }
    }
}
