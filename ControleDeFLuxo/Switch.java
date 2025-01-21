package ControleDeFLuxo;

public class Switch {
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P": {
                System.out.println("P");
                break;
            }
            case "M": {
                System.out.println("M");
                break;
            }
            case "G": {
                System.out.println("G");
                break;
            }
            default: {
                System.out.println("Indefinido");
            }
        }
    }
}
