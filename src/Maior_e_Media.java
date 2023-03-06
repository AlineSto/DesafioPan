/*
Faça um programa que leia 5 numeros
e informe o maior numero e a media deles
 */
import java.util.Scanner;

public class Maior_e_Media {
   public static void main (String[] args){
   Scanner ler = new Scanner(System.in);
   int numero, cont=0,soma=0,maior=0;

   do{
       System.out.println(" informe o numero: ");
       numero=ler.nextInt();
       if (numero > maior){
           maior=numero;
       }
       cont=cont+1;
       soma=soma+numero;
   }while(cont < 5 );


       System.out.println(" Maior numero digitado: "+ maior);
       System.out.println(" Soma dos numeros digitados: "+ soma);


   }


}
