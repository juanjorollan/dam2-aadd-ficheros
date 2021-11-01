package aad;

import java.io.File;

public class borrar {
	
    public static void borra(File archivo) { 
        if (archivo.exists()) {
            if (archivo.isFile()) {
                archivo.delete();
            }else {
                File f[]=archivo.listFiles();
                for (int i = 0; i < f.length; i++) {
                    borra(f[i]);
                }
                archivo.delete();
            }
        }
    }
    
    public static void main(String[] args) {
        File archivo=new File("D:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-TMP");
        borra(archivo);
    }

}