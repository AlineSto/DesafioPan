package Desafios;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {
        int Distribuidor;
        int ValorImpostos;
        int custoConsumidor;

        Scanner scan = new Scanner(System.in);

        System.out.print(" Custo de Fabrica: ");
        int custoFabrica = scan.nextInt();

        System.out.print(" Porcetagem Distribuidor: ");
        int porcentagemDistribuidor = scan.nextInt();

        System.out.print(" Porcentual dos Impostos : ");
        int PercentualImpostos = scan.nextInt();

        // TODO: Implemente uma condição que calcule a porcentagem do distribuidor e dos impostos:

        Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        ValorImpostos = (custoFabrica*PercentualImpostos)/100;
        custoConsumidor= custoFabrica + Distribuidor+ValorImpostos;


        System.out.println("Valor total do Carro: "+ custoConsumidor);
    }
}
