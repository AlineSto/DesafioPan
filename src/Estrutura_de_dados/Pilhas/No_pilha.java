package Estrutura_de_dados.Pilhas;

public class No_pilha {
  private int dado;
  private No_pilha refNo=null;// referencia pro prx No


    public No_pilha() {
    }

    public No_pilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No_pilha getRefNo() {
        return refNo;
    }

    public void setRefNo(No_pilha refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No_pilha{" +
                "dado=" + dado +
                '}';
    }
}
