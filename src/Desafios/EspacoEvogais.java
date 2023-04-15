package Desafios;
import java.util.Scanner;
/*
Desafio
Jorginho é professor do primário de uma determinada escola.
Ele tem 100000 alunos e precisa criar um programa que verifica
quantos espaços em branco e quantas vogais existem em uma determinada string de entrada que os alunos
entregaram na avaliação final. Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!
 */
public class EspacoEvogais {
    // erro
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String[] strSplit = str.split(" ");

        char[] arrVogais = {'a', 'e', 'i', 'o', 'u','A','E','I','O','U'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;


        System.out.println(" escreva o nome: ");
         str = sc.nextLine();


        str.toLowerCase();

     // contando as vogais menusculos . esta funcionando
        if(str.equalsIgnoreCase(str)) {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (contem(arrVogais, c)) {
                    quantVogais++;
                }
                if (str.equals(" "))
                {// erro aki, mais funcionou no console da DIO. VAI ENTENDER!
                    espacosEmBranco++;
                }




            }

        }



      //  System.out.println(quantVogais);

        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
    private static boolean contem (char vetor[], char comparacao){
        boolean flag = false;

        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] == comparacao)
                flag = true;
        }

        return flag;
    }
}
