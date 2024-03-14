/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author medac
 */
public class Persona {
    String nombre;
    int edad;
    String dni;
    String email;
    
    
   /* Persona(){
        System.out.println("Has creado una persona");
    }
   /* Persona(String nom, int e){
        nombre=nom;
        edad=e;
    }

    Persona(String nombre,int edad){    // this se usa para referirse a los atributos definidos 
        this.nombre=nombre;             // arriba para referenciarlos en una clase
        this.edad=edad;
    }
   
    
    Persona (String nombre){
        this.nombre=nombre;
        
    } */
    Persona (String nombre, int edad, String dni){
        this.nombre=nombre;
        this.edad=edad;
        this.dni=dni;
    }
    
    boolean mayorEdad(){
        boolean resp;
        if(this.edad<18){
            resp=false;
        } else {
            resp=true;
        }
        return resp;
    }
    
    void saludar(){
        System.out.println(/*this.*/nombre + "Te dice hola");
    }
    void comer(){
        System.out.println("Estoy comiendo");
    }
    void incrementa(int num){
        
        
        this.edad=num+this.edad;
        
    }
    void pintar(){
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.dni);
    }
    
}


