package Desafios;
import java.io.IOException;
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
public class TrianguloComVetor {
    public static void main(String[]args)throws IOException{
    Scanner leitor = new Scanner(System.in);

    double[] valores = new double[3];
		for(
    int i = 0;
    i< 3;i++)valores[i]=leitor.nextDouble();

    boolean triangulo = (valores[0] + valores[1] > valores[2])
            && (valores[0] + valores[2] > valores[1])
            && (valores[1] + valores[2] > valores[0]);

    double valor = 0d;
    String mensagem = "";

		if(triangulo)

    {
        mensagem = "Perimetro";
        valor = Arrays.stream(valores).sum();
    } else

    {
        mensagem = "Area";
        valor = ((valores[0] + valores[1]) * valores[2]) / 2;
    }

		System.out.printf("%s = %.1f",mensagem,valor);

		leitor.close();
  }
}
