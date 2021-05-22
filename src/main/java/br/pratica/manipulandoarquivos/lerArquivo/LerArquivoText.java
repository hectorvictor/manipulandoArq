package br.pratica.manipulandoarquivos.lerArquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream; 
import java.io.InputStreamReader;

public class LerArquivoText {
        public static void main(String[] args) throws Exception {

            File diretorio = new File("/home/hector/Documentos/hector/documento");
            InputStream bytes = new FileInputStream(diretorio);

            lerBytesDoDiretorio(diretorio, bytes);            
            lerCaracterDoCiretorio(bytes);
        }

        private static void lerCaracterDoCiretorio(InputStream bytes) throws IOException {
            InputStreamReader isr = new InputStreamReader(bytes);
            System.out.println("==========================================");
            System.out.println("Lendo caracter");
            int a = isr.read();
            System.out.println(a);
            
        }

        private static void lerBytesDoDiretorio(File diretorio, InputStream bytes) throws IOException {

            System.out.println("Lendo os Bytes");
            int b = bytes.read();
            System.out.println(b);
            
                      

          
                        
        }
            

            


            

    

     

    
    
}