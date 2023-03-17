package Estrutura_de_dados.Lista_Circular;

public class Main_ciruclar {
    public static void main (String [] args){
        ListaCircular< String> minhaListaCiruclar = new ListaCircular<>();
        minhaListaCiruclar.add("0");
        System.out.println(minhaListaCiruclar);
        minhaListaCiruclar.remove(0);
        System.out.println(minhaListaCiruclar);
        minhaListaCiruclar.add("c1");
        System.out.println(minhaListaCiruclar);
        minhaListaCiruclar.add("c2");
        minhaListaCiruclar.add("c3");
        minhaListaCiruclar.add("c4");
        System.out.println(minhaListaCiruclar);

        System.out.println(minhaListaCiruclar.get(0));
        System.out.println(minhaListaCiruclar.get(1));
        System.out.println(minhaListaCiruclar.get(2));
        System.out.println(minhaListaCiruclar.get(3));



    }
}
