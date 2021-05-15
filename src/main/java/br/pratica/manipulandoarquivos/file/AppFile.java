package br.pratica.manipulandoarquivos.file;

import java.io.File;
import java.io.IOException;



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

        for(File x: arquivo) {
            if(x.isDirectory()) {
                tamanho += calcularTamanhoBytesDoDiretorio(x);
            }else {
                tamanho += x.length();

            }
        }     
        return tamanho;
    }

    private static void listarArquivosDiretorio(File diretorio) throws IOException {
        File[] arquivo = diretorio.listFiles();

        for(File p: arquivo) {
            if(p.isDirectory()) {
                listarArquivosDiretorio(p);
            }
            System.out.println(p.getCanonicalPath()+ "- tamanho: "+ p.length() + " Bytes");

        }
    }


}
