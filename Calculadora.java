/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ThainaRibeiro
 */
public class Calculadora {
 
   
    //funções
     public int adicao(int valor_a , int valor_b ){
         
         int calcula = valor_a + valor_b;
          return calcula;
     }
          
          public int subtracao(int valor_a , int valor_b ){
         
         int subtracao = valor_a - valor_b;
          return subtracao;
          }
          public float divisao(float valor_a , float valor_b ){
         
         float divisao = valor_a / valor_b;
          return divisao;
          
     }
          public float modulo(float valor_a , float valor_b ){
         
         float modulo = valor_a % valor_b;
          return modulo;
       
       
          }
}

