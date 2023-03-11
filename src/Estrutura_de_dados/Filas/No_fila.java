package Estrutura_de_dados.Filas;

public class No_fila {
    private Object object;
    private No_fila refNo;
    public No_fila (){

    }

    public No_fila (Object object){
        this.refNo=null;
        this.object=object;
    }

    public No_fila getRefNo() {
        return refNo;
    }

    public void setRefNo(No_fila refNo) {
        this.refNo = refNo;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "No_fila{" +
                "object=" + object +
                '}';
    }
}
