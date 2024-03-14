    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bomba;

import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class Bomba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("ciudad.txt");
        FileReader fileReader = null;
        String frase = " ";
        String [] ciudad = new String[8];
        String [] codificador = new String [26];
        
        try {
           
            fileReader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(fileReader);
            frase = buffer.readLine();
            codificador[0] = "._";
            codificador[1] = "_...";
            codificador[2] = "_._.";
            codificador[3] = "_..";
            codificador[4] = ".";
            codificador[5] = ".._.";
            codificador[6] = "__.";
            codificador[7] = "....";
            codificador[8] = "..";
            codificador[9] = ".___";
            codificador[10] = "_._";
            codificador[11] = "._..";
            codificador[12] = "__";
            codificador[13] = "_.";
            codificador[14] = "___";
            codificador[15] = ".__.";
            codificador[16] = "__._";
            codificador[17] = "._.";
            codificador[18] = "...";
            codificador[19] = "_";
            codificador[20] = ".._";
            codificador[21] = "..._";
            codificador[22] = ".__";
            codificador[23] = "_.._";
            codificador[24] = "_.__";
            codificador[25] = "__..";
            
            ciudad [0] = codificador [19]; 
            ciudad [1] = codificador [14]; 
            ciudad [2] = codificador [13]; 
            ciudad [3] = codificador [0]; 
            ciudad [4] = codificador [0]; 
            ciudad [5] = codificador [21]; 
            ciudad [6] = codificador [8]; 
            ciudad [7] = codificador [2]; 
            System.out.println(Arrays.toString(ciudad));
            
            
        } catch (IOException e){
            System.out.println("error");
        }
        
        try{
          FileWriter fileWriter = new FileWriter("codificador.txt",false);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          for(int i =0;i<ciudad.length;i++){
              bufferedWriter.write(ciudad[i]);
          }
          bufferedWriter.close();
        } catch(IOException e){
            System.out.println("error");
        }
    }
    
}
