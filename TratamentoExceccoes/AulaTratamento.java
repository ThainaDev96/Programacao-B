/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TratamentoExceccoes;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class AulaTratamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            //int valor = 20/0;cai no erro
            int valor = 20/1;
            String entrada = JOptionPane.showInputDialog(null,"Informe sua idade");
            int idade = Integer.parseInt(entrada);
        }
           catch (NumberFormatException  erroFormatoMatematico)
        {
            System.out.println("erro = "+erroFormatoMatematico.getLocalizedMessage());
            System.out.println("Querido usuário temos um erro "+erroFormatoMatematico.fillInStackTrace());
            JOptionPane.showMessageDialog(null,"Caro usuário acredito que você não sabe que a idade seja em números");
        }
          catch (ArithmeticException  erroMatematico)
        {
            System.out.println("erro = "+erroMatematico.getLocalizedMessage());
            System.out.println("Querido usuário temos um erro "+erroMatematico.fillInStackTrace());
            JOptionPane.showMessageDialog(null,"Caro usuário acredito que você não sabe que não podemos dividir nada por zero");
        }
        catch (Exception e)//O "e" é um apelido pode ser renomeado qualquer coisa  //erro genérico ainda não sei o tipo de erro
        {
            System.out.println("erro generico = "+e.getLocalizedMessage());
            System.out.println("Querido usuário temos um erro "+e.fillInStackTrace());//fillInStackTrace informa o tipo de erro
            JOptionPane.showMessageDialog(null,"Ocorreu um erro");
        }
    }
}