package br.pratica.manipulandoarquivos.pratica20210519;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/hector/Documentos/bruno");
        boolean x = file.createNewFile();
        System.out.println(file.exists());
        System.out.println(file.delete());
        System.out.println(file.canRead());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        System.out.println(x);
    }

    
    
}