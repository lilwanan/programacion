/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dierna;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author medac
 */
public class Dierna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("adn.txt");
        Scanner sc = new Scanner(System.in);
        boolean salir=false;
        int opcion;
        String enfermedad;
        try{
            FileReader f1 = new FileReader(file);
            BufferedReader b1 = new BufferedReader(f1);
            String linea = b1.readLine();
            System.out.println(linea);
        }
        
        
        catch (IOException e){
            System.out.println("ERROR 1");
        }
        
        do{
            System.out.println("Introduce opcion 1.VER CADENA 2.MOSTRAR ENFERMEDAD 3.CAMBIAR ADN");
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                mostrar(file);
                    break;
                    
                case 2:
                  enfermedad = sc.next();
                  try{
                        FileReader f1 = new FileReader(file);
                        BufferedReader b1 = new BufferedReader(f1);
                        String linea = b1.readLine();
                        
                        if(linea.contains(enfermedad)){
                            System.out.println("Tienes la enfermedad");
                            int a=linea.compareTo(enfermedad);
                            System.out.println("Veces: "+Math.abs(a));
                        }
                    }
        
        
                 catch (IOException e){
                        System.out.println("ERROR 1");
                    }
                  break;
                  
                case 3:
                {
                    try {
                        FileReader f1 = new FileReader(file);
                        BufferedReader b1 = new BufferedReader(f1);
                        String linea = b1.readLine();
                        FileWriter fw1 = new FileWriter(file,false);
                        BufferedWriter bw2 = new BufferedWriter(fw1);
                        String linea2;
                        
                        linea2=linea.replace("CAAT", "ACAT");
                        bw2.write(linea2);
                        bw2.close();PENE
                        
                    } catch (IOException e) {
                        System.out.println("ERROR2");
                    }
                }

            }
            
        } while(salir=true);
    }
    
   public static void mostrar(File file){
        try{
            FileReader f1 = new FileReader(file);
            BufferedReader b1 = new BufferedReader(f1);
            String linea = b1.readLine();
            System.out.println(linea);
        }
        
        
        catch (IOException e){
            System.out.println("ERROR 1");
        }
   }
    
}
