/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioEndereco;

import javax.swing.JOptionPane;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Criação do endereço
    String estado = JOptionPane.showInputDialog(null,"Informe seu Estado");
    String cidade = JOptionPane.showInputDialog(null,"Informe sua Cidade");
    String bairro = JOptionPane.showInputDialog(null,"Informe seu Bairro");
    String rua = JOptionPane.showInputDialog(null,"Informe sua Rua");
    String cep = JOptionPane.showInputDialog(null,"Informe seu Cep");
    String telefone = JOptionPane.showInputDialog(null,"Informe seu Telefone");   
    
    Endereco endUsuario = new Endereco(estado , cidade , bairro , rua , cep , telefone);
    //Tudo da classe endereço foi instaciando para EndUsuario
    
    //criação de escola
    String nome = JOptionPane.showInputDialog(null,"Informe o nome da Escola");
    String cnpj = JOptionPane.showInputDialog(null,"Informe o Cnpj");
   
    Escola esc = new Escola (nome , cnpj);
    
    System.out.println("Escola: " + esc.getNome() + "\n");
    System.out.println("Cnpj: " + esc.getCnpj() + "\n");
    System.out.println("Endereço: \n" );
    System.out.println(endUsuario.getEstado());//get retorna o valor do atributo que esta na classe endereço
    System.out.println(endUsuario.getCidade());
    System.out.println(endUsuario.getBairro());
    System.out.println(endUsuario.getRua());
    System.out.println(endUsuario.getCep());
    System.out.println(endUsuario.getTelefone());
    
    //criação da sala
    Sala sala1 = new Sala("A");
    Sala sala2 = new Sala("B");
    
    esc.adicionarSala(sala1.getNomeSala());//Método adicionar sala
    esc.adicionarSala(sala2.getNomeSala());
    
    String nomeAluno1 = JOptionPane.showInputDialog(null, "Infome o nome do aluno 1: ");
    String nomeAluno2 = JOptionPane.showInputDialog(null, "Infome o nome do aluno 2: ");
    
    Pessoa aluno1 = new Pessoa(nomeAluno1);
    Pessoa aluno2 = new Pessoa(nomeAluno2);
    
    sala1.adicionarAluno(aluno1.getNome(), sala1.getNomeSala());//Método adicionar o aluno
    sala2.adicionarAluno(aluno2.getNome(), sala2.getNomeSala());
    
    sala1.transferir(aluno1.getNome(), sala1.getNomeSala(), sala2.getNomeSala());//Metódo para transferir aluno
   
    
   
   
    
    }
            
}
      
   
    
    

