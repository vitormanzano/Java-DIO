package Metodos;

public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.volume);
        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);

        smartTv.ligar();

        System.out.println(smartTv.ligada);

        smartTv.desligar();

        System.out.println(smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println(smartTv.volume);

        smartTv.diminuirVolume();

        System.out.println(smartTv.volume);

        smartTv.aumentarCanal();

        System.out.println(smartTv.canal);

        smartTv.diminuirCanal();

        System.out.println(smartTv.canal);

        smartTv.mudarCanal(24);

        System.out.println(smartTv.canal);
    }
}
