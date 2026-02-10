
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ThainaRibeiroBairros
 */
public class appCalculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calculadora calc = new Calculadora();
        int valor_a = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor A"));
        int valor_b = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o valor B"));
        int soma = calc.adicao(valor_a, valor_b);
        System.out.println("soma = "+soma);
        
        float subtracao = calc.subtracao(valor_a, valor_b);
        System.out.println("subtracao = "+subtracao);
        
         float divisao = calc.divisao(valor_a, valor_b);
        System.out.println("divisao = "+divisao);
        
        float modulo = calc.modulo(valor_a, valor_b);
        System.out.println("modulo = "+modulo);
    }
    }
    

