/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAbstratas;

/**
 *
 * @author ThainaRibeiro
 */
public class LiliCarabina extends ABS_Pessoa{ // ao criar lili carabina vou pegar tudo que está em abs pessoa
    public void Cadastrar (String nome){ //subclasse aqui estamos fazendo o que a classe abstrata pede
        System.out.println("vamos cadastrar");
    }
    //extend = intanciação da classe abstrata
    public void Cadastrar (String nome, int idade){ //subclasse 
        System.out.println("vamos cadastrar");
    }
}

