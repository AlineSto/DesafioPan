/*
Faça um programa que leia 20 numeros inteiros aleatorios
(entre 0 e 100) e armazene no vetor
ao final mostre os numeros e seus sucessores
 */


import java.util.Random;

public class Numeros_aleatorios {
    public static void main(String[] args){
        Random randon= new Random();
        int numerosAleatorios[]= new int[20];
         for( int i=0;i< numerosAleatorios.length;i++){
             int numero = randon.nextInt(100);
             numerosAleatorios[i]=numero;

         }
        System.out.println(" numeros aleatorios: ");
          for (int numero: numerosAleatorios){
              System.out.print(numero+ " ");
          }

        System.out.println(" \n\nSucessores numeros aleatorios: ");
        for (int numero: numerosAleatorios){
            System.out.print((numero+1)+ " ");
        }






    }
}
