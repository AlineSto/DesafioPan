package Desafios;
import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
/*
MESMA CLASSE DE TRIANGULO. ESSE CODIGO RODOU NO CONSOLE DO DIO
 */
public class Teste {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        leitor.useLocale(Locale.ENGLISH);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double maior;
        double soma;
        boolean triangulo;



        if( A>B && A>C)
            maior=A;
        else if( B>C )
            maior=B;
        else
            maior =C;

        if( maior == A)
            soma= B+C;

        else if (maior == B)
            soma = A + C;
        else
            soma = B + A;

        if (soma > maior)
            triangulo = true;
        else
            triangulo = false;

        if (triangulo)
            soma=A+B+C;

        else
            soma= ((A+B)*C)/2;



        System.out.println("Area = "+soma);
        // System.out.println( "resultado ");


    }
}
