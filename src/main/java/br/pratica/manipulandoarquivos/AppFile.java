package br.pratica.manipulandoarquivos;

import java.io.File;
import java.io.IOException;

public class AppFile {
    public static void main(String[] args) throws IOException {
        listarArquivosDiretorio();
      
    }

    private static void listarArquivosDiretorio() {
        File diretorio = new File("/home/hector/Documentos");
        File[] nome = diretorio.listFiles();

        for(File p: nome) {
            System.out.println(p.getName()+ "- tamanho: "+ p.length() + " Bytes");

        }
    }


}
