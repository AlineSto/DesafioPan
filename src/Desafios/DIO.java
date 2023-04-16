package Desafios;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/*
MESMA CLASSE IMPOSTO DE RENDA, MAIS ESSA RODOU NO CONSOLE DO DIO
 */
public class DIO {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;
        leitor.useLocale(Locale.ENGLISH);
        DecimalFormat valor1 = new DecimalFormat( " #,##0.00 " );

        //TODO: Agora utilizando estrutura condicional implemente em seu código as condições necessárias para o cálculo da taxa de imposto de renda:
        imposto=0d;
        double valor=0d;
        if( renda > 4500.00){
            valor = renda-4500.00;
            imposto+= (valor*0.28)+350;
            System.out.println(" R$"+ valor1.format(imposto));
        }else if( renda > 3000.00){
            valor= renda-3000.00;
            imposto+=(valor*0.18)+80;
            System.out.println(" R$"+ valor1.format(imposto));
        }else if( renda > 2000.00){
            valor=renda-2000.00;
            imposto+=(valor*0.8);
            System.out.println(" R$"+ valor1.format(imposto));
        }
        if (imposto==0){
            System.out.println("Isento");
        }


    }

}
