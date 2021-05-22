package br.pratica.estudo20210555;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppArquivo {
    public static void main(String[] args) throws IOException {
        
        File arquivo = new File("/home/hector/Documentos/teste");
        //criarPasta(arquivo);
        //escreverArquivos(arquivo);
        


    }

    private static void escreverArquivos(File arquivo) throws IOException {
        FileWriter escrever = new FileWriter(arquivo);

        for(int i=0; i< 100; i++) {
            escrever.write("Hector\n");

        }
        escrever.flush();
        escrever.close();
        
    }

    private static void criarPasta(File arquivo) throws IOException {
        boolean criado = arquivo.createNewFile();     
        System.out.println(criado);
    }
    
} 
        
        
    
    
