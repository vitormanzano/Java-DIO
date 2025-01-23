package Escola;

public class Aluno {
    private String nome;
    private int idade;

    public static void main(String[] args) {
        Aluno vitor = new Aluno();

        vitor.idade = 18;
        vitor.nome = "Vitor";

        System.out.format("Meu nome é %s e tenho %d anos\n", vitor.nome, vitor.idade);
    }
}
