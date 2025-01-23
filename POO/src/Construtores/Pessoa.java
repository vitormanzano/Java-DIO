package Construtores;

public class Pessoa {
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa (String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public static void main(String[] args) {
        Pessoa Vitor = new Pessoa("1234", "Vitor");

        System.out.format("Meu nome é %s e meu cpf é %s", Vitor.nome, Vitor.cpf);
    }
}
