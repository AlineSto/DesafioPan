/*
desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer numero inteiro entre 1 a 10.
o usuaruo deve informar de qual numero ele deseja ver a tabuada
a saida deve ser o exemplo abaixo:
tabuada de 5:
5x1=5
5x2=10
.....
5x10=50
 */

import java.util.Scanner;

public class Tabuada {
 public static void main (String [] args){
     Scanner ler= new Scanner(System.in);
     System.out.println(" Tabuada: ");
     int tabuada=ler.nextInt();

     System.out.println(" tabuada de "+tabuada);

     for( int i =1; i <= 10; i++){
         System.out.println( tabuada+ " X "+ i +" = "+(tabuada*i));
     }


 }



}
