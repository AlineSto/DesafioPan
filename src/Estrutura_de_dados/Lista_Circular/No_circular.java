package Estrutura_de_dados.Lista_Circular;

public class No_circular<T> {
    private T conteudo;
    private No_circular<T> noProximo;


    public No_circular(T conteudo, No_circular<T> noProximo) {
        this.conteudo = conteudo;
        this.noProximo = null;
    }

    public No_circular(T conteudo) {
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No_circular<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(No_circular<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "conteudo=" + conteudo +
                '}';
    }



}
