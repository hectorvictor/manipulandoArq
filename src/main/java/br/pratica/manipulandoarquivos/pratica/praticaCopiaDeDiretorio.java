package br.pratica.manipulandoarquivos.pratica;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class praticaCopiaDeDiretorio {
    public static void main(String[] args) throws Exception {
        String origem = "/home/hector/Documentos/bianca";
        String destino = "/home/hector/Documentos/test";

        copiarDiretorio(origem, destino);

    }

    private static void copiarDiretorio(String origem, String destino) throws Exception {
		File diretórioOrigem = new File(origem);
		File[] arquivosOrigem = diretórioOrigem.listFiles();
		for (File arquivo : arquivosOrigem) {
			copiarArquivo(arquivo.getCanonicalPath(), destino + "/" + arquivo.getName());
		}		
	}

    private static void copiarArquivo(String origem, String destino) throws IOException {
        File arquivoOrigem = new File(origem);
        File arquivoDestino = new File(destino);

        FileInputStream input = new FileInputStream(arquivoOrigem);
        FileOutputStream output = new FileOutputStream(arquivoDestino);

        int dado = input.read();

        while(dado != -1) {
            System.out.println("=");
            output.write(dado);
            dado = input.read();
        }

        input.close();
        output.close();
        

    }
}
