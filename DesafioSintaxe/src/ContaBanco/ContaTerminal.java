package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente;
    float saldo;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ContaTerminal conta = new ContaTerminal();



        System.out.println("Digite o número da conta: ");
        conta.numero = entrada.nextInt();

        System.out.println("Digite a agencia: ");
        conta.agencia = entrada.next();

        System.out.println("Digite o nome do cliente: ");
        conta.nomeCliente = entrada.next();

        System.out.println("Digite o saldo: ");
        conta.saldo = entrada.nextFloat();

        System.out.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", conta.nomeCliente, conta.agencia, conta.numero, conta.saldo);





    }
}