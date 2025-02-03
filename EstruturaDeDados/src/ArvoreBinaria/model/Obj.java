package ArvoreBinaria.model;

import java.util.Objects;

public class Obj extends ObjArvore<Obj>{
    Integer meuValor;

    public Obj(Integer meuValor) {
        this.meuValor = meuValor;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return Objects.equals(meuValor, obj.meuValor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(meuValor);
    }

    @Override
    public int compareTo(Obj obj) {
        int i = 0;

        if (this.meuValor > obj.meuValor) {
            i = 1;
        }
        else if (this.meuValor < obj.meuValor) {
            i = -1;
        }
        return i;
    }

    @Override
    public String toString() {
        return meuValor.toString();
    }
}
