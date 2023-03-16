package Estrutura_de_dados.Lista_Duplamente_Encadeada;

public class ListaDuplamenteEncadeada<T> {
   private NoDuplo<T> primeiroNo;
   private NoDuplo<T> ultimoNo;

   private int tamanhoLista=0;

    public ListaDuplamenteEncadeada() {
       this.primeiroNo=null;
       this.ultimoNo=null;
       this.tamanhoLista = 0;
    }

    public int size(){
       // tamnaho da lista
       return this.tamanhoLista;
   }

   private NoDuplo<T> getNo(int index){
    NoDuplo<T> noAuxiliar = primeiroNo;

      for ( int i=0; (i< index)&& ( noAuxiliar!= null);i++){
        noAuxiliar=noAuxiliar.getNoProximo();
      }

     return noAuxiliar;

   }

   public T get(int index){
     return this.getNo(index).getConteudo();
   }


   public void add(T elemento){//recebe conteudo do tipo generico
    NoDuplo<T> novoNo = new NoDuplo<>(elemento);
    novoNo.setNoProximo(null);
    novoNo.setNoPrevio(ultimoNo);
    if( primeiroNo==null){
        primeiroNo =novoNo;
    }
    if(ultimoNo != null){
        ultimoNo.setNoProximo(novoNo);
    }

       ultimoNo=novoNo;
      tamanhoLista++;


   }
   //sobrecarga do metodo add()

    public void add( int index, T elemento){
        NoDuplo<T> novoAuxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(novoAuxiliar);

        if(novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(novoAuxiliar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoPrevio(ultimoNo);
            ultimoNo=novoNo;
        }

        if( index==0){
            primeiroNo=novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);
        }
        tamanhoLista++;


    }

    // remover o NO da lista

    public void remove( int index){// passando o index para remvação
      // primeiro tem que testar se a lista esta vazia



       if( index == 0){
         primeiroNo=primeiroNo.getNoProximo();
          if(primeiroNo != null){
              primeiroNo.setNoPrevio(null);
          }
       }else{
          NoDuplo<T> noAuxiliar = getNo(index);
          noAuxiliar.getNoPrevio().setNoProximo(noAuxiliar.getNoProximo());
           if(noAuxiliar!= ultimoNo){
               noAuxiliar.getNoProximo().setNoPrevio(noAuxiliar.getNoPrevio());

           }else{
            ultimoNo=noAuxiliar;
           }
       }
       this.tamanhoLista--;



    }


    @Override
    public String toString() {
      String strRetorno ="";
        NoDuplo<T> noAuxiliar = primeiroNo;
        for( int i=0; i< size();i++){ // pecorrendo a lista

            strRetorno+="[No{ conteudo= "+noAuxiliar.getConteudo()+" }]-->";
            noAuxiliar = noAuxiliar.getNoProximo();

        }
        strRetorno+="null";

      return  strRetorno;
    }
}
