/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buffered;


import java.io.*;

/**
 *
 * @author medac
 */
public class Buffered {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file= new File ("inspector.txt");
        
        String frase=" ";
        String frase2=" ";
        FileReader fileReader=null;
        
        try{
            fileReader = new FileReader(file);
            BufferedReader bufferedReader= new BufferedReader(fileReader);
            frase = bufferedReader.readLine();
            while(frase!=null){
                frase2=frase2+frase+'\n';
                frase=bufferedReader.readLine();
            }
            System.out.println(frase2);
            //System.out.println(frase);
            
            bufferedReader.close();
        }
        catch(IOException e){
            System.out.println("error");
        }
        
        
        try{
          FileWriter fileWriter = new FileWriter(file,false);
          BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
          bufferedWriter.write("adios");
          bufferedWriter.newLine();
          bufferedWriter.write("que tal");
          bufferedWriter.close();
        } catch(IOException e){
            System.out.println("error");
        }
    }
    
}
