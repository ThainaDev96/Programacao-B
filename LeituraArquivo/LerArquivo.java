/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LeituraArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author ThainaRibeiroBairros
 */
public class LerArquivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            //String nome = "c://lili/arquivo.txt";
            
            FileReader arq = new FileReader("c://lili/arquivo.txt");
            BufferedReader lerArq = new  BufferedReader(arq);
            String linha = lerArq.readLine(); // le a primeira linha
            //a variavel "linha" recebe o valor "null" quando o processo de 
            //repetição atingir o final do arquivo texto
            while(linha!=null){
                System.out.printf("%s\n",linha);
                linha = lerArq.readLine();//le da segunda até a última linha
            }
            arq.close();
        }catch(IOException e){
            System.err.printf("Erro na abertura do arquivo: %s.\n",e.getMessage());
        } System.out.println();
    }   
    
}
