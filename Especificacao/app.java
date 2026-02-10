/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Especificacao;

/**
 *
 * @author ThainaRibeiro
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Documento doc1 = new Documento();
        doc1.nome = "alfredo";
        doc1.foto = "impg1.png";
         doc1.codigo = 12346;
        Documento doc2 = new Documento();
        doc2.nome = "Juliana";
        doc2.foto = "img4.png";
        doc2.codigo = 789012;
        
        Carros fiesta= new Carros();
        fiesta.numeroIdentificacao = 10;
        fiesta.ligar();
    }
    
}

