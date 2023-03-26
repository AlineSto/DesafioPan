package Estrutura_de_dados.Arvore_Binaria;

import org.w3c.dom.ls.LSOutput;

public class ArvoreBinaria <T extends Comparable<T>>{
   private BinNo<T> raiz;


  public ArvoreBinaria(){
      this.raiz=null;
  }

  public void inserir( T conteudo){
      BinNo<T> novoNo = new BinNo<>(conteudo);
      raiz=inserir(raiz,novoNo);
  }


   // inserir um NO na arvore , metodo sbrecarregadi
   private BinNo<T> inserir(BinNo<T> atual, BinNo<T> novoNo){
      // metodo de inserção recursivo
       if(atual == null){
           // se atual for nulo estou na raiz e vou retornar ao novo no
           return novoNo;
       }else if(novoNo.getConteudo().compareTo(atual.getConteudo())<0){
            // se for conteudo do novo nor for menor
           atual.setNoEsq(inserir(atual.getNoEsq(),novoNo));
       }else{
           atual.setNoDir(inserir(atual.getNoDir(),novoNo));
       }
       return atual;
   }

   // metods de exibição
   public void exibirInOrdem(){
       System.out.println("\n Exibindo InOrdem");
       exibirInOrdem(this.raiz);
   }

    private void exibirInOrdem(BinNo<T> atual){
        if(atual != null){
            exibirInOrdem(atual.getNoEsq());
            System.out.print(atual.getConteudo() + ", ");
            exibirInOrdem(atual.getNoDir());
        }
    }

    public void exibirPosOrdem(){
        System.out.println("\n Exibindo PosOrdem");
        exibirPosOrdem(this.raiz);
    }

    private void exibirPosOrdem(BinNo<T> atual){
        if(atual != null){
            exibirPosOrdem(atual.getNoEsq());
            exibirPosOrdem(atual.getNoDir());
            System.out.print(atual.getConteudo() + ", ");
        }
    }

    public void exibirPreOrdem(){
        System.out.println("\n Exibindo PreOrdem");
        exibirPreOrdem(this.raiz);
    }

    private void exibirPreOrdem(BinNo<T> atual){
        if(atual != null){
            System.out.print(atual.getConteudo() + ", ");
            exibirPreOrdem(atual.getNoEsq());
            exibirPreOrdem(atual.getNoDir());
        }
    }


    // metodo remove

   public void remover(T conteudo){
      // caso não ache o conteudo buscado
      try{
        BinNo<T> atual = this.raiz;
        BinNo<T> pai = null;
        BinNo<T> filho = null;
        BinNo<T> temp = null;  // No temporario
          // um laço para procurar o No que tem o conteudo
          while(atual != null && !atual.getConteudo().equals(conteudo)){
           // enquanto atual for diferente de nulo, e conteudo de autual não for igual ao conteudo
            // vai continar a fazer o loop de busca
             pai=atual;
             if(conteudo.compareTo(atual.getConteudo()) < 0){
               atual = atual.getNoEsq();
             }else{
                 atual = atual.getNoDir();
             }

          }
          if( atual == null){
              System.out.println("conteudo não encontrado");
          }

      if( pai == null){
          //pecorrendo os Nos
         if(atual.getNoDir() == null){
             this.raiz= atual.getNoEsq();

         }else if(atual.getNoEsq() == null){
             this.raiz= atual.getNoDir();
         }else{
              for(temp = atual,filho = atual.getNoEsq();
                    filho.getNoDir() != null;
                    temp = filho, filho = filho.getNoEsq()
                ){
                   if(filho != atual.getNoEsq()){
                     temp.setNoDir(filho.getNoEsq());
                     filho.setNoEsq(raiz.getNoEsq());
                   }
                }
            filho.setNoDir(raiz.getNoDir());
            raiz=filho;

         }
      }else if( atual.getNoDir()==null){
          if(pai.getNoEsq()== atual){
              pai.setNoEsq(atual.getNoEsq());
          }else{
              pai.setNoDir(atual.getNoEsq());
          }

      }else if( atual.getNoEsq()==null){
          if(pai.getNoEsq()== atual){
              pai.setNoEsq(atual.getNoDir());
          }else{
              pai.setNoDir(atual.getNoDir());
          }
      }else{
          for( temp = atual, filho = atual.getNoEsq();
               filho.getNoDir()!= null;
               temp = filho, filho = filho.getNoDir()

          ){
              if( filho!= atual.getNoEsq()){
                  temp.setNoDir(filho.getNoEsq());
                  filho.setNoEsq(atual.getNoEsq());
              }

              filho.setNoDir(atual.getNoDir());

              if(pai.getNoEsq() == atual){
                  pai.setNoEsq(filho);
              }else{
                  pai.setNoDir(filho);
              }
          }

      }


      }catch (NullPointerException arro){
          System.out.println(" conteudo não encontrado");
      }
   }


}
