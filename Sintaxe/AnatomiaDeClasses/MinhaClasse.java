package Sintaxe.AnatomiaDeClasses;

public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Vitor";
        String SegundoNome = "Manzano";

        String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
