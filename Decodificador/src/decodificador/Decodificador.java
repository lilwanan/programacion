/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decodificador;

import java.io.*;
;

/**
 *
 * @author medac
 */
public class Decodificador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("decode.txt");
        FileReader fileReader = null;
        String frase = " ";
        String [] decode = new String [10];
        
        try {
            fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            frase = buffer.readLine();
            System.out.println(frase);
        }
        catch (IOException e){
            System.out.println("error");
        }
    }
    
}
