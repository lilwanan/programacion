/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectolecturaescritura;


import java.io.*;
/**
 *
 * @author medac
 */
public class ProyectoLecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file= new File("inspector.txt");
        
        char[]letras=new char[20];
        try{
            
        if(file.canRead()){
            System.out.println("Se puede leer");
            FileReader fileReader = new FileReader(file);
            
            int num = fileReader.read();
            while(num!=-1){
            char letra = (char) num;
            System.out.print(letra); // Guarda caracter a caracter
            
            num=fileReader.read();
            
            for (int i =0;i<letras.length;i++){
                
                letras[i]=letra;
                num=fileReader.read();
                letra = (char)num;
                System.out.print(letras[i]);
                
            }
            num=fileReader.read();
            
            }

            
        }
        else {
            System.out.println("No se puede leer");
        }
        }
        catch(IOException e){
            System.out.println("error al leer archivo");
        }
        
    }
    
}
