/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apis;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
/**
 *
 * @author escob
 */
public class proveedorAPI {
    private int nit=0,afiliado=0;
    private String fNacimiento="", fCobertura="";
    public String get(){
        String salida="";
        try{
            URL url = new URL("https://apimibuenseguroapi.azurewebsites.net/api/afiliados");
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("GET");
            c_api.addRequestProperty("Accept", "application/json");
            if(c_api.getResponseCode()==200){
                InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                BufferedReader lectura = new BufferedReader(entrada);
                salida = lectura.readLine();
            }
            else{
                System.out.println("No se pudo realizar la conexion con la API: "+c_api.getResponseCode());
            }
            c_api.disconnect();
        }
        catch(IOException ex){
            System.out.println("Error api: "+ex.getMessage());
        }
        return salida;
    }
        
}
