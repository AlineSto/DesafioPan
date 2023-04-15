package TratamentoExcecoes;

import javax.swing.*;

// fazer a divisao de dois valores inteiros
public class Unchecked_Exception {
    public static void main (String [] args){
        String a= JOptionPane.showInputDialog("Numerador: ");
        String b= JOptionPane.showInputDialog("Denominador: ");
      try{
          int resultado =dividir( Integer.parseInt(a),Integer.parseInt(b));
          System.out.println("Resultado: "+resultado);
        }catch (NumberFormatException e){
          //e.printStackTrace();  apresanta os linhas que estao
          //apresentando o erro no codigo
          JOptionPane.showMessageDialog(null,"Entrada invalida, informe um numero inteiro");
      } catch (ArithmeticException e){
            //e.printStackTrace();  apresanta os linhas que estao
            //apresentando o erro no codigo
            JOptionPane.showMessageDialog(null,"Impossivel dividir o numero por zero");
        }

      finally {

          System.out.println("chegou no finaly...");
      }
        System.out.println("O codigo continua ");
    }
    public static  int dividir( int a,int b){
        return a/b;
    }
}

