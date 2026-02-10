/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioEndereco;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Sala {
    public Sala(){}//construtor
    public Sala( String nomeSala){ //sobrecarga de construtores
         this.nomeSala  = nomeSala; //Serve para referir-se ao atributo
    
    }
    private String nomeSala = "";
    
    public String getNomeSala() {
        return nomeSala;
    }
    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
    public void transferir(String aluno , String salaAtual, String salaDestino){ //Método
        System.out.println("Voce trocou o aluno " + aluno + " da sala " + salaAtual + " para a sala " + salaDestino);
    }
    
    public void adicionarAluno(String aluno, String sala) {
        System.out.println("Voce adicinou o aluno " + aluno + "à sala " + sala);
    }
    
    public void removerAluno(String aluno, String sala) {
        System.out.println("Voce removeu o aluno " + aluno + "à sala " + sala);
    }
   
    protected void finalize() {  }//Descontrutor
}
