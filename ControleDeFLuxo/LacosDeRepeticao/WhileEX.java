package ControleDeFLuxo.LacosDeRepeticao;
import java.util.concurrent.ThreadLocalRandom;

public class WhileEX {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) {
                valorDoce = mesada;
            }
            System.out.println(valorDoce);
            mesada = mesada - valorDoce;
        }
        System.out.println(mesada);
    }

    private static Double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
