package Sintaxe.Operadores;

public class Logicos {
    public static void main(String[] args) {
        boolean condicao1 = true;;
        boolean condicao2 = false;

        if (condicao1 && ( 7 > 4)) {
            System.out.println("Condicao 1 and Condicao 2");
        }
        if (condicao1 || condicao2) {
            System.out.println("Condicao 1 or Condicao 2");
        }
    }
}
