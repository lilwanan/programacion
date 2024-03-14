/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author medac
 */
public class Persona {
    
    String nombre;
    int edad;
    String dni;
    String email;
    static int id=0;
    
    // este valor estatico es usado unica y exclusivamente para poder asignar un valor que queremos que se mantenga constante
    // pero varie cada vez que accedemos a la clase pero mantenga ese nuevo valor en estático.
    
    
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
    //constructor nuevo copia
    // esto se usa para poder crear una nueva persona con caracteristicas similares y que esten en posiciones de memoria diferente
    // a la hora de realizar un cambio en un objeto.
    public Persona(Persona persona){
        nombre=persona.nombre;
        edad=persona.edad;
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

