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
public class Pessoa {
public Pessoa(){}//construtor
public Pessoa(String nome){ 
     this.nome  = nome; //Serve para referir-se ao atributo
        
}
    private String nome ="";

     public String getNome(){
        return nome;
    }
    public void setNome(String nome){
            this.nome = nome;
    }
    
   protected void finalize() {  }//Descontrutor
}

