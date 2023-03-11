package Estrutura_de_dados.Filas;

import org.w3c.dom.ls.LSOutput;

public class Main_fila {
    public static void main(String[] args){
        Fila minhaFila = new Fila();
        minhaFila.enqueue(new No_fila("primeiro"));
        minhaFila.enqueue(new No_fila("segundo"));
        minhaFila.enqueue(new No_fila("terceiro"));
        minhaFila.enqueue(new No_fila("quarto"));
        minhaFila.enqueue("quinto");

        System.out.println(minhaFila+"\n");

        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila+"\n");

        minhaFila.enqueue(new No_fila("ultimo"));

        System.out.println(minhaFila+"\n");

        System.out.println(minhaFila.first());






    }

}
