/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package insultos;


import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Insultos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File ("insultos.txt");
        File file2 = new File("mensaje.txt");
        FileReader fileReader = null;
        FileReader fileReader2 = null;
        String texto = " ";
        String palabra = " ";
        int i =0;
        
        
        try {
            fileReader = new FileReader(file);
            fileReader2 = new FileReader(file2);
            BufferedReader buffer = new BufferedReader(fileReader);
            BufferedReader buffer2 = new BufferedReader(fileReader2);
            texto = buffer2.readLine();
            String [] array = texto.split(" ");
            System.out.println(Arrays.toString(array));
            
            
            palabra = buffer.readLine();
            while (palabra!=null){
                String [] palabras = palabra.split(";");
                String [][] matriz = new String [100][2];
                matriz[i][0]=palabras[0];
                matriz[i][1]=palabras[1];
                i++;
                palabra=buffer.readLine();
            }
            
            
            
            
        } catch (IOException e){
            System.out.println("error");
        }
    }
    
}
