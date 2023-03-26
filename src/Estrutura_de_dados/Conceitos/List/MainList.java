package Estrutura_de_dados.Conceitos.List;

import java.util.ArrayList;
import java.util.List;

public class MainList {

    public static void main (String [] args){
     List<CarroList> listacarro = new ArrayList<>();
        listacarro.add(new CarroList("Ford"));
        listacarro.add(new CarroList("chevolet"));
        listacarro.add(new CarroList("BMW"));
        listacarro.add(new CarroList("FordCar"));

      //  System.out.println(listacarro);
        System.out.println(listacarro.contains(new CarroList("Ford")));// verificar se existe a marca ford na lista

        System.out.println(listacarro.get(2));// verifica se esta preenchida o indice 2
        System.out.println(listacarro.indexOf("BMW"));
        System.out.println(listacarro);
        System.out.println(listacarro.remove(2));
        System.out.println(listacarro);





    }

}
