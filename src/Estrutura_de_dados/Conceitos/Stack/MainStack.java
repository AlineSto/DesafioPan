package Estrutura_de_dados.Conceitos.Stack;

import java.util.Stack;
/*
Stack metodo do java, para trabalhar com pilha
 */

public class MainStack {
    public static void main(String [] args){
        Stack< CarroStack> stackCarro = new Stack<>();
        stackCarro.push(new CarroStack(" Ford"));
        stackCarro.push(new CarroStack(" Chevorlet"));
        stackCarro.push(new CarroStack(" Volkwasgen"));

        System.out.println(stackCarro);
        System.out.println(stackCarro.pop()); // tirar o ultimo que entrou na pilha
        System.out.println(stackCarro);

        System.out.println(stackCarro.peek());// mostra o ultimo da pilha mais não retirna
        System.out.println(stackCarro);
        System.out.println(stackCarro.empty());// mostra se a pilha esta vazia





    }
}
