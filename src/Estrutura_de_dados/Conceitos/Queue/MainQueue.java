package Estrutura_de_dados.Conceitos.Queue;

import java.util.LinkedList;
import java.util.Queue;
/*
Queue metodo java para fila e linklist
 */
public class MainQueue {
    public static void main( String[] args){
        Queue<CarroQueue>queueCarro = new LinkedList<>();
        queueCarro.add(new CarroQueue("Ford"));
        queueCarro.add(new CarroQueue("Chevorlet"));
        queueCarro.add(new CarroQueue("Volkwasgem"));

        System.out.println(queueCarro.add(new CarroQueue("Pegoat")));

        System.out.println(queueCarro);
        System.out.println(queueCarro.offer(new CarroQueue("Renoult")));  // vai tentar adicinar o valor, caso não cosiga ele retornaria false
        System.out.println(queueCarro);
        System.out.println(queueCarro.peek());// mostrou o primeiro carro na fila mais não remove
        System.out.println(queueCarro);

        System.out.println(queueCarro.poll());// pega o primeiro da fila e remove
        System.out.println(queueCarro);

        System.out.println(queueCarro.isEmpty());// mostra se a fila esta vazia
        System.out.println(queueCarro.size());// verificar o tamanho da fila











    }

}
