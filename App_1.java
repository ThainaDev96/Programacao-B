/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class App_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //Pessoa cad_pessoa = new Pessoa("Thaina","Ribeiro");
     Pessoa cad_pessoa = new Pessoa(15f);
     
     
        cad_pessoa.nome="lianderson";
        cad_pessoa.cpf="891.897";
        
        Pessoa cad_pessoa1 = new Pessoa();
        cad_pessoa.nome="agshfdh";
        
        int idade_inicial = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano que nasceu"));
         int idade_final = Integer.parseInt(JOptionPane.showInputDialog(null,"Informe o ano final"));
    
        cad_pessoa.calcularIdade(idade_inicial,idade_final);
        cad_pessoa.calcularIdade(1988,2048);
        
        cad_pessoa.pegarAltura();
        int temporario = cad_pessoa.pegarAltura(10);
        System.out.println("Altura"+cad_pessoa.pegarAltura(10)+"cm" );
        
        System.out.println("Altura"+temporario+"cm" );
    
    }
}
    
    

