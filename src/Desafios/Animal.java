package Desafios;
/*
você deverá ler 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita.
 Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
 */

import java.io.IOException;
import java.util.Scanner;

public class Animal {
    public static void main(String[] args) {
        String AN1, AN2, AN3;
        String result;

        Scanner ler = new Scanner (System.in);

        System.out.println(" Caracteristica 1: ");
        AN1=ler.next();
        System.out.println(" Caracteristica 2: ");
        AN2=ler.next();
        System.out.println(" Caracteristica 3: ");
        AN3=ler.next();

        if (AN1.equalsIgnoreCase("vertebrado")) {
            if (AN2.equalsIgnoreCase("ave")) {
                if (AN3.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (AN3.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }
        } else {
            if (AN2.equalsIgnoreCase("inseto")) {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (AN3.equalsIgnoreCase("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }
            }
        }
    }

}
