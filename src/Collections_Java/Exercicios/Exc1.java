package Collections_Java.Exercicios;
/*
Faça um programa qeue receba a temperatura media dos
6 primeiros meses do ano e armazene em uma lista.
Apos isto, calcule a media semestral da temperatura e
mostre todas as temperatudas acima da media, e em que mes elas ocorreram
(mostra o mes por extenso ex: 1- janeiro,2-Fevereiro, etc)
 */


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exc1 {

    //  resposta da professora Camila

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            List<Double> temperaturas = new ArrayList<Double>();

            //Adicionando as temperaturas na lista:
            int count = 0;
            while (true) {
                if (count == 6) break;

                System.out.print("Digite a temperatura: ");
                double temp = scan.nextDouble();
                temperaturas.add(temp);
                count++;
            }
            System.out.println("-----------------");

            //exibindo todas as temperaturas:
            System.out.print("Todas as temperaturas: ");
            temperaturas.forEach(t -> System.out.print(t + " "));

            //calculando e exibindo a média das temperaturas:
            double media = temperaturas.stream()
                    .mapToDouble(Double::doubleValue)
                    .average()
                    .orElse(0d);
            System.out.printf("\nMédia das temperaturas: %.1f\n", media);

            //exibindo as temperaturas acima da média
            System.out.print("Temperaturas acima da média: ");
            temperaturas.stream()
                    .filter(t -> t > media)
                    .forEach(t -> System.out.printf("%.1f ", t));

            //exibindo o mês das temperaturas acima da média por extenso:
            System.out.println("\n\nMeses das temperaturas acima da média: ");
            Iterator<Double> iterator = temperaturas.iterator();

            count = 0;
            while (iterator.hasNext()) {
                Double temp = iterator.next();
                if (temp > media) {
                    switch (count) {
                        case (0):
                            System.out.printf("1 - janeiro: %.1f\n ", temp);
                            break;
                        case (1):
                            System.out.printf("2 - fevereiro: %.1f\n", temp);
                            break;
                        case (2):
                            System.out.printf("3 - março: %.1f\n", temp);
                            break;
                        case (3):
                            System.out.printf("4 - abril: %.1f\n", temp);
                            break;
                        case (4):
                            System.out.printf("5 - maio: %.1f\n", temp);
                            break;
                        case (5):
                            System.out.printf("6 - junho: %.1f\n", temp);
                            break;
                        default:
                            System.out.println("Não houve temperatura acima da média.");
                    }
                }
                count++;
            }
        }


}



