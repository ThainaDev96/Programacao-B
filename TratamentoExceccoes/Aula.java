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
public class Aula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
         int valor = 1/1;
         float n = Float.parseFloat( JOptionPane.showInputDialog(null,"Informe sua idade"));
        }   
        
           catch (NumberFormatException  erroFormato)
        {
            System.out.println("erro = "+erroFormato.getLocalizedMessage());
            System.out.println("Querido usuário temos um erro "+erroFormato.fillInStackTrace());
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
     finally{
            System.out.println("Finalmente");
        }
    }
}



