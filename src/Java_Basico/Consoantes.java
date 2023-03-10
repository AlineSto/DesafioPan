/*
faça um programa que leia um vetor e 6 caracteres
e diga quantas consoantes foram lidas e imprima as
consoantes
 */
import java.util.Scanner;


public class Consoantes {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        String [] consoantes = new String[6];
        int qtdConsoantes =0;
        int cont=0;

        do{

            System.out.print(" letra: ");
            String letra= ler.next();
            // veirificar quando a letra não for igual as vogais
            if(!(letra.equalsIgnoreCase("a")||
                    letra.equalsIgnoreCase("e")||
                    letra.equalsIgnoreCase("i")||
                    letra.equalsIgnoreCase("o")||
                    letra.equalsIgnoreCase("u"))){
                consoantes[cont]=letra;
                qtdConsoantes++;

            }
            cont++;


        }while( cont < consoantes.length);
        System.out.println("consoantes: ");
         for(String consoante : consoantes){
             if(consoante != null) // so vai imprimir os valores do vetor diferentes de null
               System.out.print(consoante+" ");
         }






    }



}
