/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palabrasrepetidas;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

/**
 *
 * @author medac
 */
public class PalabrasRepetidas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        File file = new File("frase2.txt");
        
        ArrayList<String> frase = new ArrayList<>();
        System.out.println("Introduce una frase con espacios: ");
        try {
            FileReader freader = new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);
            String linea = breader.readLine();
            System.out.println(linea);
            String [] array = linea.split(" ");
            for(int i = 0 ; i<array.length ; i++){
                frase.add(array[i]);
            }
            System.out.println(frase);
            for(int i = 0 ; i < frase.size();i++){
                for(int j =i+1;i<frase.size();i++){
                    if(frase.get(i).equals(frase.get(j))){
                        System.out.println("La palabra: " + frase.get(i)+ " está repetida ");
                        frase.remove(i);
                    }
                }
            }
            System.out.println("Las palabras: " +frase + " no están repetidas ");
        } catch (IOException e){
            System.out.println("ERROR");
        }
        
        
        
    }
    
}
