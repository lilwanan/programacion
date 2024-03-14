/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damdental;

import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
/**
 *
 * @author medac
 */
public class DAMDental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file1 = new File("pacientes.txt");
        File file2 = new File("config.txt");
        Paciente [] pacientes = new Paciente [100];
        int cont=0;
        int configcont=4;
        int contador=0;
        System.out.println("Bienvenido a DAMDental tu clinica de ensueño");
        System.out.println("La clínica te proporciona las siguientes opciones : 1.CREAR PACIENTE 2.VER PACIENTES 3.SONDAJE 4.SALIR");
        int menu ;
        boolean salir=false;
        

        
        
        do{
        menu = sc.nextInt();
        
        switch (menu){
            case 1:
                
                try{
                    
                    FileReader fReader2 = new FileReader(file2);
                    BufferedReader buffer4 = new BufferedReader(fReader2);
                    String linea2=buffer4.readLine();
                    System.out.println(linea2);
                    buffer4.close();
                    
                    
                    
                }
                catch (IOException e){
                    System.out.println("Error 1");
                }
                
                
                try{
                    FileWriter fWriter = new FileWriter("pacientes.txt",false);
                    
                    
                    //String linea2= buffer3.readLine();
                    BufferedWriter buffer2 = new BufferedWriter(fWriter);
                    
                       // String [] array2 = linea2.split(",");
                        
                        
                            pacientes[contador]= new Paciente(contador,sc.next(),sc.next(),sc.nextInt());
                            buffer2.write(contador + " " + pacientes[contador].getNombre() + " " + pacientes[contador].getApellido() + " " + pacientes[contador].getEdad());
                        
                    
                    contador++;
                    buffer2.close();
                    
                    break;
                    

                }
                catch (IOException e){
                    System.out.println("Error");
                }
                
                try {
                    FileWriter fWriter2 = new FileWriter(file2,false);
                    BufferedWriter buffer5 = new BufferedWriter(fWriter2);
                    buffer5.write(contador);
                    contador++;
                    buffer5.close();
                }
                catch(IOException e){
                    System.out.println("Error 2");
                }
                
                break;
            
            case 2:
                    
                
                try{
                    FileReader fReader1 = new FileReader(file1);
                    BufferedReader buffer1 = new BufferedReader(fReader1);
                    String linea = buffer1.readLine();
                    while(linea!=null){
                        String [] array = linea.split(" ");
                        System.out.println(Arrays.toString(array));
                        pacientes [cont] = new Paciente (Integer.parseInt(array[0]),array[1], array[2], Integer.parseInt(array[3]));
                        cont++;
                        linea=buffer1.readLine();
                    }
        }
        catch (IOException e){
                    System.out.println("Error");
                }
                    
                    for (int i = 0;i<pacientes.length;i++){
                        if(pacientes[i]!=null){
                        System.out.println(pacientes[i]);
                        }
                    }
                
                
                break;
                
            case 3:
              
                try{
                    FileReader fReader3 = new FileReader("sondaje.txt");
                    BufferedReader buffer4 = new BufferedReader(fReader3);
                    String linea3= buffer4.readLine();
                    String [] array3 = linea3.split(" ");
                    System.out.println("Sangraron las muelas: ");
                    for (int i =0;i<array3.length;i++){
                        if(array3[i].contains("+")){
                            System.out.println(array3[i]);
                        }
                }
                    
                }
                catch(IOException e ){
                    System.out.println("Error");
                }
                break;
                
            case 4:
                salir=true;
        }
        
        }while(salir==false);
    }
    
}
