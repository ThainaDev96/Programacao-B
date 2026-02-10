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
public class Endereco {
public Endereco(){}//construtor
public Endereco(String estado, String cidade, String bairro , String rua , String cep , String telefone){ 
    this.estado  = estado; //Serve para referir-se ao atributo
    this.cidade = cidade;
    this.bairro = bairro;
    this.rua = rua;
    this.cep = cep;
    this.telefone = telefone;
}
    private String estado ="";
    private String cidade = "";
    private String bairro ="";
    private String rua = ""; 
    private String cep = "";
    private String telefone = "";
    
    //get retorna o valor
  public String getEstado(){
        return estado;
    }
    //set atribui ao valor
    public void setEstado(String estado){
            this.estado = estado;
    }
      public String getCidade(){
        return cidade;
    }
    public void setCidade(String Cidade){
            this.cidade = cidade;
    }
    public String getBairro(){
        return bairro;
    }
    public void setBairro(String bairro){
            this.bairro = bairro;
    }
            
    public String getRua(){
        return rua;
    }
    public void setRua(String rua){
            this.rua = rua;
            
       }
    public String getCep(){
        return cep;
    }
    public void setCep(String cep){
            this.cep = cep;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
            this.telefone = telefone;
    }
      protected void finalize() {  }
}


        
  