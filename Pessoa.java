/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThainaRibeiroBairros
 */
public class Pessoa {
    public Pessoa(){}//construtor(fica sempre no topo do projeto)
        public Pessoa(String nome){//sobrecarga de construtores
            System.out.println("Seu nome é "+nome);//Ex: Valida o nome do usuario
        }
          public Pessoa(String nome , String sobrenome){
            System.out.println("Seu nome é "+nome);
              System.out.println("Sera executado quando for informado nome e sobrenome"+sobrenome);//Para cadastro do usuario 
          }
             public Pessoa(Float valor){//Para valores flutuantes
            System.out.println("Calculo com float");
            System.out.println("Seu nome é "+valor);
             }

    int id = 0;
    String nome = "";
    String data_nascimento = "";
    String cpf = "891.222.080-21";
    String email = "";
    String telefone = "";
    String data_cadastro = "";

    void calcularIdade(int data_nascimento, int ano) //void é Procedimento
    {
        /*data_nascimento = data_nascimento - 7;
        System.out.println("voce nasceu em "+  data_nascimento);*/

        data_nascimento = ano - data_nascimento;
        System.out.println("Sua idade eh " + data_nascimento);

        if (data_nascimento >= 30) {
            System.out.println("Voce viveu bastante");
        }
    }

    //Funções(retorna algo)
    public int pegarAltura(int cm_altura) {
        int altura = 185 + cm_altura;
        return altura;
        //return 10;
    }

    void pegarAltura() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
