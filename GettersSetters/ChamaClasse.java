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
public class ChamaClasse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // ClassePublica lili_publico = new ClassePublica();
        //lili_publico.nome = "thaina";     CLASSE PUBLICA
        
        CarroCorrida corrida_maluca = new CarroCorrida();
        corrida_maluca.setNumeroIdentificacao(15);
        int var = corrida_maluca.getNumeroIdentificacao();
        System.out.println("valor"+var);
    }
    
}

