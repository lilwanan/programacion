/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battle;


/**
 *
 * @author medac
 */
public class Jugador {
    private String nombre;
    private int vida;
    
    public Jugador(){
        
    }
    public Jugador(String nombre){
        this.nombre = nombre;
        vida=5;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setVida(int vida){
        this.vida=vida;
    }
    
    public int getVida(){
        return this.vida;
    }
    
    public void luchar(Jugador jugador){
       int v = jugador.getVida();
       jugador.setVida(v-1);
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + " " + "Vida: " + vida;
    }
}
