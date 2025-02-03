package set;

import java.util.Objects;

public class Carro implements Comparable<Carro>{
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Carro)) return false;
        Carro carro = (Carro) obj;
        return Objects.equals(getMarca(), carro.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMarca());
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + '}';
    }

    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
