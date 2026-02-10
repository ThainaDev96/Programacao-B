/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExercicioEndereco;

/**
 *
 * @author ThainaRibeiro
 */
public class Escola {
    public Escola(){}//construtor
    public Escola(String nome, String cnpj){ //criação da escola
        this.nome  = nome; //Serve para referir-se ao atributo
        this.cnpj = cnpj;
          
}
        
    private String nome ="";
    private String cnpj = "";
    private String sala = "";
   
     public String getNome(){
        return nome;
    }
    public void setNome(String nome){
            this.nome = nome;
    }
      public String getCnpj(){
        return cnpj;
    }
    public void setCnpj(String cnpj){
            this.cnpj = cnpj;
    }
    
    public String getSala() {//sala pois refere-se a classe sala
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
   
    public void adicionarSala(String sala){ // Método
        System.out.println("Você adicionou a sala " + sala);
    }
            
      protected void finalize() {  }//Descontrutor
}


