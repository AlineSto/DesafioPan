package Desafios;
import java.util.Scanner;
/*
O programa lê um número inteiro positivo da entrada, que é armazenado na variável n.
Em seguida, é feita a soma dos n termos da série harmônica,
 e o resultado é impresso na saída com duas casas decimais utilizando o método String.format().
 */
public class Soma_H_com_N_Termos {
    public static void main(String[] Args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" informe qtdade N: ");
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
           h = h+1.0/i;


        }
        //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
       // System.out.println(String.format("%.2f", h)); não retorna o valor inteiro
        System.out.println(String.format("%.0f", h));// retorna o valor rendondo
        sc.close();
    }
}
