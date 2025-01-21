package ControleDeFLuxo.Condicionais;

public class IfElse {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }
        System.out.println("Saldo atual: " + saldo);

        int nota = 6;

        if (nota >= 7) {
            System.out.println("Aprovado");
        }
        else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

    }
}
