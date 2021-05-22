package br.pratica.estudo20210555;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class AppArquivo {
    public static void main(String[] args) throws IOException {
        
        File arquivo = new File("/home/hector/Documentos/teste");
        //criarPasta(arquivo);
        //escreverArquivos(arquivo);
        lerArquivo(arquivo);
        


    }

    private static void lerArquivo(File arquivo) throws IOException {
        FileReader ler = new FileReader(arquivo);
        char[] in = new char[6];
        int size = ler.read(in);
        int i = 0;
        while(size != -1) {
            System.out.print(in);
            size = ler.read();
            i++;
        }
        
        System.out.println(i);

        
        
    }

    private static void escreverArquivos(File arquivo) throws IOException {
        FileWriter escrever = new FileWriter(arquivo);

        escrever.write("Hector\n");

        escrever.flush();
        escrever.close();
        
    }

    private static void criarPasta(File arquivo) throws IOException {
        boolean criado = arquivo.createNewFile();     
        System.out.println(criado);
    }
    
} 
        
        
    
    
