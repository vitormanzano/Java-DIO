package Sets.Exercicios.Linguagem;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<LinguagemFavorita> minhasLinguagensFavoritas = new HashSet<>();
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Python", 1991, "Pycharm"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("JavaScript", 1995, "IntelliJ"));
        minhasLinguagensFavoritas.add(new LinguagemFavorita("Java", 1991, "Visual Studio Code"));

        Set<LinguagemFavorita> minhasLinguagensOrdenadas = new LinkedHashSet<>(
                Arrays.asList(new LinguagemFavorita("Python", 1991, "Pycharm"),
                            new LinguagemFavorita("JavaScript", 1995, "IntelliJ"),
                            new LinguagemFavorita("Java", 1991, "Visual Studio Code")
                )
        );

        for (LinguagemFavorita linguagem : minhasLinguagensOrdenadas) {
            System.out.println(linguagem); //A
        }

        Set<LinguagemFavorita> minhasLinguagensOrdemNatural = new TreeSet<>(minhasLinguagensFavoritas);
        System.out.println(minhasLinguagensOrdemNatural); //B

        Set<LinguagemFavorita> minhasLinguagensFavoritas3 = new TreeSet<>(new ComparatorIde());
        minhasLinguagensFavoritas3.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas3) System.out.println(linguagem); //C

        System.out.println("--------\tOrdem Ano de Criacao e Nome\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas4 = new TreeSet<LinguagemFavorita>(new ComparatorAnoDeCriacaoENome());
        minhasLinguagensFavoritas4.addAll(minhasLinguagensFavoritas);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas4) System.out.println(linguagem);//D

        System.out.println("--------\tOrdem Nome - Ano de Criacao - IDE\t--------");
        Set<LinguagemFavorita> minhasLinguagensFavoritas5 = new TreeSet<LinguagemFavorita>(new ComparatorNomeAnoDeCriacaoEIde());
        minhasLinguagensFavoritas5.addAll(minhasLinguagensFavoritas3);
        for (LinguagemFavorita linguagem : minhasLinguagensFavoritas5) System.out.println(linguagem); //E

        
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita lf1, LinguagemFavorita lf2) {
        return lf1.ide.compareToIgnoreCase(lf2.ide);
    }
}

class ComparatorAnoDeCriacaoENome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);

        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return o1.nome.compareToIgnoreCase(o2.nome);
    }
}

class ComparatorNomeAnoDeCriacaoEIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita o1, LinguagemFavorita o2) {
        int nome = o1.nome.compareToIgnoreCase(o2.nome);
        if (nome != 0) return nome;
        int anoDeCriacao = Integer.compare(o1.anoDeCriacao, o2.anoDeCriacao);
        if (anoDeCriacao != 0) {
            return anoDeCriacao;
        }
        return o1.ide.compareToIgnoreCase(o2.ide);

    }
}