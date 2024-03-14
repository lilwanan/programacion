/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package similacro_kiko;


import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Similacro_Kiko {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionPuntoYComa {
        File file = new File("fumada.txt");
        boolean comentatodo=false;
        try{
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);
    
        String linea = buffer.readLine();
        while(linea!=null){
            if((!linea.contains("//")) && (!linea.contains("/*")) && (!linea.contains("*/"))&&(!comentatodo)){
                System.out.println(linea);
            } else if (linea.contains("/*")){
                comentatodo=true;
            } else if (linea.contains("*/")){
                comentatodo=false;
            }
            if(linea.endsWith(" ")){
                throw new ExcepcionPuntoYComa();
            }
            linea=buffer.readLine();
        }
        buffer.close();
        } catch(IOException e){
            System.out.println("error");
        }
    }
    
}
