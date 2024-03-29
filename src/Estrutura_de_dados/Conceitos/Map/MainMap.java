package Estrutura_de_dados.Conceitos.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
estudando a interface Map, HasMap
 */
public class MainMap {
    public static void main(String [] args){

        Map<String,String> aluno = new HashMap<>();// dentro do map pede a chave e valor
        // criar alunos
        aluno.put("Nome"," Joao");
        aluno.put("Idade"," 17");
        aluno.put("Media"," 8.5");
        aluno.put("Turma"," 3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());// retornar as chaves da estrutura aluno
        System.out.println(aluno.values());// retorna os valores correspondente a cada chave

        // criar uma lista de alunos
        List<Map<String,String>> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");

        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }



}


