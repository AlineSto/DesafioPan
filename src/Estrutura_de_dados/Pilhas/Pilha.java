package Estrutura_de_dados.Pilhas;

public class Pilha {
 private No_pilha refNoEntradaPilha;

 public Pilha() {
  this.refNoEntradaPilha = null;
 }

 public void push(No_pilha novoNO){// acrescenta um NO no topo da pilha
  No_pilha refAuxiliar = refNoEntradaPilha; // vai guardar a referencia de entrada do NO
  refNoEntradaPilha = novoNO;  // pega aa referencia e seta no novo NO
  refNoEntradaPilha.setRefNo(refAuxiliar);//

 }

 public No_pilha pop(){// ultimo elemento da pilha
  if(!this.isEmpty()){// verificar se a pilha não esta vazia
      No_pilha noPop = refNoEntradaPilha;
     refNoEntradaPilha = refNoEntradaPilha.getRefNo();
   return noPop;
  }
  return null;
 }

 public No_pilha top(){// topo da pilha
  return refNoEntradaPilha;
 }

 // metodo isEmputy
 public boolean isEmpty(){
   if(refNoEntradaPilha == null){
        return true;
  }
  return false;
  // return refNoEntradaPilha == null ? true : false; * mesma coisa do cod acima
 }

@Override
 public String toString(){
  String stringRetorno ="--------------\n";
  stringRetorno += " Pilha\n";
  stringRetorno+= "--------------\n";
  // pecorrer a pilha e mostrar as informações de cada NO
  No_pilha noAuxiliar =  refNoEntradaPilha;
  while(true){
    if(noAuxiliar != null){
        stringRetorno += "[ No{ dado= "+ noAuxiliar.getDado()+" }]\n";
        noAuxiliar = noAuxiliar.getRefNo();

    }else{
          break;
         }
  }
  stringRetorno +="--------------\n";
  return stringRetorno;
}




}
