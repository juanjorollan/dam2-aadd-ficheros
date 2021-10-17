package aad;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class gson {
    public static void main(String[] args) {

        File fichero = new File ("D:\\dam2-aadd-ficheros\\src\\json.json");
        String resultado="";

        try {
            resultado = new String (Files.readAllBytes(fichero.toPath()), StandardCharsets.UTF_8);
            System.out.println(resultado);
        } catch (Exception e) {

        }

        JsonObject json = JsonParser.parseString(resultado).getAsJsonObject();

        String ruta = json.get("ruta1").getAsString();
        File archivo2 = new File(ruta);
        archivo2.mkdirs();

        String ruta1 = json.get("ruta2").getAsString();
        archivo2 = new File(ruta1);
        archivo2.mkdirs();

        String ruta2 = json.get("ruta3").getAsString();
        archivo2 = new File(ruta2);
        archivo2.mkdirs();

        String ruta3 = json.get("ruta4").getAsString();
        archivo2 = new File(ruta3);
        archivo2.mkdirs();

        String ruta4 = json.get("ruta5").getAsString();
        archivo2 = new File(ruta4);
        archivo2.mkdirs();

        String ruta5 = json.get("ruta6").getAsString();
        archivo2 = new File(ruta5);
        archivo2.mkdirs();

        String ruta6 = json.get("ruta7").getAsString();
        archivo2 = new File(ruta6);
        archivo2.mkdirs();

        String ruta7 = json.get("ruta8").getAsString();
        archivo2 = new File(ruta7);
        archivo2.mkdirs();

    }
}
