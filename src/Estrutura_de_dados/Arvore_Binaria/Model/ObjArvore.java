package Estrutura_de_dados.Arvore_Binaria.Model;

public abstract class ObjArvore<T> implements Comparable<T> {
   // criar a forma das classes que preciso ultiliar
    public abstract boolean equals( Object o);
    public abstract int hasCode();
    public abstract  int compareTo( T outro);
    public abstract String toString();


}
