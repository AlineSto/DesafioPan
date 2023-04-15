package Collections_Java;
/*
Dados os seguintes informações sobre meus gatos crie uma lista
e ordene esta lista como exibido( nome - idade - cor);
gato1: nome: Jon, idade 18, cor: preto
gato2: nome: Simba, idade 6, cor: tigrado
gato3: nome: Jon, idade 12, cor: amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OrdenarList {
   public static void main (String [] args){
    List<Gato> meusGatos= new ArrayList<>(){{
        add(new Gato("Jon",18,"Preto"));
        add(new Gato("Simba",6,"Tigrado"));
        add(new Gato("Jon",12,"Amarelo"));

    }};

      /* System.out.println("-- \tordene com Inserção\t---");
       System.out.println(meusGatos);
       System.out.println("---\tOrdem aleatoria\t---");
       Collections.shuffle(meusGatos);// embaralha a lsita
       System.out.println(meusGatos);
       System.out.println("---\tOrdem Natural (nome) \t---");
       Collections.sort(meusGatos);
       System.out.println(meusGatos);

       System.out.println("--\t Ordem idade\t--");
     //  Collections.sort(meusGatos, new ComparatorIdade());// compara por idade
       meusGatos.sort(new ComparatorIdade());// compara por idade
       System.out.println(meusGatos);

       System.out.println("--\t Ordem Cor\t--");
       meusGatos.sort(new ComparatorCor());
       System.out.println(meusGatos);*/

       System.out.println("--\t Ordem Nome/Cor/Idade\t--");
       meusGatos.sort(new ComparatorNomeCorIdade());
       System.out.println(meusGatos);


   }
   static class Gato implements Comparable<Gato>{
     private String nome,cor;
     private int idade;

       public String getNome() {
           return nome;
       }

       public void setNome(String nome) {
           this.nome = nome;
       }

       public String getCor() {
           return cor;
       }

       public void setCor(String cor) {
           this.cor = cor;
       }

       public int getIdade() {
           return idade;
       }

       public void setIdade(int idade) {
           this.idade = idade;
       }

       public Gato(String nome, int idade, String cor) {
           this.cor = cor;
           this.idade = idade;
           this.nome=nome;

       }

       @Override
       public String toString() {
           return "{" +
                   "nome='" + nome + '\'' +
                   ", cor='" + cor + '\'' +
                   ", idade=" + idade +
                   '}';
       }

       @Override
       public int compareTo(Gato gato) {
           return this.getNome().compareToIgnoreCase(gato.getNome());
       }
   }

  static class ComparatorIdade implements Comparator<Gato> {


      @Override
      public int compare(Gato gato1, Gato gato2) {
          return Integer.compare(gato1.getIdade(), gato2.idade);
      }

  }

   static class  ComparatorCor implements Comparator<Gato>{

      @Override
      public int compare  (Gato g1, Gato g2) {
          return g1.getCor().compareToIgnoreCase(g2.getCor());
        }
   }

   static class ComparatorNomeCorIdade implements Comparator<Gato>{

       @Override
       public int compare(Gato g1, Gato g2) {
           int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
            if( nome!=0) return nome;
            int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
            if(cor!=0) return cor;

           return Integer.compare(g1.getIdade(),g2.getIdade());
       }
   }

}

