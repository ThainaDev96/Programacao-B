/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GettersSetters;

/**
 *
 * @author ThainaRibeiro
 */
public class CarroCorrida {
    //Estado
    private Integer numeroIdentificacao= 0;
    private Double velocidadeAtual = 0.0;
    private Double velocidadeMaxima = 100.0;

    public Integer getNumeroIdentificacao(){
        return numeroIdentificacao;
    }
    public void setNumeroIdentificacao(Integer numeroIdentificacao){
            this.numeroIdentificacao = numeroIdentificacao+15;//faz refencia ao objeto
}
}


