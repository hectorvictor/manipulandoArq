package br.pratica.estudo20210555;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppArquivo {
    public static void main(String[] args) throws IOException {
        
        File arquivo = new File("/home/hector/Documentos/teste");
        //criarPasta(arquivo);
        escreverArquivos(arquivo);
        //lerArquivo(arquivo);    


    }

    

    private static void lerArquivo(File arquivo) throws IOException {
        FileReader ler = new FileReader(arquivo);
        /*char[] in = new char[6];
        int size = ler.read(in);
        int i = 0;
        while(size != -1) {
            System.out.print(in);
            size = ler.read();
            i++;
        }        
        System.out.println(i);   */   
        
        lerArquivoBuffered(ler); 
        
    }

    private static void lerArquivoBuffered(FileReader ler) throws IOException {
        BufferedReader lerArquivosBuffered = new BufferedReader(ler);
        String c = null;
        while((c = lerArquivosBuffered.readLine()) != null) {
            System.out.println(c);
        }

        lerArquivosBuffered.close();
    }



    private static void escreverArquivos(File arquivo) throws IOException {
        FileWriter escrever = new FileWriter(arquivo);        
       /* escrever.write("Hector\n");
        escrever.flush();
        escrever.close(); */

        escreverArquivosBuffered(escrever);
        
    }

    private static void escreverArquivosBuffered(FileWriter escrever) throws IOException {

        BufferedWriter escreverBuffered = new BufferedWriter(escrever);
        escreverBuffered.write("Ola Mundo!!");
        escreverBuffered.flush();
        escreverBuffered.close();
        
    }



    private static void criarPasta(File arquivo) throws IOException {
        boolean criado = arquivo.createNewFile();     
        System.out.println(criado);
    }
    
} 
        
        
    
    
