/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frontera;

import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Person {
    private String dni;
    private String nombre;
   
    
    public Person(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nomhbre: ");
        nombre=sc.next();
        System.out.println("Introduce dni: ");
        dni=sc.next();
    }
    @Override
    public String toString(){
        return "Nombre: " + this.nombre + " " + "Dni: " + this.dni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public String getDni(){
        return this.dni;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
}
