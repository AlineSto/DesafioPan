package Estrutura_de_dados.Lista_Encadeada;
// implementação da lista Encadeada
public class ListaEncadeada<T> {
    private No_listaEncadeada<T> refenciaEntrada;

    public ListaEncadeada() {
        this.refenciaEntrada = null;
    }

    // metodo adicionar na lista

    public void add(T conteudo) {
        No_listaEncadeada<T> novoNo = new No_listaEncadeada<>(conteudo);
        if (this.isEmpty()) {
            refenciaEntrada = novoNo;
            return;
        }
        No_listaEncadeada<T> noAuxiliar = refenciaEntrada;
        for (int i = 0; i < this.size() - 1; i++) {
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

// metodo getNo. metodo interno da classe

    private No_listaEncadeada<T> getNo(int index) {
        int ultimoIndice = size() - 1;
        validarIndice(index);

        No_listaEncadeada<T> noAuxiliar = refenciaEntrada;
        No_listaEncadeada<T> noRetorno = null;
        for (int i = 0; i <= index; i++) {
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    // retornar o conteudo não o NO
    public T get(int index) {
        return getNo(index).getConteudo();
    }

    //retonar o conteudo do NO removido
    public T remove(int index) {
        No_listaEncadeada<T> noPivor = this.getNo(index);
        if (index == 0) {
            refenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No_listaEncadeada<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    // retornar o tamanho da minha lista
    public int size() {
        int tamanhoLista = 0;
        No_listaEncadeada<T> referenciaAux = refenciaEntrada;
        while (true) {
            if (referenciaAux != null) {
                tamanhoLista++;
                if (referenciaAux.getProximoNo() != null) {
                    referenciaAux = referenciaAux.getProximoNo();
                } else {
                    break;
                }

            } else {
                break;
            }
        }

        return tamanhoLista;

    }

    // validar indice
    public void validarIndice(int index) {
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existe conteudo no indice " + index);
        }

    }


    // verifca se a lista esta vazia
    public boolean isEmpty() {
        return refenciaEntrada == null ? true : false;
    }

    public No_listaEncadeada<T> getReferenciaEntrada() {
        return refenciaEntrada;
    }

    public void setReferenciaEntrada(No_listaEncadeada<T> referenciaEntrada) {
        this.refenciaEntrada = referenciaEntrada;
    }


    @Override
    public String toString() {
        String strRetorno = "";
        No_listaEncadeada<T> noAuxiliar = refenciaEntrada;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}



