package aad;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.Scanner;

public class xml{
	

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		switch(numero) {
		case 1:
			estructura.main(args);
		case 2:
			gson.main(args);
		case 3:
			xml.main(args);
		default:
			System.out.println("Error, número inválido");
		
		File archivo = new File("D:\\dam2-aadd-ficheros\\src\\xml.xml");
		try {
			DocumentBuilderFactory configuracion = DocumentBuilderFactory.newInstance();
			DocumentBuilder generar = configuracion.newDocumentBuilder();
			Document documento = generar.parse(archivo);
			documento.getDocumentElement().normalize();	
			NodeList nList = documento.getElementsByTagName("rutas");
			for(int temp = 0; temp < nList.getLength(); temp++) {
				  Node nNode = nList.item(temp);
				  if(nNode.getNodeType() == Node.ELEMENT_NODE) {
				    Element elemento = (Element) nNode;
				    Path archivos = Paths.get(elemento.getAttribute("ruta1"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta2"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta3"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta4"));
				    Files.createDirectories(archivos);
				     archivos = Paths.get(elemento.getAttribute("ruta5"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta6"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta7"));
				    Files.createDirectories(archivos);
				    archivos = Paths.get(elemento.getAttribute("ruta8"));
				    Files.createDirectories(archivos);
				  } 
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}