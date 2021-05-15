package br.pratica.manipulandoarquivos;

import java.io.File;
import java.io.IOException;

import javax.swing.text.html.HTMLDocument.HTMLReader.TagAction;

public class AppFile {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("/home/hector/Documentos");
        listarArquivosDiretorio(diretorio);
        long tamanhoEmBytesDiretorio = calcularTamanhoBytesDoDiretorio(diretorio);
        System.out.println("Tamanho total:" + tamanhoEmBytesDiretorio + " bytes");
      
    }

    private static long calcularTamanhoBytesDoDiretorio(File diretorio) {
        long tamanho = 0;
        File[] arquivo = diretorio.listFiles();

        for(File p: arquivo) {
            tamanho += arquivo.length;
        }     


        return tamanho;
    }

    private static void listarArquivosDiretorio(File diretorio) {
        File[] arquivo = diretorio.listFiles();

        for(File p: arquivo) {
            System.out.println(p.getName()+ "- tamanho: "+ p.length() + " Bytes");

        }
    }


}
