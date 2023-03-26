package Estrutura_de_dados.Conceitos.Set;

import java.util.Objects;

public class CarroSet implements Comparable<CarroSet> {
String marca;
    public CarroSet (String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;// testar o objeto que estancie é igual ao objeto que coloquei como paramentro
        if (o == null || getClass() != o.getClass()) return false; // testa se o objeto é nulo ou a classe
        // desse objeto que estou comprando com o outro objeto e diferente
        CarroSet carro = ( CarroSet ) o; // cria o objeto carro
        return marca.equals(carro.marca); // retorna se o objeto é igual ao outro,levando em consideração o atributo marca
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); // ultiliza o metodo hascod da classe obj
        // retorna um numero inteiro, retorna um hash gerado a partir do atributo marca
    }

    @Override
    public String toString() {
        return "CarroSet {" +
                "marca='" + marca + '\'' +
                '}';
    }

   /* @Override
    public int compareTo(CarroSet o) {
        // implementar pelo tamanho da string
        if(this.marca.length() < o.marca.length()){
            return -1;
        }else if( this.marca.length() > o.marca.length()){
            return 1;
        }
        return 0;// se a quantidade de string das palavras for igual, so exibe o primeiro da fila da arvore
    }*/

    // adicionar na arvore por ordem alfabetica
    @Override
    public int compareTo(CarroSet o) {
        return  this.getMarca().compareTo(o.getMarca());// faz a comparação por ordem alfabetica
    }




}
