package aad;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;


public class estructura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Properties properties=new Properties();
		
		InputStream leer=null;
		Path rutas;
		try {
			
			leer=new FileInputStream("D:\\dam2-aadd-ficheros\\src\\acceso.properties");
			properties.load(leer);
			
			rutas=Paths.get(properties.getProperty("ruta1"));
			Files.createDirectories(rutas);

			rutas=Paths.get(properties.getProperty("ruta2"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta3"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta4"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta5"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta6"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta7"));
			Files.createDirectories(rutas);
			
			rutas=Paths.get(properties.getProperty("ruta8"));
			Files.createDirectories(rutas);
			
			
			
		}catch(Exception e) {
			System.out.println("error");
		}
		
	}

}
