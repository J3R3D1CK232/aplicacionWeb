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
    
    private String nProveedor = "";
    private String cAfiliado = "";
    private String fNacimiento = "";
    private String fCobertura = "";
    
    public String getnProveedor(){return nProveedor;}
    public void setnProveedor(String newnProveedor){this.nProveedor = newnProveedor;}
    
    public String getcAfiliado(){return cAfiliado;}
    public void setcAfiliado(String newcAfiliado){this.cAfiliado = newcAfiliado;}
    
    public String getfNacimiento(){return fNacimiento;}
    public void setfNacimiento(String newfNacimiento){this.fNacimiento = newfNacimiento;}
    
    public String getfCobertura(){return fCobertura;}
    public void setfCobertura(String newfCobertura){this.fCobertura = newfCobertura;}
    
    public String getProveedor(String cProveedor,String nAfiliado,String fNacimientoN, String fCoberturaN){
        String Salida = "";      
        try{
            URL url = new URL("https://apimibuenseguroapi.azurewebsites.net/api/proveedor/"+cProveedor+"/"+nAfiliado+"/"+fNacimientoN+"/"+fCoberturaN);
            HttpURLConnection c_api = (HttpURLConnection) url.openConnection();
            c_api.setRequestMethod("POST");
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
