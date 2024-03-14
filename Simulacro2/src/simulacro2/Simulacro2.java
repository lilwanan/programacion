/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro2;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Simulacro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionBarra {
        File file1 = new File ("simulacro2.txt");
        File file2 = new File ("simulacro2xd.txt");
        int i =0;
        Inventario [] inventario = new Inventario [100];
        try{
            FileReader fileReader = new FileReader(file1);
            
            BufferedReader buffer = new BufferedReader(fileReader);
            
            String linea = buffer.readLine();
            
            
            
            while(linea!=null){
                if(linea.contains("/")){
                    throw new ExcepcionBarra();
                }
                String [] array = linea.split(":");
                
                System.out.println(Arrays.toString(array));
                
                
                inventario [i] = new Inventario (array[0],Integer.parseInt(array[1]),Integer.parseInt(array[2]));
                i++;
                linea=buffer.readLine();
            }
            for(int j =0;j<inventario.length;j++){
                if(inventario[j]!=null){
                System.out.println(inventario[j]);
                }
            }
            
        } catch (IOException e) {
            System.out.println("error");
        }
        
        catch (ExcepcionBarra e){
            System.out.println(e);
        }
    }
    
}
