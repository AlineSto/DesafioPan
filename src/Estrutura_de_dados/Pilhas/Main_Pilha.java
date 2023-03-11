package Estrutura_de_dados.Pilhas;

import java.sql.SQLOutput;

public class Main_Pilha {
    public static void main(String[] args){
        Pilha minhaPilha = new Pilha();
        minhaPilha.push(new No_pilha(1));
        minhaPilha.push(new No_pilha(2));
        minhaPilha.push(new No_pilha(3));
        minhaPilha.push(new No_pilha(4));
        minhaPilha.push(new No_pilha(5));
        minhaPilha.push(new No_pilha(6));


        System.out.println(minhaPilha);

     // pop vai remover o ultimo da pilha
        System.out.println(minhaPilha.pop());
        System.out.println(minhaPilha);










    }
}
