package Estrutura_de_dados.No;
// classe de No, para contruir estrutura dinamicas

public class No<T> {
    private T conteudo;
    private No<T> proximoNO;

    public No(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNO = null;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No<T> getProximoNO() {
        return proximoNO;
    }

    public void setProximoNO(No<T> proximoNO) {
        this.proximoNO = proximoNO;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
