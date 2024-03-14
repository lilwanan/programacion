/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase;


import java.util.Scanner;
/**
 *
 * @author medac
 */
public abstract class Persona {
    
    protected String nombre;
    protected double [] nota;
    protected boolean suspenso = false;
    
    public Persona(String nombre){
        this.nombre=nombre;
        nota=new double[6];
    }
    
    public void insertarNotas(){
        Scanner sc = new Scanner(System.in);
        String [] nombre ={"programacion", "lenguaje", "bd", "fol" , "entornos", "sistemas"};
        for(int i=0;i<nota.length;i++){
            
            System.out.println("cual es la nota de " + nombre[i]);
            nota[i] = sc.nextDouble();
        }
    }
    
    public void estaAprobado(){
        for (int i =0;i<nota.length;i++){
            if(nota[i]<5){
                suspenso=true;
                
            }
        }
        
        
    }

    public String getNombre() {
        return nombre;
    }

    public double[] getNota() {
        return nota;
    }

    public boolean isSuspenso() {
        return suspenso;
    }
    
    
    
    @Override
    public String toString(){
        String respuesta= " ";
        for (int i=0;i<nota.length;i++){
            respuesta=respuesta+nota[i] + " || ";
        }
        return nombre + respuesta;
    }
}
