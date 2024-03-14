/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacro;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Simulacro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("fumada.txt");
        FileReader fileReader = null;
        String texto = " ";
        String texto2 = " ";
        int i =0;
        
        
        try {
            fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            texto = buffer.readLine();
            while(texto!=null){
                texto2=texto2+texto+ '\n';
                
                String [] array = texto.split(" ");
                
                System.out.println(Arrays.toString(array));
                String [][] array2 = new String [100][2];
                array2[i][0] = array[0];
                array2[i][1] = " ";
                i++;
                texto=buffer.readLine();
            }
            System.out.println(texto2);
            
        } 
        catch ( IOException e) {
            System.out.println("error");
        }
    }
    
}
