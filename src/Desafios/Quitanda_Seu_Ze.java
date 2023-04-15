package Desafios;
/*
Seu Zé está vendendo frutas com a seguinte tabela de preços:

Exemplo 1

Morango
 Até 5 Kg R$ 2,50 por Kg
Acima de 5 Kg   R$ 2,20 por Kg
Maçã
Até 5 Kg R$ 1,80
Acima de 5 Kg 	R$ 1,50 por Kg

Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
 receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg)
de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
 */

import java.util.Scanner;

public class Quitanda_Seu_Ze {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        double totalFruta=0,somaTotal=0, somaMorango=0,somaMaca=0,Totalcomdesconto=0;

        System.out.println(" qtd Morango: ");
        int morangos = input.nextInt();
        System.out.println(" qtd Maças: ");
        int macas = input.nextInt();


        // calculando valores unitarios
        if( morangos <= 5){
            somaMorango= morangos*2.5;

        }else
        {
            somaMorango = morangos *2.20;
        }


        if (macas <= 5){
            somaMaca=macas*1.8;
        }else{
            somaMaca=macas*1.5;
        }

     totalFruta= morangos+macas;
     somaTotal=somaMaca+somaMorango;

     if( totalFruta > 8 || somaTotal > 25.00){
         Totalcomdesconto= somaTotal-((somaTotal*10)/100);
         System.out.println(" Teve desconto: "+Totalcomdesconto);
     }else{
         System.out.println(" Sem desconto. Valor total: "+somaTotal);
     }

    }
}
