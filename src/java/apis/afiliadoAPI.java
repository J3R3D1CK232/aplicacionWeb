/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import jdk.jpackage.internal.IOUtils;

/**
 *
 * @author escob
 */
public class afiliadoAPI {
    
    private String cAfiliadoAfiliado = "";
    private String fNacimientoAfiliado = "";
    
    public String getcAfiliadoAfiliado(){return cAfiliadoAfiliado;}
    public void setAfiliadoAfiliado(String newcAfiliadoAfiliado){this.cAfiliadoAfiliado = newcAfiliadoAfiliado;}
    
    public String getfNacimientoAfiliado(){return fNacimientoAfiliado;}
    public void setfNacimientoAfiliado(String newfNacimientoAfiliado){this.fNacimientoAfiliado = newfNacimientoAfiliado;}
    
    
    public String getAfiliado(String cAfiliado,String fNacimiento){
        String Salida = ""; 
        try{
            URL url = new URL("https://apimibuenseguroapi.azurewebsites.net/api/afiliado/"+cAfiliado+"/"+fNacimiento);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("GET");
            c_api.addRequestProperty("Accept", "application/json");
            switch (c_api.getResponseCode()) {
                case 200:
                    {
                        InputStreamReader entrada = new InputStreamReader(c_api.getInputStream());
                        BufferedReader lectura = new BufferedReader(entrada);
                        Salida = lectura.readLine();
                        break;
                    }
                case 404:
                    {
                        Salida = "¡Afiliado no encontrado!";
                        break;
                    }
                default:
                    Salida = "No se pudo realizar la conexion con la API, Error: "+c_api.getResponseCode();
                    break;
            }
            c_api.disconnect();
        }
        catch(IOException ex){
            System.out.println("Error api: "+ex.getMessage());
        }
        return Salida;
    }
       
}
