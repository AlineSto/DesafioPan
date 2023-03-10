/*
Faça um progrma que peça N numeros inteiros
e calcule e mostre a quantidaede de numeros pares e impares
 */
import java.util.Scanner;
public class Par_e_Impar {
    public  static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int qtdNumeros,cont=0,numero, contPar=0,contImpar=0;

        System.out.println(" Quantidade de numeros: ");
        qtdNumeros= ler.nextInt();

        do{
           System.out.println(" Numero: ");
           numero=ler.nextInt();
              if ( numero % 2 ==0){// % resto da divisao
                 contPar= contPar+1;

              }else{
                     contImpar=contImpar+1;
                    }
              cont++;

        }while(cont < qtdNumeros);

        System.out.println(" Quantidade de numeros pares: "+contPar);
        System.out.println("Quantidade de numeros impares: "+contImpar);

    }
}
