/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casino;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Ludopata {
    private String nombre;
    private String dni;
    private int fichas;
    private int edad;
    
    public Ludopata(String nombre){
        this.nombre = nombre;
        fichas=100;
    }
    
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    
    public int getFichas(){
        return this.fichas;
    }
    public void setFichas(int fichas){
        this.fichas=fichas;
    }
    
    public void apostar(Ludopata ludopata){
        Scanner sc= new Scanner(System.in);
        int cantidad;
        int v = ludopata.getFichas();
        System.out.println("Cuanto quieres apostar");
        cantidad= sc.nextInt();
        ludopata.setFichas(v-cantidad);
    
}
    public void elegirColor(Ludopata ludopata){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce color, 1. Rojo ; 2. Negro ; 3. Verde");
        int color= sc.nextInt();
        
        switch(color){
            case 1:
                ludopata.apostar(ludopata);
                ludopata.getFichas();
                break;
                
            case 2:
                ludopata.apostar(ludopata);
                ludopata.getFichas();
                break;
                
            case 3:
                ludopata.apostar(ludopata);
                ludopata.getFichas();
                break;
        }
            
    }
}