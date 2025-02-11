package List.OrderCat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenacaoList {
    public static void main(String[] args) {
        List<Gato> meusGatos = new ArrayList<Gato>(){{
            add(new Gato("Jon", 18, "Preto"));
            add(new Gato("Jane", 17, "Tigrado"));
            add(new Gato("Jon", 18, "Amarelo"));
        }};

        System.out.println(meusGatos); //Ordem de inserção

        Collections.shuffle(meusGatos);

        System.out.println(meusGatos);

        Collections.sort(meusGatos); //Usamos o collections pq o sort nele precisa ter um comparable

        System.out.println(meusGatos);

        Collections.sort(meusGatos, new ComparatorIdade());

        System.out.println(meusGatos);

        Collections.sort(meusGatos, new ComparatorCor());

        System.out.println(meusGatos);

        meusGatos.sort(new ComparatorIdade());

        System.out.println(meusGatos);
    }
}

class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade,  String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Cor: " + cor;
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<Gato> {

    @Override
    public int compare(Gato o1, Gato o2) {
        return Integer.compare(o1.getIdade(), o2.getIdade());
    }
}

class ComparatorCor implements Comparator<Gato> {
    @Override
    public int compare(Gato o1, Gato o2) {
        return o1.getCor().compareToIgnoreCase(o2.getCor());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());

        if (nome != 0) {
            return nome;
        }

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());

        if (cor != 0) {
            return cor;
        }

        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}