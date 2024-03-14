/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cluedo;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Cluedo {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Personax p1 = new Personax("Mayordomo", "Hall de Entrada");
        Personax p2 = new Personax("Ama de llaves", "dormitorio");
        Personax p3 = new Personax("Jardinero", "Jardin");
        Personax p4 = new Personax("Cocinero", "Cocina");
        Personax p5 = new Personax("Propietario", "Salon");
        Personax p6= new Personax("Esposa_Propietario", "baño");
        Scanner sc = new Scanner(System.in);
        Personax[]array= {p1,p2,p3,p4,p5,p6};
        String [] array1 = {"Hall Entrada", "dormitorio", "Jardin", "Cocina", "Salon", "baño"};
        int asesino,muerto,lugar;
        boolean atrapado =false;
        asesino = (int) (Math.random()*6);
        muerto = (int) (Math.random()*6);
        lugar = (int) (Math.random()*6);
        array[muerto].setAsesinado(true);
        System.out.println("Ha muerto: " + array[muerto].getNombre());
        array[muerto].setNombre(null);
        array[asesino].setAsesino(true);
        if(!(array[asesino].getLugar().equals(array1[lugar]))){
            array[asesino].setLugar(array1[lugar]);
        }
        System.out.println("Tenemos que averiguar el Asesino realizando una serie de preguntas: ");
        int turno;
        
        do {
            System.out.println("Que quieres hacer?: 1.Intentar Adivinar ; 2.Preguntar"); 
            turno = sc.nextInt();
            switch(turno){
                case 1:
                    break;
                case 2:
                    System.out.println("Donde estabas?");
                    int pregunta;
                    System.out.println("Elige a quien preguntar");
                    pregunta=sc.nextInt();
                    switch(pregunta){
                        case 1: 
                            System.out.println("Hola Mayordomo donde estabas");
                            System.out.println(p1.getLugar());
                            break;
                        case 2: 
                            System.out.println("Hola Ama llaves donde estabas");
                            System.out.println(p2.getLugar());
                            break;
                        case 3:
                            System.out.println("Hola Jardinero donde estabas");
                            System.out.println(p3.getLugar());
                            break;
                        case 4:
                            System.out.println("Hola cocinero donde estabas");
                            System.out.println(p4.getLugar());
                            break;
                        case 5:
                            System.out.println("Hola propietario donde estabas");
                            System.out.println(p5.getLugar());
                            break;
                        case 6:
                            System.out.println("Hola esposa donde estabas");
                            System.out.println(p6.getLugar());
                            break;
                
        
                            
                    }
                    break;
            }
        } while (atrapado == false);
    }
    
 
    
}
