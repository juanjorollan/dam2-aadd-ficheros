package aad;

import java.io.File;
import java.io.IOException;

public class añadir {
    public static void main(String[] args) {
        File directorio = new File("D:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-tmp");
        File archivo = null;
        File[] lista = directorio.listFiles();
        for (int i=0;i<lista.length;i++) {
            archivo = new File (lista[i]+"\\info-fichero.txt");
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.err.println("MAL");
            }
        }
    }

}
