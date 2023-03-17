package Estrutura_de_dados.Lista_Circular;

public class ListaCircular<T> {
 private No_circular<T> cabeca;// cabeça do NO
 private No_circular<T> cauda;
 private int tamanhoLista;

    public ListaCircular() {
        this.cabeca = null;
        this.cauda = null;
        this.tamanhoLista=0;
    }

    public int size(){
     return  this.tamanhoLista;
 }

 public boolean isEmpty(){
     // verificar se a lista esta vazia ou não
     return this.tamanhoLista ==0? true: false;// se a lista esta vazia é verdadeiro, senaõ false esta cheia
 }

private No_circular<T> getNo(int index){
    if( this.isEmpty()) {
        throw new IndexOutOfBoundsException(" A lista esta vazia");
    }
     if(index == 0){
         return this.cauda;
     }
     No_circular<T> noAuxiliar=this.cauda;
     for( int i=0; (i< index )&& (noAuxiliar!=null);i++){
         noAuxiliar=noAuxiliar.getNoProximo();
     }
     return noAuxiliar;
}

public T get( int index){
     return this.getNo(index).getConteudo();
}

  public void remove( int index){
     if (index  >= this.size()){
         throw  new IndexOutOfBoundsException(" o indence e maior que o tamanho da lista");

     }
    No_circular<T> noAuxiliar = this.cauda;
     if(index == 0){
         this.cauda= this.cauda.getNoProximo();
         this.cabeca.setNoProximo(this.cauda);
     }else if (index ==1){
         this.cauda.setNoProximo(this.cauda.getNoProximo().getNoProximo());

     }else {
         for ( int i=0;i< index-1;i++){
          noAuxiliar =noAuxiliar.getNoProximo();
         }
         noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
     }
     this.tamanhoLista--;
  }

  public void add(T conteudo){
    No_circular<T>novoNo = new No_circular<>(conteudo);
    if( this.tamanhoLista == 0){
        this.cabeca=novoNo;
        this.cauda = this.cabeca;
        this.cabeca.setNoProximo(cauda);
    }else {
        novoNo.setNoProximo(cauda);
        this.cabeca.setNoProximo(novoNo);
        this.cauda = novoNo;
    }
    this.tamanhoLista++;
  }


    @Override
    public String toString() {

        String strRetorno ="";
        No_circular<T> noAuxiliar = cauda;
        for( int i=0; i < this.size();i++){
           noAuxiliar = noAuxiliar.getNoProximo();
            strRetorno += " [ No circular{ conteudo = "+noAuxiliar.getConteudo()+"}]-->";
        }
     strRetorno+= this.size()!= 0 ?"(retorna ao inicio )" : "[]";



        return strRetorno;
    }
}
