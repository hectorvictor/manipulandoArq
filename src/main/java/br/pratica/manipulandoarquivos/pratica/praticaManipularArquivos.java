package br.pratica.manipulandoarquivos.pratica;

import java.io.File;
import java.io.IOException;

public class praticaManipularArquivos {
    public static void main(String[] args) throws IOException {
        
        File diretorio = new File("/home/hector/Documentos");
        listarArquivos(diretorio);
        long tamanho = calcularTamanhoDeBytes(diretorio);
        System.out.println("Total de Bytes: " + tamanho);
    }      

    private static long calcularTamanhoDeBytes(File diretorio) {
        File[] arquivos = diretorio.listFiles();

        long tamanho = 0;
        for(File p : arquivos) {
            tamanho += p.length();
        }

        return tamanho;
    }

    private static void listarArquivos(File diretorio) throws IOException {
        File[] arquivos = diretorio.listFiles();

        for(File x : arquivos) {
            System.out.println(x.getCanonicalPath() + " tamanho de bytes: "+x.length());
        }
    }
}
