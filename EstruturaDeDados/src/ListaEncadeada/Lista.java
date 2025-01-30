package ListaEncadeada;

public class Lista<T> {
    No<T> referenciaEntrada;

    public Lista() {
        this.referenciaEntrada = null;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);

        if (this.isEmpty()) {
            this.referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i < this.size() -1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No<T> getNo(int index) {
        validaIndice(index);

        No<T> noAuxiliar = this.referenciaEntrada;
        No<T> noRetorno = null;

        for (int i = 0; i <= index ;i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    public T get(int index) {
        return getNo(index).getConteudo();
    }

    public T remove(int index) {
        No<T> noPivo = this.getNo(index);
        if (index == 0) {
            referenciaEntrada = noPivo.getProximoNo();
            return noPivo.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivo.getProximoNo());
        return noPivo.getConteudo();
    }

    public int size() {
        int tamanhoLista = 0;

        No<T> referenciaAux = this.referenciaEntrada;

        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                }
                else {
                    break;
                }
            }
            else {
                break;
            }
        }

        return tamanhoLista;
    }

    private void validaIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index);
        }
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    public String toString() {
        String strRetorno = "";

        No<T> noAuxiliar = this.referenciaEntrada;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += noAuxiliar.getConteudo() + " -> ";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += null;

        return strRetorno;
    }
}
