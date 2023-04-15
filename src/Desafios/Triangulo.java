package Desafios;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/*
Desafio
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
 Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:

Area = XX.X

Fórmula da área de um trapézio: AREA = ((A + B) x C) / 2
 */
public class Triangulo {

    // roda aki, mais não funciona no console da dio
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
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
