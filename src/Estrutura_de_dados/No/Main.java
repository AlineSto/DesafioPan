package Estrutura_de_dados.No;

public class Main {
    public static void main( String[] args){
       No<String> no1= new No<>(" conteudo NO 1");

        No<String> no2= new No<>(" conteudo NO 2");
        no1.setProximoNO(no2);// o primeiro no apontando para o segundo

        No<String> no3= new No<>(" conteudo NO 3");
        no2.setProximoNO(no2);

        No<String> no4= new No<>(" conteudo NO 4");
        no2.setProximoNO(no3);

        System.out.println(no1);
        System.out.println(no1.getProximoNO());

        System.out.println("----------");

        System.out.println(no1);
        System.out.println(no1.getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO());
        System.out.println(no1.getProximoNO().getProximoNO().getProximoNO().getProximoNO());
    }
}
