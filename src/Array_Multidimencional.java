/*
gere e imprima uma matriz M 4x4 com valores aleatorios entre 0-9
 */

import java.util.Random;

public class Array_Multidimencional {
    public static void main(String [] args){
        Random randon= new Random();
         int [][] M= new int[4][4];
         for( int i=0; i< M.length;i++){
             for (int j=0;j< M[i].length;j++){
                 M[i][j]=randon.nextInt(9);
             }
         }

        System.out.println(" Matriz ");
       for(int[] linha: M){
           for( int coluna: linha){// pegando cada elemento da coluna
               System.out.print(coluna+" ");
           }
           System.out.println();
       }

    }
}
