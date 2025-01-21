import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite O primeiro parâmetro: ");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }
        catch (ParametroInvalidosException e) {}
    }
    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidosException {
        if (parametroDois < parametroUm) {
            throw new ParametroInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
        for (int i =1; i <= contagem; i++) {
            System.out.println(i);
        }
    }
}