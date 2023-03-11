package Estrutura_de_dados.Filas;
/*
Implementação da classe Fila, metodos: Enqueue, Dequeue
 */
public class Fila {
    private No_fila refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    // efileirar fila
    public void enqueue(Object obj){
        No_fila novoNo = new No_fila(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    // vai retornar o primeiro NO da fila. quem chegou primeiro
     public Object first(){
      if (!this.isEmputy()){
          No_fila primeiroNo= refNoEntradaFila;
          while(true){
              // verifica se é o primerio da fila
               if(primeiroNo.getRefNo()!= null){// se não for o primeiro
                 primeiroNo= primeiroNo.getRefNo();
               }else{
                   break;
               }
          }
          return primeiroNo.getObject();
      }
      return null;
     }

     // metodo Dequeue , retorna o primeiro da fila e retirna

    public Object dequeue(){// vai retornar o primeiro NO da fila. quem chegou primeiro
        if (!this.isEmputy()){
            No_fila primeiroNo= refNoEntradaFila;
            No_fila noAuxiliar = refNoEntradaFila;
            while(true){
                // verifica se é o primerio da fila
                if(primeiroNo.getRefNo()!= null){// se não for o primeiro
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return  primeiroNo.getObject();
        }
        return null;
    }


    public boolean isEmputy(){
        // verificar se a fila esta vazia
        return  refNoEntradaFila == null ? true : false; // se a fila estiver vazia retorna null caso contrario true
    }




    @Override
    public String toString() {
        String stringRetorno = "";
        No_fila noAuxiliar = refNoEntradaFila;

        if(refNoEntradaFila != null){
            while (true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorno += "null";
                    break;
                }
            }
        }else{
            stringRetorno = "null";
        }
        return stringRetorno;
    }
}
