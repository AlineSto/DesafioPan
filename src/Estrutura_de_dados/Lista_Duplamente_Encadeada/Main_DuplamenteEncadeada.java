package Estrutura_de_dados.Lista_Duplamente_Encadeada;

public class Main_DuplamenteEncadeada{

   public static void main(String [] args){
     ListaDuplamenteEncadeada<String> minhalistaEncadeada = new ListaDuplamenteEncadeada<>();
       minhalistaEncadeada.add("c1");
       minhalistaEncadeada.add("c2");
       minhalistaEncadeada.add("c3");
       minhalistaEncadeada.add("c4");
       minhalistaEncadeada.add("c5");
       minhalistaEncadeada.add("c6");
       minhalistaEncadeada.add("c7");

       System.out.println(minhalistaEncadeada);
       System.out.println(" removendo um No da lista");
       minhalistaEncadeada.remove(3);
       minhalistaEncadeada.add(3,"amore");
       System.out.println(minhalistaEncadeada);

     System.out.println( minhalistaEncadeada.get(3));
















   }
}
