package Estrutura_de_dados.Conceitos.EqualsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main_EqualsHashCode {
    public static void main(String [] args){
      List<Carro> listaCarros = new ArrayList<>();
      listaCarros.add(new Carro("Ford"));
      listaCarros.add(new Carro("Chevorlet"));
      listaCarros.add(new Carro("Volkwasgen"));

      System.out.println(listaCarros.contains(new Carro("Ford")));

      System.out.println(new Carro("Ford").hashCode());
      Carro carro1 =new Carro("Ford");
      Carro carro2 =new Carro("Volkwasgen");
        System.out.println(carro1.equals(carro2));


    }
}
