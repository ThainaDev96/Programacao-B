package LeituraArquivo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class CriarArquivo {
 
public static void main(String[] args) throws IOException {
    Scanner ler = new Scanner(System.in);
    int i, n;
    System.out.printf("Informe o número para a tabuada:\n");
    n = ler.nextInt();
   /*int i, n;      
    n =Integer.parseInt(JOptionPane.showInputDialog(null,"Informe um numero"));*/
    
    FileWriter arq = new FileWriter("c:\\arqu\\tabuada.txt");///informa o caminho do arquivo
    PrintWriter gravarArq = new PrintWriter(arq);
 
    gravarArq.printf("+--Resultado--+%n"); // grava o arquivo
    for (i=1; i<=10; i++) {
      gravarArq.printf("| %3d X %d = %3d |%n", i, n, (i*n)); //grava arquivo
    }
    gravarArq.printf("+-------------+%n");
 
    arq.close();//Fecha o arquivo
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"c:\\tabuada.txt\".\n", n);
  }
 
 
}
 