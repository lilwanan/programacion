/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasy;


import java.util.Scanner;
/**
 *
 * @author medac
 */
public class Futbolista {
    private String nombre;
    private String posicion;
    private double valor;

    public Futbolista(String nombre, String posicion, double valor) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.valor = valor;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public double getValor() {
        return valor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void crearJugador(){
        Scanner sc = new Scanner(System.in);
        String nombre=this.nombre;
        String posicion=this.posicion;
        double valor=this.valor;
        System.out.println("Introduce el nombre del Futbolista");
        nombre=sc.next();
       
    }
    
   
   
}
