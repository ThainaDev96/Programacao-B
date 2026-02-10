/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IntefaceGrafica;

/**
 *
 * @author ThainaRibeiro
 */
public class Calculadora {

    public Calculadora(){}
    public Calculadora(int soma ,float subtracao , float multiplicacao , float divisao , float campo1 , float campo2 ){
        this.soma = soma;
        this.subtracao = subtracao;
        this.multiplicacao = multiplicacao; 
        this.divisao = divisao;
        this.campo1=campo1;
        this.campo1=campo2;
    } 
    private int soma =0;
    private float subtracao = 0;
    private float multiplicacao= 0;
    private float divisao = 0;
    private float campo1=0;
    private float campo2=0;
    
 public Float getCampo1(){
        return campo1;
    }
    public void setCampo1(Float campo1){
            this.campo1 = campo1;
    }
      public Float getCampo2(){
        return campo2;
    }
    public void setCampo2(Float campo2){
            this.campo2 = campo2;
    }
    
    public Integer getSoma(){
        soma = (int) (getCampo1() + getCampo2());
        return soma;
    }
    public void setSoma(Integer soma){
            this.soma = soma;
    }
      public Float getSubtracao(){
          subtracao = getCampo1() - getCampo2();
        return subtracao;
    }
    public void setSubtracao(Integer subtracao){       
            
            this.subtracao =subtracao;
    }
    public Float getMultiplicacao(){
        multiplicacao = getCampo1() * getCampo2();
        return multiplicacao;
    }
    public void setMultiplicacao(Float multiplicacao){
            this.multiplicacao = multiplicacao;
    }
            
    public Float getDivisao(){
         divisao = getCampo1() / getCampo2();
        return divisao;
    }
    public void setDivisao(Float divisao){
            this.divisao = divisao;
            
       }

       
    public void somar(int campo1, int campo2) {
        int soma  = campo1+campo2;
        System.out.println("A soma eh"+soma);
    }
    public void subtrair(int campo1 , int campo2) {
       int subtracao  = campo1-campo2;
        System.out.println("A subtração eh"+subtracao);
    }
    public void dividir(float campo1 , float campo2) {
        float divisao  = campo1/campo2;
        System.out.println("A divisão eh"+divisao);
    }
    
    public void multiplicar(float campo1 , float campo2) {
        float multiplicacao  = campo1*campo2;
        System.out.println("A multiplicação eh"+multiplicacao);
    }
     
    protected void finalize() {  }


}
    


