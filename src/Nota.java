/*
Faça um programa que peça uma nota, entre zero e dez.
mostre uma mensangame caso o valor seja invalido e continue pedindo ate que o usuario
informe um valor valido
 */

import java.util.Scanner;
public class Nota {

    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);
        int valor;

        System.out.println(" informe o numero: ");
        valor=ler.nextInt();


       while(valor < 0 || valor > 10) {
           System.out.println(" numero invalido, faça novamente ");
           valor=ler.nextInt();
       }



    }

}
