package br.pratica.manipulandoarquivos.copiaArquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class AppCopiaDeArquivos {
    public static void main(String[] args) throws Exception {
        String origem = "/home/hector/Documentos/bianca/hetore/teste";
        String destino = "/home/hector/Documentos/teste.text.bkp";

        copiarArquivos(origem, destino);


    }

    private static void copiarArquivos(String origem, String destino) throws Exception {

        // endereço onde está o arquivo de origem(ele abre o arquivo)
        File arquivoOrigem = new File(origem);

        // endereço onde está o arquivo de destino(ele abre o arquivo)
        File arquivoDestino = new File(destino);

        //faz parte da leitura de dados dos arquivos de origem.
        FileInputStream input = new FileInputStream(arquivoOrigem);

        FileOutputStream output = new FileOutputStream(arquivoDestino);

        int dado = input.read();
        while(dado != -1) {
            System.out.print("=");
            output.write(dado);
            dado = input.read();
        }

        input.close();
        output.close();
    }
}
