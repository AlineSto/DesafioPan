
/*
crie um vetor de 6 numeros inteiros e
mostre na ordem inversa
 */

public class Ordem_Inversa {

 public static void main (String[] args){
     //vetor unidimencional
   int [] vetor = { 6,10,-5,8,1,-4};
   System.out.println("Vetor");

     int cont=0;
     while( cont <= (vetor.length)-1){
         System.out.print(vetor[cont]+" ");
         cont++;
     }
     System.out.println("\nVetor inverso ");
     for( int i= (vetor.length-1);i>=0;i--){// ficar descrecente
         System.out.print(vetor[i]+ " ");
     }

 }
}
