package Estrutura_de_dados;

public class Main {
    public static void main( String[] args){
       No no1= new No(" conteudo NO 1");

        No no2= new No(" conteudo NO 2");
        no1.setProximoNO(no2);// o primeiro no apontando para o segundo

        No no3= new No(" conteudo NO 3");
        no2.setProximoNO(no2);

        No no4= new No(" conteudo NO 4");
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
