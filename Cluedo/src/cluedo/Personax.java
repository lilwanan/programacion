/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cluedo;

import java.util.Scanner;

/**
 *
 * @author medac
 */
public class Personax {
    
   
    private String lugar;
    private String nombre;
    private boolean asesino;
    private boolean asesinado;
   
    
    public Personax(String nombre, String lugar){
        Scanner sc = new Scanner(System.in);
        this.nombre=nombre;
        this.lugar=lugar;
        boolean asesino=false;
        boolean asesinado=false;
                
        
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    public String getLugar(){
        return this.lugar;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setLugar(String lugar){
        this.lugar=lugar;
    }
    public void setAsesino(boolean asesino){
        this.asesino=asesino;
}
    public boolean asesino(){
        return this.asesino;
    }
    public void setAsesinado(boolean asesinado){
        this.asesinado=asesinado;
}
    public boolean asesinado(){
        return this.asesinado;
    }
    
    public void preguntar(Personax p){
        Scanner sc = new Scanner(System.in);
        int persona;
        persona = sc.nextInt();
        switch(persona){
            case 1: 
                System.out.println("Hola Mayordomo donde estabas");
                p.getLugar();
                
                break;
            case 2: 
                System.out.println("Hola Ama llaves donde estabas");
                p.getLugar();
                break;
            case 3:
                System.out.println("Hola Jardinero donde estabas");
                p.getLugar();
                break;
            case 4:
                System.out.println("Hola cocinero donde estabas");
                p.getLugar();
                break;
            case 5:
                System.out.println("Hola propietario donde estabas");
                p.getLugar();
                break;
            case 6:
                System.out.println("Hola esposa donde estabas");
                p.getLugar();
                break;
                
        }
    }
}
