package Sets.Ordenacao;

import org.jetbrains.annotations.NotNull;

import javax.swing.plaf.TreeUI;
import java.util.*;

public class ExemploOrdenacaoSet {
    public static void main(String[] args) {
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};

        //System.out.println(minhasSeries); //Ordem aleatoria

        Set<Serie> minhasSeriesLinked = new LinkedHashSet<>(){{
            add(new Serie("Got", "Fantasia", 60));
            add(new Serie("Dark", "Drama", 60));
            add(new Serie("That '70s show", "Comédia", 25));
        }};

        //System.out.println(minhasSeriesLinked);

        Set<Serie> minhasSeriesTree = new TreeSet<>(minhasSeries);

        System.out.println(minhasSeriesTree); //Ordem natural

        Set<Serie> minhasSeries3 = new TreeSet<>(new CompareToNomeGeneroTempoEpisodio());
        minhasSeries3.addAll(minhasSeriesTree); //Vai ser organizada por nome genero e tempo

        System.out.println(minhasSeries3);

    }
}

class Serie implements Comparable<Serie>{
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio ) {
        this.nome = nome;
        this.tempoEpisodio = tempoEpisodio;
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "{" +
                "nome= '" + nome + '\'' +
                ", genero = '" + genero + '\'' +
                ", tempoEpisodio = " + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Serie serie = (Serie) o;
        return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero) && Objects.equals(tempoEpisodio, serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = this.getGenero().compareTo(serie.getGenero());

        if (tempoEpisodio != 0) {
            return tempoEpisodio;
        }

        return this.getGenero().compareTo(serie.getGenero());
    }
}

class CompareToNomeGeneroTempoEpisodio implements Comparator<Serie> {

    @Override
    public int compare(Serie s1, Serie s2) {
        int genero = s1.getGenero().compareTo(s2.getGenero());

        if (genero != 0) {
            return genero;
        }

        int nome = s1.getNome().compareTo(s2.getNome());

        if (nome != 0) {
            return nome;
        }

        return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
