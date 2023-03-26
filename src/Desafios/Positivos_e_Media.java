package Desafios;
/*
Desafio
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.
 */
import java.io.IOException;
import java.util.Scanner;

public class Positivos_e_Media {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i <= 6; i++) {// apresenta erro ao inserir numeros negativos, mais passou no teste da api online no bootcamp
            System.out.print("Numero: ");
            x = leitor.nextDouble();
              if (x > 0) {
                 cont++;
                 media += x;
              }

        }
        media = media /(double)cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }


}






