package Collections_Java;

import java.util.*;

public class OrdenarSet {
 /*
 Dadas as seguintes informações sonre minhas series favoritas
 crie um conjunto e ordene exibindo: nome-genero- tempo de episodio
 serie1= Nome: GOT, genero: fantansia, temporEpisodio: 60
 serie1= Nome: Dark, genero: drama      , temporEpisodio: 60
 serie1= Nome: That '70 show, genero: comedia , temporEpisodio: 25
  */
  public static void main (String[] args){
      System.out.println("--\tOrdem aleaorio\t--");

      Set<Serie> minhasSeries = new HashSet<>(){{
          add(new Serie("GOT","fantansia",60)) ;
          add(new Serie("Dark","drama",60)) ;
          add(new Serie("That '70 show","comedia",25)) ;
      }};

    for(Serie serie : minhasSeries){
        System.out.println(serie.getNome() +" - "+serie.getGenero()+" - "+serie.getTempoEpisodio());
    }


      System.out.println("--\tOrdem de Inserção\t--");
      Set<Serie> minhaSeries1 = new LinkedHashSet<>(){{
          add(new Serie("GOT","fantansia",60)) ;
          add(new Serie("Dark","drama",60)) ;
          add(new Serie("That '70 show","comedia",25)) ;

      }};

     for(Serie serie :minhaSeries1) {
         System.out.println(serie.getNome() +" - "+serie.getGenero()+" - "+serie.getTempoEpisodio());

     }

       System.out.println("--\tOrdem natural(tempo de episaodio)\t--");
        Set<Serie> minhasSerie2 = new TreeSet<>(minhaSeries1);
      for(Serie serie :minhasSerie2) {
          System.out.println(serie.getNome() +" - "+serie.getGenero()+" - "+serie.getTempoEpisodio());

      }
        System.out.println(minhasSerie2);





  }

}

class Serie implements Comparable<Serie>{
    private String nome, genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    public void setTempoEpisodio(Integer tempoEpisodio) {
        this.tempoEpisodio = tempoEpisodio;
    }

    @Override
    public String toString() {
        return "serie{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Serie)) return false;
        Serie serie = (Serie) o;
        return getNome().equals(serie.getNome()) && getGenero().equals(serie.getGenero()) && getTempoEpisodio().equals(serie.getTempoEpisodio());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getGenero(), getTempoEpisodio());
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio =Integer.compare(this.getTempoEpisodio(),serie.getTempoEpisodio());


        if(tempoEpisodio!= 0){
            return tempoEpisodio;
        }


        return this.getGenero().compareTo(serie.getGenero());
    }
}



