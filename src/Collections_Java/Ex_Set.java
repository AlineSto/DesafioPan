package Collections_Java;

import java.util.*;


public class Ex_Set<D extends Number> {
    public static void main (String[] args){
        System.out.println(" Crie um conjunto e adicione as notas ");
      //  Set<Double> notas= new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7,0d,3.5));     // não funcionou o hasset
        //System.out.println(notas.toString());
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.5);
        System.out.println(notas2.toString());

        System.out.println("Exiba todas as notas em ordem crescente");
          Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);
           // exemplo de ordenaao Set






    }
}
