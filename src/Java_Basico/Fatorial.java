/*
faça um programa que calcule o fatorial de um numero
inteiro ex: 5 (5x4x3x2x1)
 */
import java.util.Scanner;
public class Fatorial {
    public static void main(String [] args){
        Scanner ler = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial =ler.nextInt();

        int multiplicacao=1;

        for(int i= fatorial;i>=1;i--){
         multiplicacao = multiplicacao*i;
        }
        System.out.println(fatorial+ " != "+ multiplicacao);


    }
}
