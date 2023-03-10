package Estrutura_de_dados;
// classe de No, para contruir estrutura dinamicas

public class No {
    private String conteudo;
    private No proximoNO;

    public No(String conteudo) {
        this.conteudo = conteudo;
        this.proximoNO = null;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public No getProximoNO() {
        return proximoNO;
    }

    public void setProximoNO(No proximoNO) {
        this.proximoNO = proximoNO;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
