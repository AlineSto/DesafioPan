package Desafios;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem
Area = XX.X
Entrada
A entrada contém três valores reais.
Saída
O resultado deve ser apresentado com uma casa decimal.

-----------------------------------------
| Exemplo de Entrada | Exemplo de Saída |
-----------------------------------------
| 6.0 4.0 2.0        | Area = 10.0      |
-----------------------------------------
| 6.0 4.0 2.1        | Perimetro = 12.1 |
-----------------------------------------
 */
public class Triangulo {

    // roda aki, mais não funciona no console da dio
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.ENGLISH);
        double maior,soma,A,B,C;
        boolean triangulo;
        DecimalFormat valor = new DecimalFormat( " #,##0.00 " );

        System.out.println("lado A: ");
         A = leitor.nextDouble();
        System.out.println("lado B: ");
        B = leitor.nextDouble();
        System.out.println("lado C: ");
        C = leitor.nextDouble();

       triangulo = ((A+B>C)&& (A+C>B)&&(B+C>A));
         if(triangulo){
           System.out.println("traingulo,valor do Perimetro: ");
           //perimetro
           soma= A+B+C;

       }else{
          // trapezio
           System.out.println("trapezio, valor do perimetro: ");
           soma= ((A+B)*C)/2;
       }

        System.out.println( valor.format(soma));


    }

}
