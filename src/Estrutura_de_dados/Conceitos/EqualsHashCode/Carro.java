package Estrutura_de_dados.Conceitos.EqualsHashCode;

import java.util.Objects;
// entendendo o equals e hasCode
public class Carro {
    String marca;

    public Carro(String marca) {
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
        Carro carro = (Carro) o; // cria o objeto carro
        return marca.equals(carro.marca); // retorna se o objeto é igual ao outro,levando em consideração o atributo marca
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca); // ultiliza o metodo hascod da classe obj
        // retorna um numero inteiro, retorna um hash gerado a partir do atributo marca
    }
}
