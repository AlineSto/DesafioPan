package Estrutura_de_dados.Conceitos.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
/*
entendo o hashSet
 */

public class MainSet {
    public static void main (String [] args){
        Set<CarroSet> hashSetCarros = new HashSet<>();
        hashSetCarros.add(new CarroSet("Ford"));
        hashSetCarros.add(new CarroSet("Pegout"));
        hashSetCarros.add(new CarroSet("chevete"));
        hashSetCarros.add(new CarroSet("BWM 4x4"));

       // System.out.println(hashSetCarros);// exibe sem levar em conta a ordem de inserção

        Set<CarroSet> treSetCarros = new TreeSet<>();// TreeSet exibe como arvore
        treSetCarros.add(new CarroSet("Ford"));
        treSetCarros.add(new CarroSet("Pegout"));
        treSetCarros.add(new CarroSet("chevete"));
        treSetCarros.add(new CarroSet("BWM 4x4"));
        System.out.println(treSetCarros);





    }

}
