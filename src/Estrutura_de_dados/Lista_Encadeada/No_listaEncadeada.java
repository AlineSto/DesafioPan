package Estrutura_de_dados.Lista_Encadeada;
// ultilizando genericos
public class No_listaEncadeada<T> {
private T conteudo;
private No_listaEncadeada proximoNo;

    public No_listaEncadeada() {
        this.proximoNo=null;
    }

    public No_listaEncadeada(T conteudo) {
        this.proximoNo=null;
        this.conteudo = conteudo;
    }

    public No_listaEncadeada(T conteudo, No_listaEncadeada proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No_listaEncadeada getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No_listaEncadeada proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No_listaEncadeada{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringPersonalizado(){
        String str=" NO{ "+
                "Conteudo"+ conteudo+ '}';
        if(proximoNo!=null){
            str +="--> "+proximoNo.toString();
        }else{
            str+=" null --> ";
        }
        return str;
    }





}
