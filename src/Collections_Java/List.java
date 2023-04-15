package Collections_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class List {
    public static void main(String [] args){
        java.util.List<Double> notas = new ArrayList<>(); // o List não aceita tipo Double ou double. é necessario colcocar o collection java
        // na frente

        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);

      /*  System.out.println(notas.toString());
        System.out.println(" Exiba a posição da nota 5: "+notas.indexOf(5d));
        System.out.println("Adicione na lista a nota 8.0 na posição 4");
        notas.add(4,8d);
        System.out.println(notas.toString());
        System.out.println("substituia a nota 5 pela nota 6");
        notas.set(notas.indexOf(5d),6.0);
        System.out.println(notas.toString());
        System.out.println(" confira se a nota 5 esta dentro da lista: "+notas.contains(5d));// ira retornar false, pq a nota 5 foi substituida pela 6
        System.out.println();
        System.out.println(" imprimir todas as notas ");
        for(Double nota:notas){
            System.out.println(nota);

        }

        System.out.println(" exiba a tericera nota adiciona "+ notas.get(2));
        System.out.println(notas.toString());

        System.out.println(" imprimir a menor nota: "+ Collections.min(notas));

        System.out.println(" exiba a maior nota: "+Collections.max(notas));

        System.out.println(" exiba a soma dos valores: ");
        Iterator<Double> iterator = notas.iterator();
       Double soma= 0d;
        while(iterator.hasNext()){// hasNext, sera o proximo elemento
            Double next = iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        System.out.println(" Exiba a media das notas: "+ (soma)/notas.size());

        System.out.println(notas.toString());
        System.out.println(" remova a nota 0.0 ");
        notas.remove(0d);// remover o elemeto 0. escolher remove elemento, quando for dihotar no itelij  o remove
        System.out.println(notas.toString());

        System.out.println(notas.toString());
        System.out.println(" remova a nota na posição 0.0 ");
        notas.remove(0);
        System.out.println(notas.toString());*/

        System.out.println(" remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        Double soma= 0d;
        while(iterator2.hasNext()){// hasNext, sera o proximo elemento
            Double next = iterator2.next();
            if(next <7) iterator2.remove();

        }
        System.out.println(notas);

        System.out.println(" Apague toda a lista ");
        notas.clear();
        System.out.println(notas);

        System.out.println(" Confira se a lista esta vazia: "+notas.isEmpty());// retorna true se estiver vazia e false senao estiver











    }


}
