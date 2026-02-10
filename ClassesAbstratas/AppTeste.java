/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAbstratas;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class AppTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ABS_Pessoa pessoa= new ABS_Pessoa();está incorreto pois é uma classe abstrata
        LiliCarabina lili = new LiliCarabina();
        lili.Cadastrar("lianderson");
        lili.Cadastrar("lianderson",47);
    }
    
}
